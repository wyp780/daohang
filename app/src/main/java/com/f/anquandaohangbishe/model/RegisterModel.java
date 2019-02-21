package com.f.anquandaohangbishe.model;

public class RegisterModel extends BaseModel{

    private String user_id;
    private String token;
    private boolean bfilluserinfo;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isBfilluserinfo() {
        return bfilluserinfo;
    }

    public void setBfilluserinfo(boolean bfilluserinfo) {
        this.bfilluserinfo = bfilluserinfo;
    }

}
