package com.rish.rish_order.service;

import com.rish.rish_order.mapper.OrderMapper;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderMapper orderMapper;

    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }



}
