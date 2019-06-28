package com.jsv.mvpdemo;


import java.util.Map;

/* 所有Model的顶级父类，负责对外提供数据请求标准，对内为所有Model提供请求的底层支持。 */
public abstract class BaseModel<T> {

    protected String[] mParams;

    public BaseModel params(String... args) {
        mParams = args;
        return this;
    }

    //添加Callback并执行数据请求
    //具体的数据请求由子类实现
    public abstract void execute(Callback<T> callback);

    // 执行Get网络请求，此类看需求由自己选择写与不写
    protected void requestGetAPI(String url, Callback<T> callback) {
        //这里写具体的网络请求
    }

    // 执行Post网络请求，此类看需求由自己选择写与不写
    protected void requestPostAPI(String url, Map params, Callback<T> callback) {
        //这里写具体的网络请求
    }
}
