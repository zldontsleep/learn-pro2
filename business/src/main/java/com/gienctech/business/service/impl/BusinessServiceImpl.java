package com.gienctech.business.service.impl;

import com.gienctech.business.client.OrderClient;
import com.gienctech.business.service.BusinessService;
import com.gientcech.order.entiry.OrderInfo;
import com.gientech.account.entiry.UserExtensionInfo;
import com.gientech.account.service.AccountService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BusinessServiceImpl  implements BusinessService {
    @Resource
    private OrderClient orderClient;
    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional
    public int downOrder() {
        orderClient.saveOrder(new OrderInfo());
        accountService.incrementScore(new UserExtensionInfo());
        return 1;
    }
}
