package com.imooc.security.core.validate.core;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * 校验码处理器， 封装不同校验码的处理逻辑
 * Created by zhongyulei on 2018/12/16.
 */
public interface ValidateCodeProcessor {

    /**
     * 验证码放入session时的前缀
     */
    String SESSION_KEY_PREFIX = "SESSION_KEY_FOR_CODE_";

    /**
     * 创建验证码
     * @param request
     * @throws Exception
     */
    void create(ServletWebRequest request) throws Exception;

    /**
     * 检验验证码
     * @param request
     * @throws Exception
     */
    void validate(ServletWebRequest request) throws Exception;
}
