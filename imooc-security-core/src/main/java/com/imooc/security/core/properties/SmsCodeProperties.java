package com.imooc.security.core.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * 短信验证码配置
 * Created by 钟宇雷 on 2018/11/25.
 */
@Getter
@Setter
public class SmsCodeProperties {

    private int length = 6;
    private int expireIn = 60;

    private String url;
}
