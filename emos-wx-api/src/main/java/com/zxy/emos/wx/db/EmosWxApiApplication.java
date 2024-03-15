package com.zxy.emos.wx.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zxy.emos.wx.db.dao")
public class EmosWxApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(EmosWxApiApplication.class, args);
  }

}
