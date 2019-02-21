package com.f.anquandaohangbishe.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 */
public class SharedPreferencesUtil {

    public static void clearSharedPreferencesInfo(Context context, String itemName) {
        SharedPreferences sp = context.getSharedPreferences(itemName, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.clear().apply();
    }

    public static void setUserId(Context context, String userId) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("userId", userId).commit();
    }

    public static String getUserId(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getString("userId", "");
    }

    public static void setToken(Context context, String token) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("token", token).commit();
    }

    public static String getToken(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getString("token", "");
    }

    public static void setBfilluserinfo(Context context, boolean bfilluserinfo) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean("bfilluserinfo", bfilluserinfo).commit();
    }

    public static boolean getBfilluserinfo(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getBoolean("bfilluserinfo", false);
    }

    public static void setMobile(Context context, String mobile) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("mobile", mobile).commit();
    }

    public static String getMobile(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getString("mobile", "");
    }

    public static void setPassword(Context context, String password) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("password", password).commit();
    }

    public static String getPassword(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getString("password", "");
    }

    public static void setDefaultIdentity(Context context, int defaultIdentity) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("defaultIdentity", defaultIdentity).commit();
    }

    public static int getDefaultIdentity(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getInt("defaultIdentity", 0);
    }

    public static void setNickname(Context context, String nickname) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("nickname", nickname).commit();
    }

    public static String getNickname(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getString("nickname", "null");
    }

    public static void setSchoolname(Context context, String schoolname) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("schoolname", schoolname).commit();
    }

    public static String getSchoolname(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getString("schoolname", "null");
    }

    public static void setClassname(Context context, String classname) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("classname", classname).commit();
    }

    public static String getClassname(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getString("classname", "null");
    }

    public static void setChildId(Context context, String childId) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("childId", childId).commit();
    }

    public static String getChildId(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getString("childId", "null");
    }

    public static void setClassId(Context context, String classId) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("classId", classId).commit();
    }

    public static String getClassId(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getString("classId", "null");
    }

    public static void setSchoolId(Context context, String schoolId) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("schoolId", schoolId).commit();
    }

    public static String getSchoolId(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getString("schoolId", "null");
    }

    public static void setHaveUserInfo(Context context, boolean haveUserInfo) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean("haveUserInfo", haveUserInfo).commit();
    }

    public static boolean getHaveUserInfo(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getBoolean("haveUserInfo", false);
    }

    public static void setHead(Context context, String head) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("head", head).commit();
    }

    public static String getHead(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getString("head", "");
    }

    public static void setSex(Context context, int sex) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("sex", sex).commit();
    }

    public static int getSex(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getInt("sex", 1);
    }

    public static void setSignature(Context context, String signature) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("signature", signature).commit();
    }

    public static String getSignature(Context context) {
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        return sp.getString("signature", "");
    }
}
