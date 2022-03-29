package com.summer.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.summer.order.pojo.Order;

/**
 * @author Summer
 * @date 2022/3/29 19:10
 */
public interface OrderService extends IService<Order> {
    Order queryOrderById(Long id);
}
