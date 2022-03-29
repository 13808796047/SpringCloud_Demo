package com.summer.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.summer.order.mapper.OrderMapper;
import com.summer.order.pojo.Order;
import com.summer.order.pojo.User;
import com.summer.order.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Summer
 * @date 2022/3/29 19:12
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private RestTemplate restTemplate;

    @Override
    public Order queryOrderById(Long id) {
        // 查询order
        Order order = orderMapper.selectById(id);
        // 利用RestTemplate发起http请求
        String url = "http://UserService/users/" + order.getUserId();
        // 发送http请求
        User user = restTemplate.getForObject(url, User.class);
        // 封装User到Order
        order.setUser(user);
        // 返回订单对象
        return order;
    }
}
