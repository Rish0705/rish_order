package com.rish.rish_order.controller;

import com.rish.rish_order.domain.res.OrderRes;
import com.rish.rish_order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 分配的权限：1.1
     * @return
     */
    public Baseres<OrderRes> creatWorkerOrder(){

    }
}
