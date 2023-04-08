package com.gienctech.business.client;

import com.gientcech.order.entiry.OrderInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "orderClient")
public interface OrderClient {

    @PostMapping("/order/save")
    int saveOrder(OrderInfo orderInfo);
}
