package com.example.arouter_api;


import com.example.annotation.model.RouterBean;

import java.util.Map;

/**
 * 路由组Group对应的详细Path加载数据接口
 * 比如：app分组对应有哪些类需要加载
 * @author LittleGreens <a href="mailto:alittlegreens@foxmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019/9/3 10:25
 */
public interface ARouterLoadPath {
    /**
     * 加载路由组Group中的Path详细数据
     * 比如："app"分组下有这些信息： 1对多
     *
     * @return key:"/app/MainActivity", value:MainActivity信息封装到RouterBean对象中
     */
    Map<String, RouterBean> loadPath();
}
