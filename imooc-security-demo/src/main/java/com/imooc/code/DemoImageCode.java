package com.imooc.code;

import com.imooc.security.core.validate.core.ImageCode;
import com.imooc.security.core.validate.core.ValidateCodeGenerator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * Created by 钟宇雷 on 2018/11/25.
 */
//@Component("imageCodeGenerator")
public class DemoImageCode implements ValidateCodeGenerator{


    @Override
    public ImageCode createImageCode(ServletWebRequest request) {
        System.out.println("imageCodeGenerator更高级的图形验证码生成代码！");
        return null;
    }
}
