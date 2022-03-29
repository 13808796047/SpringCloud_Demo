package com.summer.userservice.controller;

import com.summer.userservice.pojo.User;
import com.summer.userservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Summer
 * @date 2022/3/29 19:59
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("{id}")
    public User show(@PathVariable Long id){
        return userService.queryUserById(id);
    }
}
