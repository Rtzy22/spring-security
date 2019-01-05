package com.imooc.security.core.validate.core;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * Created by 钟宇雷 on 2018/11/25.
 */
public interface ValidateCodeGenerator {
    ValidateCode create(ServletWebRequest request);
}
