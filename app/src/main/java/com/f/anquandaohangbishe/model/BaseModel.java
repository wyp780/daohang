package com.f.anquandaohangbishe.model;

import java.io.Serializable;

/**
 * */
public class BaseModel implements Serializable {

    public int ret;
    public String desc;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
