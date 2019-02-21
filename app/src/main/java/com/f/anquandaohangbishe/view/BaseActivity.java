package com.f.anquandaohangbishe.view;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.f.anquandaohangbishe.base.BaseApplication;
import com.f.anquandaohangbishe.notice.ActivityObserver;

/**
 * fubin(QQ2804863883)
 */
public abstract class BaseActivity extends AppCompatActivity implements ActivityObserver {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BaseApplication.getInstance().register(this);

        setContentView(setContentView().getRoot());

        init();
    }

    public abstract ViewDataBinding setContentView();

    public abstract void init();

    @Override
    public void receiveMessage(String recipient, Object message) {
        //子类根据自身需要来决定是否重载
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BaseApplication.getInstance().unRegister(this);
    }
}
