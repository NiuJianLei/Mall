package com.example.lenovo.mall.presenter;

import com.example.lenovo.mall.base.BasePresenter;
import com.example.lenovo.mall.bean.TopicTabBean;
import com.example.lenovo.mall.model.TopicModel;
import com.example.lenovo.mall.net.ICallBack;
import com.example.lenovo.mall.view.TopicView;

public class TopicPresenter extends BasePresenter<TopicView> {
    TopicModel model;
    @Override
    public void initModel() {
        this.model=new TopicModel();
        mModels.add(model);
    }
    public void initTopicTab(){
        model.initTopicTab(new ICallBack<TopicTabBean>() {
            @Override
            public void onSuccess(TopicTabBean bean) {
                mMvpView.onSuccess(bean);
            }

            @Override
            public void onFain(String msg) {
            mMvpView.onFain(msg);
            }
        });
    }
}
