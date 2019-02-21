package com.f.anquandaohangbishe.base;

import android.app.Application;

import com.f.anquandaohangbishe.notice.ActivityObserable;
import com.f.anquandaohangbishe.notice.ActivityObserver;
import com.f.mylibrary.utils.ActivityUtil;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 */
public class BaseApplication extends Application implements ActivityObserable {

    private static BaseApplication application;
    private List<ActivityObserver> list;
    private OkHttpClient client;

    public static BaseApplication getInstance() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;

        list = new ArrayList<>();

        ActivityUtil.initListener(this);

        initOkhttpClient();
    }

    @Override
    public void register(ActivityObserver o) {
        list.add(o);
    }

    @Override
    public void unRegister(ActivityObserver o) {
        if (!list.isEmpty()) {
            list.remove(o);
        }
    }

    @Override
    public void sendMessage(String recipient, Object message) {
        for (int i = 0; i < list.size(); i++) {
            ActivityObserver observer = list.get(i);
            observer.receiveMessage(recipient, message);
        }
    }

    /**
     * 初始化OkhttpClient
     */
    private void initOkhttpClient() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();
    }

    /**
     * 获取client
     */
    public OkHttpClient getClient() {
        return client;
    }
}
