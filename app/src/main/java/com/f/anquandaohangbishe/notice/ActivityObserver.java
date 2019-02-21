package com.f.anquandaohangbishe.notice;

public interface ActivityObserver {

    /**
     * @param recipient 接收者
     * @param message 信息
     * */
    public void receiveMessage(String recipient, Object message);

}
