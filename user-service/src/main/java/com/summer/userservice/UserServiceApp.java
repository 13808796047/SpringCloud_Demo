package com.summer.userservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Summer
 * @date 2022/3/29 19:50
 */
@SpringBootApplication
@MapperScan("com.summer.userservice.mapper")
public class UserServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApp.class,args);
    }
}
