package com.summer.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Summer
 * @date 2022/3/29 19:19
 */
@SpringBootApplication
@MapperScan("com.summer.order.mapper")
public class OrderServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApp.class,args);
    }
}
