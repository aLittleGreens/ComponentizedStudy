package com.example.arouter_api;

import java.util.Map;

/**
 * 路由组
 * @author LittleGreens <a href="mailto:alittlegreens@foxmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019/9/3 10:23
 */
public interface ARouterLoadGroup {

    Map<String,Class<? extends ARouterLoadPath>> loadGroup();
}
