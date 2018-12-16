package com.imooc.security.core.validate.core;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by 钟宇雷 on 2018/11/19.
 */
public class ValidateCodeException extends AuthenticationException {

    private static final long serialVersionUID = 1301486625380169444L;

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
