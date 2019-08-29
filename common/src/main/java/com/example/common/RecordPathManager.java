package com.example.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Created by LittleGreens
 * @data on 2019/8/29
 * @describe TODO
 */
public class RecordPathManager {
    // key:"order"组     value:order子模块下，对应所有的Activity路径信息
    private static Map<String, List<PathBean>> groupMap = new HashMap<>();

    /**
     * 将路径信息加入全局Map
     *
     * @param groupName 组名，如："personal"
     * @param pathName  路劲名，如："Personal_MainActivity"
     * @param clazz     类对象，如：Personal_MainActivity.class
     */
    public static void putGroup(String groupName, String pathName, Class<?> clazz) {
        List<PathBean> pathBeans = groupMap.get(groupName);
        if (pathBeans == null) {
            pathBeans = new ArrayList<>();
            PathBean pathBean = new PathBean(pathName, clazz);
            pathBeans.add(pathBean);
            groupMap.put(groupName, pathBeans);
        } else {
            if (!pathBeans.contains(pathName)) {
                pathBeans.add(new PathBean(pathName, clazz));
            }
        }
    }

    /**
     * 根据组名和路径名获取类对象，达到跳转目的
     *
     * @param groupName 组名
     * @param pathName  路径名
     * @return 跳转目标的class类对象
     */
    public static Class<?> getTargetClass(String groupName, String pathName) {
        List<PathBean> pathBeans = groupMap.get(groupName);
        if (pathBeans == null) {
            return null;
        } else {
            for (PathBean pathBean :
                    pathBeans) {
                if (pathBean.getPath().equalsIgnoreCase(pathName)) {
                    return pathBean.getClazz();
                }
            }
        }
        return null;
    }
}
