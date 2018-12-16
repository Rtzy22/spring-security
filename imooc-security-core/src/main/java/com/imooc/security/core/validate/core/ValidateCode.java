package com.imooc.security.core.validate.core;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Created by zhongyulei on 2018/12/16.
 */
@Getter
@Setter
public class ValidateCode {

    private String code;

    private LocalDateTime expireTime;

    public ValidateCode(String code, int expireIn) {
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public ValidateCode(String code, LocalDateTime expireTime) {
        this.code = code;
        this.expireTime = expireTime;
    }

    public boolean isExpried() {
        return LocalDateTime.now().isAfter(expireTime);
    }
}
