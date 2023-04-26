package com.woniuxy.controller;

import com.woniuxy.entity.User;
import com.woniuxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //等价于 @Controller + @ResponseBody
@RequestMapping("user")
public class UserController {


    @Autowired
    UserService userService;


    @RequestMapping("all")
    public List<User> all(){
        return userService.list();
    }


}
