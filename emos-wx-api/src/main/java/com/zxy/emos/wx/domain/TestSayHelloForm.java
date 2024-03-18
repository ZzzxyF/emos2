package com.zxy.emos.wx.domain;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxy
 */
@ApiModel
@Data
public class TestSayHelloForm {

   @NotBlank
   @Pattern(regexp = "^[\\u4e00-\\u9fa5]{2,15}$")
   @ApiModelProperty("姓名")
   private String name;

}
