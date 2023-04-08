package com.gientcech.order.repository;

import com.gientcech.order.entiry.OrderInfo;

public interface OrderRepository {
    int saveOrder(OrderInfo orderInfo);
}
