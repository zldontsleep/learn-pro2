package com.gientech.account.repository;


import com.gientech.account.entiry.UserExtensionInfo;

public interface AccountRepository {
    int incrementScore(UserExtensionInfo info);
}
