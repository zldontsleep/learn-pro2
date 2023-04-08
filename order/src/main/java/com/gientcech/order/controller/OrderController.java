package com.gientcech.order.controller;

import com.gientcech.order.entiry.OrderInfo;
import com.gientcech.order.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @PostMapping("/save")
    public int saveOrder(OrderInfo orderInfo) {
        return orderService.saveOrder(orderInfo);
    }
}
