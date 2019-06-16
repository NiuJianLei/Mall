package com.example.lenovo.mall.presenter;

import com.example.lenovo.mall.base.BasePresenter;
import com.example.lenovo.mall.bean.DetailsBean;
import com.example.lenovo.mall.model.DetailsModel;
import com.example.lenovo.mall.net.ICallBack;
import com.example.lenovo.mall.view.DetailsView;

public class DetailsPresenter extends BasePresenter<DetailsView> {
    DetailsModel model;
    @Override
    public void initModel() {
    this.model=new DetailsModel();
    mModels.add(model);
    }
    public void initDetails(){
        model.initDetails(new ICallBack<DetailsBean>() {
            @Override
            public void onSuccess(DetailsBean bean) {
                mMvpView.onDetalisSuccess(bean);
            }

            @Override
            public void onFain(String msg) {
                mMvpView.onDetalisFail(msg);
            }
        });
    }
}
