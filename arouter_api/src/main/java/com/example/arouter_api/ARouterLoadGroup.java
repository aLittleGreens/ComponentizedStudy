package com.example.arouter_api;

import java.util.Map;

/**
 * 路由组Group加载数据接口
 * @author LittleGreens <a href="mailto:alittlegreens@foxmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019/9/3 10:23
 */
public interface ARouterLoadGroup {

    /**
     * 加载路由组Group数据，1对1
     * 比如："app", ARouter$$Path$$app.class（实现了ARouterLoadPath接口）
     *
     * @return key:"app", value:"app"分组对应的路由详细对象类
     */
    Map<String,Class<? extends ARouterLoadPath>> loadGroup();
}
