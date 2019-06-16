package com.example.lenovo.mall.model;

import com.example.lenovo.mall.base.BaseModel;
import com.example.lenovo.mall.base.MallApi;
import com.example.lenovo.mall.bean.ClassFixTablayoutBean;
import com.example.lenovo.mall.net.BaseObserver;
import com.example.lenovo.mall.net.HttpUtils;
import com.example.lenovo.mall.net.ICallBack;
import com.example.lenovo.mall.net.RxUtils;

import io.reactivex.disposables.Disposable;

public class ClassFixTablayoutModel extends BaseModel {
    public void initTablayout(final ICallBack<ClassFixTablayoutBean> iCallBack){
        MallApi apiserver = HttpUtils.getInstance().getApiserver(MallApi.mallUrl, MallApi.class);
        apiserver.getClassFixTablayout().compose(RxUtils.<ClassFixTablayoutBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<ClassFixTablayoutBean>() {
                    @Override
                    public void onError(Throwable e) {
                        iCallBack.onFain(e.getMessage());
                    }

                    @Override
                    public void onSubscribe(Disposable d) {
                        addDisposable(d);
                    }

                    @Override
                    public void onNext(ClassFixTablayoutBean bean) {
                        iCallBack.onSuccess(bean);
                    }
                });
    }
}
