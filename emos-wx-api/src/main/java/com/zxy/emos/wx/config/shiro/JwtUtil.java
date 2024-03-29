package com.zxy.emos.wx.config.shiro;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import com.zxy.emos.wx.db.exception.EmosException;
import java.util.Date;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * jwt工具类
 */
@Component
public class JwtUtil {

  //密钥
  @Value("${emos.jwt.secret}")
  private String secret;

  //过期时间（天）
  @Value("${emos.jwt.expire}")
  private int expire;

  public String createToken(int userId) {
    Date date = DateUtil.offset(new Date(), DateField.DAY_OF_YEAR,
        expire).toJdkDate();
    //创建加密算法对象
    Algorithm algorithm = Algorithm.HMAC256(secret);
    JWTCreator.Builder builder = JWT.create();
    String token = builder.withClaim("userId",
        userId).withExpiresAt(date).sign(algorithm);
    return token;
  }

  public int getUserId(String token) {
    try {
      DecodedJWT jwt = JWT.decode(token);
      return jwt.getClaim("userId").asInt();
    } catch (Exception e) {
      throw new EmosException("令牌无效");
    }
  }

  public void verifierToken(String token) {
    Algorithm algorithm = Algorithm.HMAC256(secret); //创建加密算法对象
    JWTVerifier verifier = JWT.require(algorithm).build();
    verifier.verify(token);
  }
}
