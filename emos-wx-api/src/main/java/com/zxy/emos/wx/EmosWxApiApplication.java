package com.zxy.emos.wx;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author zxy
 */
@SpringBootApplication
@MapperScan("com.zxy.emos.wx.db.dao")
@ServletComponentScan
public class EmosWxApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(EmosWxApiApplication.class, args);
  }

}
