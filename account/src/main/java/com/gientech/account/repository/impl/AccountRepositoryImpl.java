package com.gientech.account.repository.impl;

import com.gientech.account.entiry.UserExtensionInfo;
import com.gientech.account.repository.AccountRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
    @Override
    public int incrementScore(UserExtensionInfo info) {
        // 增加用户积分

        return 1;
    }
}
