package com.imooc.security.core.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * 验证码配置
 * Created by 钟宇雷 on 2018/11/25.
 */
@Getter
@Setter
public class ValidateCodeProperties {

    // 图片验证码
    private ImageCodeProperties image = new ImageCodeProperties();

    // 短信验证码
    private SmsCodeProperties sms = new SmsCodeProperties();
}
