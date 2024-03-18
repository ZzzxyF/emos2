package com.zxy.emos.wx.config.shiro;

import org.springframework.stereotype.Component;

/**
 * @author zxy
 */
@Component
public class ThreadLocalToken {

  private ThreadLocal local = new ThreadLocal();

  public void setToken(String token) {
    local.set(token);
  }

  public String getToken() {
    return (String) local.get();
  }

  public void clear() {
    local.remove();
  }

}
