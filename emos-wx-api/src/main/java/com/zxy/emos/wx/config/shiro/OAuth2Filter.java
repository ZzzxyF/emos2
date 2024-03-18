package com.zxy.emos.wx.config.shiro;

import io.lettuce.core.dynamic.annotation.Value;
import java.io.IOException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 验证请求是否携带token
 */
@Component
public class OAuth2Filter extends AuthenticatingFilter {

  @Autowired
  private ThreadLocalToken threadLocalToken;
  //@Value("${emos.jwt.cache-expire}")
  //private int cacheExpire;
  @Autowired
  private JwtUtil jwtUtil;
  @Autowired
  private RedisTemplate redisTemplate;


  @Override
  protected AuthenticationToken createToken(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
    //从请求头或请求参数获取token，放入验证的token
    String token = getRequestToken((HttpServletRequest) servletRequest);
    if (StringUtils.isBlank(token)) {
      return null;
    }
    return new OAuth2Token(token);
  }

  /**
   * 判断方法是否需要验证token,返回true，说明直接访问controller,
   * 返回false需要走onAccessDenied，判断token是否正常
   * @param request
   * @param response
   * @param mappedValue
   * @return
   */
  @Override
  protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
    HttpServletRequest req = (HttpServletRequest) request;
    // Ajax提交application/json数据的时候，会先发出Options请求
    // 这里要放行Options请求，不需要Shiro处理
    if (req.getMethod().equals(RequestMethod.OPTIONS.name())) {
      return true;
    }
    // 除了Options请求之外，所有请求都要被Shiro处理
    return false;
  }

  /**
   * @param request
   * @param response
   * @return
   * @throws Exception
   */
  @Override
  protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
    HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse resp = (HttpServletResponse) response;
    resp.setHeader("Content-Type", "text/html;charset=UTF-8");
    //允许跨域请求
    resp.setHeader("Access-Control-Allow-Credentials", "true");
    resp.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
    threadLocalToken.clear();
    String token=getRequestToken(req);
    if(StringUtils.isBlank(token)){
      resp.setStatus(HttpStatus.SC_UNAUTHORIZED);
      resp.getWriter().println("无效的令牌");
      return false;
    }
    //验证令牌
    try {
      jwtUtil.verifierToken(token);
    } catch (Exception e) {
      e.printStackTrace();
      //客户端令牌过期，验证redis中是否存在缓存的token
      if(redisTemplate.hasKey(token)){
        redisTemplate.delete(token);
        int userId=jwtUtil.getUserId(token);
        //创建新的token
        String reToken =jwtUtil.createToken(userId);
        redisTemplate.opsForValue().set(userId,reToken);
        threadLocalToken.setToken(reToken);
      }else{
        resp.setStatus(HttpStatus.SC_UNAUTHORIZED);
        resp.getWriter().println("令牌已过期");
        return false;
      }
    }
    //执行登录
    boolean loginStatus=executeLogin(req,response);
    return loginStatus;
  }

  /**
   * 登录失败信息设置
   * @param token
   * @param e
   * @param request
   * @param response
   * @return
   */
  @SneakyThrows
  @Override
  protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
    HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse resp = (HttpServletResponse) response;
    resp.setHeader("Content-Type", "text/html;charset=UTF-8");
    //允许跨域请求
    resp.setHeader("Access-Control-Allow-Credentials", "true");
    resp.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
    try {
      resp.getWriter().print(e.getMessage());
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return false;
  }


  private String getRequestToken(HttpServletRequest servletRequest) {
    String token = servletRequest.getHeader("token");
    if (StringUtils.isBlank(token)) {
      token = servletRequest.getParameter("token");
    }
    return token;
  }

}
