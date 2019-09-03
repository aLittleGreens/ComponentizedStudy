package com.example.annotation.model;


import javax.lang.model.element.Element;

/**
 * @author LittleGreens <a href="mailto:alittlegreens@foxmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019/9/3 10:31
 */
public class RouterBean {

    private RouterBean() {
    }

    private RouterBean(Builder builder) {
        this.element = builder.element;
        this.group = builder.group;
        this.path = builder.path;
    }

    private RouterBean(Type type, Class<?> clazz, String group, String path) {
        this.type = type;
        this.clazz = clazz;
        this.group = group;
        this.path = path;
    }

    public static RouterBean creat(Type type, Class<?> clazz, String group, String path) {
        return new RouterBean(type, clazz, group, path);
    }


    public enum Type {
        ACTIVITY
    }

    private Type type;
    //类节点
    private Element element;
    // 被ARouter注解的类
    private Class<?> clazz;
    private String group;
    private String path;

    public Type getType() {
        return type;
    }

    public Element getElement() {
        return element;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public String getGroup() {
        return group;
    }

    public String getPath() {
        return path;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static class Builder {

        private Element element;
        private String group;
        private String path;

        public Builder setElement(Element element) {
            this.element = element;
            return this;
        }


        public Builder setGroup(String group) {
            this.group = group;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        // 参数校验，初始化
        public RouterBean build() {
            if (path == null || path.length() == 0) {
                throw new IllegalArgumentException("path 必填");
            }
            return new RouterBean(this);
        }
    }

}
