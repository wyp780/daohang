package com.f.anquandaohangbishe.http;

import com.f.anquandaohangbishe.model.BaseModel;
import com.f.mylibrary.utils.ShowUtil;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public abstract class HttpObserver<T extends BaseModel> implements Observer<T> {

    public Disposable disposable;

    @Override
    public void onSubscribe(Disposable d) {
        disposable = d;
    }

    @Override
    public void onNext(T t) {
        if (t.ret == 9999) {
            ShowUtil.show("被别人挤掉了");
        }
    }

    @Override
    public void onError(Throwable e) {
        ShowUtil.show("网络请求出现错误");
    }

    public void stop() {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.isDisposed();
        }
    }
}
