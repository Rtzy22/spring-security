package com.imooc.security.core.properties;

import lombok.Data;

/**
 * Created by 钟宇雷 on 2018/11/4.
 */
@Data
public class BrowserProperties {
    private String signUpUrl = "/imooc-signUp.html";

    private String loginPage = SecurityConstants.DEFAULT_LOGIN_PAGE_URL;

    private LoginType loginType = LoginType.JSON;

    private int rememberMeSeconds = 3600;

}
