package com.zxy.emos.wx.config.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

/**
 * @author zxy
 */
@Component
public class OAuth2Realm  extends AuthorizingRealm {

  /**
   * 授权
   * @param principalCollection
   * @return
   */
  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
     //TODO 查询用户的权限列表
     //TODO 把权限列表添加到info对象中
     return info;
  }

  //认证
  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
    //TODO 从令牌中获取userId，然后检测该账户是否被冻结。
     SimpleAuthenticationInfo info = new SimpleAuthenticationInfo();
     //TODO 往info对象中添加用户信息、Token字符串
     return info;
  }
}
