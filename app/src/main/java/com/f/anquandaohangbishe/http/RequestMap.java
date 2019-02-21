package com.f.anquandaohangbishe.http;

import android.content.Context;
import android.util.Base64;

import com.f.anquandaohangbishe.utils.SharedPreferencesUtil;
import com.f.mylibrary.utils.APKVersionCodeUtil;
import com.f.mylibrary.utils.MD5Util;
import com.f.mylibrary.utils.SystemUtil;

import java.util.HashMap;

/**
 * */
public class RequestMap extends HashMap<String, Object> {

    /**
     * 通常情况
     * */
    public RequestMap(Context context) {
        init(context);
    }

    /**
     * 有时候sp里还没保存手机号，需要从页面获取手机号，就把手机号传进来
     * */
    public RequestMap(Context context , String mobile) {
        init(context);
        put("mobile", mobile);
    }

    private void init(Context context) {
        long time = System.currentTimeMillis();
        put("time", time);
        put("key", Base64.encodeToString(MD5Util.stringToMD5(SharedPreferencesUtil.getUserId(context)
                + time + SharedPreferencesUtil.getMobile(context) + RetrofitFactory.appSecretKey).getBytes(), Base64.NO_WRAP));
        put("user_id", SharedPreferencesUtil.getUserId(context));
        put("token", SharedPreferencesUtil.getToken(context));
        put("client_type", 1);
        put("device_model", SystemUtil.getDeviceBrand() + SystemUtil.getSystemModel());
        put("device_sys", SystemUtil.getSystemVersion());
        put("app_ver", APKVersionCodeUtil.getVersionCode(context));
        put("mobile", SharedPreferencesUtil.getMobile(context));
        put("device_id", MD5Util.stringToMD5(SystemUtil.getUniquePsuedoID()));
    }

}
