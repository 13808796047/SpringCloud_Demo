package com.summer.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.summer.order.pojo.Order;
import com.summer.order.service.OrderService;

import javax.annotation.Resource;

/**
 * @author Summer
 * @date 2022/3/29 19:16
 */
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Resource
    private OrderService orderService;
    @GetMapping("{id}")
    public Order show(@PathVariable Long id){
        return orderService.queryOrderById(id);
    }
}
