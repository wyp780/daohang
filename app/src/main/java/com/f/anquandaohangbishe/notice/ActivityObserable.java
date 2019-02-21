package com.f.anquandaohangbishe.notice;

/**
 * 由BaseApplication统一管理
 * 由BaseActivity统一 注册 和 注销
 * */
public interface ActivityObserable {

    /**
     * 注册
     * */
    public void register(ActivityObserver o);

    /**
     * 注销
     * */
    public void unRegister(ActivityObserver o);

    /**
     * @param recipient 接收者
     * @param message 信息
     * */
    public void sendMessage(String recipient, Object message);

}
