package com.example.common;

/**
 * @author Created by LittleGreens
 * @data on 2019/8/29
 * @describe 路径的存储（公共基础库中，所有子模块都可以调用）、用于模块间的跳转
 * path："person/PersonActivity"
 * class: "PersonActivity.class"
 */
public class PathBean {

    private String path;
    private Class clazz;

    public PathBean() {
    }

    public PathBean(String path, Class clazz) {
        this.path = path;
        this.clazz = clazz;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}
