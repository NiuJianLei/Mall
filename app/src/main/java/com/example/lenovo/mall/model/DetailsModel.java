package com.example.lenovo.mall.model;

import com.example.lenovo.mall.base.BaseModel;
import com.example.lenovo.mall.base.MallApi;
import com.example.lenovo.mall.bean.DetailsBean;
import com.example.lenovo.mall.net.BaseObserver;
import com.example.lenovo.mall.net.HttpUtils;
import com.example.lenovo.mall.net.ICallBack;
import com.example.lenovo.mall.net.RxUtils;

import io.reactivex.disposables.Disposable;

public class DetailsModel extends BaseModel {
    public void initDetails(final ICallBack<DetailsBean> iCallBack){
        MallApi apiserver = HttpUtils.getInstance().getApiserver(MallApi.mallUrl, MallApi.class);
        apiserver.getDetails().compose(RxUtils.<DetailsBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<DetailsBean>() {
                    @Override
                    public void onError(Throwable e) {
                        iCallBack.onFain(e.getMessage());
                    }

                    @Override
                    public void onSubscribe(Disposable d) {
                        addDisposable(d);
                    }

                    @Override
                    public void onNext(DetailsBean detailsBean) {
                        iCallBack.onSuccess(detailsBean);
                    }
                });
    }
}
