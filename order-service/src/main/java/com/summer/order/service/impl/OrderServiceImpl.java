package com.summer.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.summer.order.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import com.summer.order.pojo.Order;
import com.summer.order.service.OrderService;

import javax.annotation.Resource;

/**
 * @author Summer
 * @date 2022/3/29 19:12
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Override
    public Order queryOrderById(Long id) {
        return orderMapper.selectById(id) ;
    }
}
