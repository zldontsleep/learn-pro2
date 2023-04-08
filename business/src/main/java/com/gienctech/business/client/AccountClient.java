package com.gienctech.business.client;

import com.gientech.account.entiry.UserExtensionInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "accountClient")
public interface AccountClient {

    @PostMapping("/account/incre/score")
    int incrementScore(UserExtensionInfo userExtensionInfo);
}
