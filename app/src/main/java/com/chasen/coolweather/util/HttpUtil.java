package com.chasen.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by dayicklp.
 *
 * 网络工具类
 */

//发送网络请求 传入一个请求地址，注册一个回调处理服务器响应

public class HttpUtil {

    public static void sendOkHeepRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
