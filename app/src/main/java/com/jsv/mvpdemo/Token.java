package com.jsv.mvpdemo;

/* 数据请求标识类，定义了项目中所有的数据请求。 */

/*  新建一个Model并继承BaseModel，完成具体的数据请求。
    在Token中添加对用的Model包名+类名。注意写好注释，方便以后查阅。*/

public class Token {
    // 包名
    private static final String PACKAGE_NAME = "com.jsv.mvpdemo.";

    // 具体Model
    public static final String API_USER_DATA = PACKAGE_NAME + "UserDataModel";
}
