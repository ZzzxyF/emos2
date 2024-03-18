package com.zxy.emos.wx.controller;

import com.zxy.emos.wx.common.util.R;
import com.zxy.emos.wx.domain.TestSayHelloForm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxy
 */
@RestController
@RequestMapping("/test")
@Api("测试web接口")
public class TestController {

  @PostMapping("/sayHello")
  @ApiOperation("最简单的测试方法")
  public R sayHello(@Valid @RequestBody TestSayHelloForm form){
     return R.ok().put("message","Hello,"+form.getName());
  }

}
