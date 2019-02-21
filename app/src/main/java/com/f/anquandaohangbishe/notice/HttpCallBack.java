package com.f.anquandaohangbishe.notice;

/**
 * 网络请求 返回数据 回调
 */
public interface HttpCallBack<T> {

    /**
     */
    void onSuccess(T data);

    /**
     */
    void onComplete();

}
