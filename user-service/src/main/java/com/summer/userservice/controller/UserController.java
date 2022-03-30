package com.summer.userservice.controller;

import com.summer.userservice.config.PatternProperties;
import com.summer.userservice.pojo.User;
import com.summer.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Summer
 * @date 2022/3/29 19:59
 */
@RestController
@RequestMapping("/users")
//@RefreshScope
public class UserController {
    @Resource
    private UserService userService;

    //    @Value("${pattern.dateformat}")
//    private String dateformat;
    @Autowired
    private PatternProperties properties;

    @GetMapping("prop")
    public PatternProperties properties() {
        return properties;
    }

    @GetMapping("now")
    public String now() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(properties.getDateformat()));
    }

    @GetMapping("{id}")
    public User show(@PathVariable Long id) {
        return userService.queryUserById(id);
    }
}
