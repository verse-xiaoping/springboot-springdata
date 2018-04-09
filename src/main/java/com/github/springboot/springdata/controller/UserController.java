package com.github.springboot.springdata.controller;

import com.github.springboot.springdata.entity.User;
import com.github.springboot.springdata.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by verse on 2018/4/9.
 */
@RestController
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/findall")
    public List<User> findall(){
        return userService.findAll(1);
    }
}
