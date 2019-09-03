package com.example.componentizedstudy.test;

import com.example.annotation.model.RouterBean;
import com.example.arouter_api.ARouterLoadGroup;
import com.example.arouter_api.ARouterLoadPath;
import com.example.module.order.Order_MainActivity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LittleGreens <a href="mailto:alittlegreens@foxmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019/9/3 10:56
 */
public class ARouter$$Path$$Order implements ARouterLoadPath {

    @Override
    public Map<String, RouterBean> loadPath() {
        Map<String, RouterBean> pathMap = new HashMap<>();
        pathMap.put("order/Order_MainActivity", RouterBean.creat(
                RouterBean.Type.ACTIVITY,
                Order_MainActivity.class,
                "order",
                "order/Order_MainActivity"));

//        pathMap.put("order/Order_Detail", RouterBean.creat(
//                RouterBean.Type.ACTIVITY,
//                Order_Detail.class,
//                "order",
//                "order/Order_Detail"));

        return pathMap;
    }
}
