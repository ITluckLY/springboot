package com.springboot_c.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 鲁先生
 * @create 2020-06-07 12:54
 **/
//在swagger 添加中文注释
@ApiModel("用户实体类")
public class User {

  @ApiModelProperty("用户名")
  public String username;
  @ApiModelProperty("密码")
  public String  password;

}
