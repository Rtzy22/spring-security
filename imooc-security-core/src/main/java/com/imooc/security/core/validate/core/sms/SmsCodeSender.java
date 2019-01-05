package com.imooc.security.core.validate.core.sms;

/**
 * Created by zhongyulei on 2018/12/23.
 */
public interface SmsCodeSender {

    void send(String mobile, String code);
}
