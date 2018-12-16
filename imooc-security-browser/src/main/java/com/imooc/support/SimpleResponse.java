package com.imooc.support;

import lombok.Data;

/**
 * Created by 钟宇雷 on 2018/11/4.
 */
@Data
public class SimpleResponse {
    private String content;

    public SimpleResponse(String content) {
        this.content = content;
    }
}
