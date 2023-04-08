package com.gientcech.order.service.impl;

import com.gientcech.order.entiry.OrderInfo;
import com.gientcech.order.repository.OrderRepository;
import com.gientcech.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderRepository orderRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int saveOrder(OrderInfo orderInfo) {
        return orderRepository.saveOrder(orderInfo);
    }
}
