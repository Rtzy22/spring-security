package com.imooc.security.core.validate.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by zhongyulei on 2018/12/23.
 */
@Component
public class ValidateCodeProcessorHolder {

    @Autowired
    private Map<String, ValidateCodeProcessor> validateCodeProcessors;

    public ValidateCodeProcessor findValidateCodeProcessor(ValidateCodeType type) {
        return findValidateCodeProcessor(type.toString());
    }

    public ValidateCodeProcessor findValidateCodeProcessor(String type) {
        String processorName = type.toLowerCase() + ValidateCodeProcessor.class.getSimpleName();
        ValidateCodeProcessor processor = validateCodeProcessors.get(processorName);
        if (processor == null) {
            throw new ValidateCodeException("验证码处理器" + processorName + "不存在");
        }
        return processor;
    }

}
