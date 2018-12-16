package com.imooc.security.core.properties;

/**
 * Created by 钟宇雷 on 2018/11/4.
 */
public interface SecurityConstants {

    /**
     *  当请求需要身份认证时，默认跳转的url
     */
    public static final String DEFAULT_UNAUTHENTICATION_URL = "/authentication/require";

    /**
     *  默认登录页面
     */
    public static final String DEFAULT_LOGIN_PAGE_URL = "/imooc-signIn.html";

}
