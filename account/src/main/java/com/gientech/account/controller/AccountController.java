package com.gientech.account.controller;

import com.gientech.account.entiry.UserExtensionInfo;
import com.gientech.account.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping("/incre/score")
    public int incrementScore(UserExtensionInfo userExtensionInfo) {
        return accountService.incrementScore(userExtensionInfo);
    }
}
