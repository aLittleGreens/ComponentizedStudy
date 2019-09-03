package com.example.arouter_api;


import com.example.annotation.model.RouterBean;

import java.util.Map;

/**
 * @author LittleGreens <a href="mailto:alittlegreens@foxmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019/9/3 10:25
 */
public interface ARouterLoadPath {

    Map<String, RouterBean> loadPath();
}
