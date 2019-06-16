package com.example.lenovo.mall.model;

import com.example.lenovo.mall.base.BaseModel;
import com.example.lenovo.mall.base.MallApi;
import com.example.lenovo.mall.bean.TopicTabBean;
import com.example.lenovo.mall.net.BaseObserver;
import com.example.lenovo.mall.net.HttpUtils;
import com.example.lenovo.mall.net.ICallBack;
import com.example.lenovo.mall.net.RxUtils;

import io.reactivex.disposables.Disposable;

public class TopicModel extends BaseModel {
    public void initTopicTab(final ICallBack<TopicTabBean> iCallBack) {
        MallApi apiserver = HttpUtils.getInstance().getApiserver(MallApi.mallUrl, MallApi.class);
        apiserver.getTopicTab().compose(RxUtils.<TopicTabBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<TopicTabBean>() {
                    @Override
                    public void onError(Throwable e) {
                        iCallBack.onFain(e.getMessage());
                    }

                    @Override
                    public void onSubscribe(Disposable d) {
                        addDisposable(d);
                    }

                    @Override
                    public void onNext(TopicTabBean topicTabBean) {
                        iCallBack.onSuccess(topicTabBean);
                    }
                });
    }
}
