package com.f.anquandaohangbishe.http;


import com.f.anquandaohangbishe.BuildConfig;
import com.f.anquandaohangbishe.base.BaseApplication;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {

    //服务器头字段
    public static final String baseUrl = BuildConfig.BASE_URL;
    public static final String appSecretKey = BuildConfig.AppSecretKey;

    public static URL Build() {
        //LoadingDialogUtil.show(RegisterActivityUtil.nowActivity());
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(BaseApplication.getInstance().getClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        URL iurl = retrofit.create(URL.class);
        return iurl;
    }

}
