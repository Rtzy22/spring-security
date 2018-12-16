package com.imooc.security.core.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * 图片 4位长度的验证码
 * Created by 钟宇雷 on 2018/11/25.
 */
@Getter
@Setter
public class ImageCodeProperties extends SmsCodeProperties{
    public ImageCodeProperties() {
        setLength(4);
    }

    private int width = 67;
    private int height = 23;
}
