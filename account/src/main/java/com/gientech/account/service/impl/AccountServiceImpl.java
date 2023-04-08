package com.gientech.account.service.impl;

import com.gientech.account.entiry.UserExtensionInfo;
import com.gientech.account.repository.AccountRepository;
import com.gientech.account.service.AccountService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountRepository accountRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int incrementScore(UserExtensionInfo userExtensionInfo) {
        return accountRepository.incrementScore(userExtensionInfo);
    }
}
