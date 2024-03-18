package com.zxy.emos.wx.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class XssFilter implements Filter {

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    XssHttpServletRequestWrapper servletRequestWrapper=new XssHttpServletRequestWrapper((HttpServletRequest) servletRequest);
    filterChain.doFilter(servletRequest,servletResponse);
  }
}
