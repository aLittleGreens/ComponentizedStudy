package com.example.componentizedstudy.test;

import com.example.arouter_api.ARouterLoadGroup;
import com.example.arouter_api.ARouterLoadPath;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LittleGreens <a href="mailto:alittlegreens@foxmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019/9/3 10:56
 */
public class ARouter$$Group$$Order implements ARouterLoadGroup {
    @Override
    public Map<String, Class<? extends ARouterLoadPath>> loadGroup() {
        Map<String, Class<? extends ARouterLoadPath>> groupMap = new HashMap<>();
        groupMap.put("order", ARouter$$Path$$Order.class);
        return groupMap;
    }
}
