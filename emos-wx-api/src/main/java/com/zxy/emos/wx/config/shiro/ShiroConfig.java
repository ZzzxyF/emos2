package com.zxy.emos.wx.config.shiro;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.servlet.Filter;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zxy
 */
@Configuration
public class ShiroConfig {

  @Bean("securityManager")
  public SecurityManager securityManager(OAuth2Realm realm) {
    DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
    securityManager.setRealm(realm);
    securityManager.setRememberMeManager(null);
    return securityManager;
  }

  @Bean("shiroFilter")
  public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager, OAuth2Filter filter) {
    ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
    shiroFilterFactoryBean.setSecurityManager(securityManager);
    //set shiro过滤
    Map<String, Filter> filterHashMap = Maps.newHashMap();
    filterHashMap.put("oauth2", filter);
    shiroFilterFactoryBean.setFilters(filterHashMap);
    Map<String, String> map = Maps.newHashMap();
    map.put("", "");
    map.put("/webjars/**", "anon");
    map.put("/druid/**", "anon");
    map.put("/app/**", "anon");
    map.put("/sys/login", "anon");
    map.put("/swagger/**", "anon");
    map.put("/v2/api-docs", "anon");
    map.put("/swagger-ui.html", "anon");
    map.put("/swagger-resources/**", "anon");
    map.put("/captcha.jpg", "anon");
    map.put("/user/register", "anon");
    map.put("/user/login", "anon");
    map.put("/test/**", "anon");
    map.put("/**", "oauth2");
    shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
    return shiroFilterFactoryBean;
  }


}
