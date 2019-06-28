package com.jsv.mvpdemo;


import android.os.Handler;

public class UserDataModel extends BaseModel<String> {

    @Override
    public void execute(final Callback<String> callback) {
        // 模拟网络请求耗时操作
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // mParams 是从父类得到的请求参数
                switch (mParams[0]){
                    case "normal":
                        callback.onSuccess("根据参数"+mParams[0]+"的请求网络数据成功");
                        break;

                    case "failure":
                        callback.onFailure("请求失败：参数有误");
                        break;

                    case "error":
                        callback.onError();
                        break;
                }
                callback.onComplete();
            }
        },2000);
    }

//    @Override
//    protected void requestGetAPI(String url, Callback<String> callback) {
//        super.requestGetAPI(url, callback);
//    }
}
