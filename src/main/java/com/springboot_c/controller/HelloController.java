package com.springboot_c.controller;

import com.springboot_c.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 鲁先生
 * @create 2020-06-06 17:40
 **/
@RestController
public class HelloController {

  @GetMapping("/hello")
  public String   hello(){
    return "hello";
  }

  @ApiOperation("login 控制")
  @GetMapping("/login")
  public String login(@ApiParam("用户名") String username){

    return "hello"+username;
  }


  @PostMapping("/user")
  public User user(){

    return new User();
  }



}
