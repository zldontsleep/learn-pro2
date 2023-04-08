package com.gienctech.business.controller;

import com.gienctech.business.service.BusinessService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/business")
public class BusinessController {
    @Resource
    private BusinessService businessService;

    @PostMapping("/down/order")
    public int downOrder() {
        return businessService.downOrder();
    }
}
