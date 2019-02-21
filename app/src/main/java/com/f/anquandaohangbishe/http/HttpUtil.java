package com.f.anquandaohangbishe.http;

import com.f.anquandaohangbishe.model.BaseModel;
import com.f.anquandaohangbishe.notice.HttpCallBack;
import com.f.mylibrary.utils.ShowUtil;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class HttpUtil<T extends BaseModel> {

    private HttpObserver<T> httpObserver;

    public void post(Observable<T> observer, final HttpCallBack<T> callBack) {
        observer.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpObserver = new HttpObserver<T>() {
                    @Override
                    public void onNext(T t) {
                        super.onNext(t);
                        if (t.getRet() == 0) {
                            callBack.onSuccess(t);
                        } else if (t.getRet() < 0) {
                            ShowUtil.show("系统错误");
                        } else {
                            ShowUtil.show(t.getDesc());
                        }
                    }

                    @Override
                    public void onComplete() {
                        callBack.onComplete();
                    }
                });
    }

    public void stop() {
        if (httpObserver != null) {
            httpObserver.stop();
        }
    }

}
