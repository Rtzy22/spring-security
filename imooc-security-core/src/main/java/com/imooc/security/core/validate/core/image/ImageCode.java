package com.imooc.security.core.validate.core.image;

import com.imooc.security.core.validate.core.ValidateCode;
import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 * Created by 钟宇雷 on 2018/11/18.
 */
@Getter
@Setter
public class ImageCode extends ValidateCode{

    private BufferedImage image;


    public ImageCode(BufferedImage image, String code, int expireIn) {
        super(code, expireIn);
        this.image = image;
    }

    public ImageCode(BufferedImage image, String code, LocalDateTime expireTime) {
        super(code, expireTime);
        this.image = image;
    }
}
