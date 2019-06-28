package com.jsv.mvpdemo;


/* 数据层顶级入口，项目中所有数据都由该类流入和流出，负责分发所有的请求数据。 */
public class DataModel {

    public static BaseModel request(String token){

        // 声明一个空的BaseModel
        BaseModel model = null;

        try {
            //利用反射机制获得对应Model对象的引用
            model = (BaseModel)Class.forName(token).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return model;
    }

    public static <T extends BaseModel> T request1(Class<T> cls) {

        // 声明一个空的BaseModel
        T model = null;

        //利用反射机制获得对应Model对象的引用
        try {
            //利用反射机制获得对应Model对象的引用
            model = (T) cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return model;
    }
}
