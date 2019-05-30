package com.example.lenovo.mall.presenter;

import com.example.lenovo.mall.base.BasePresenter;
import com.example.lenovo.mall.bean.BeannerBean;
import com.example.lenovo.mall.bean.HaoWuBean;
import com.example.lenovo.mall.bean.MiaoShaBean;
import com.example.lenovo.mall.bean.PinPaiBean;
import com.example.lenovo.mall.model.HomeModel;
import com.example.lenovo.mall.net.ICallBack;
import com.example.lenovo.mall.view.HomeView;

public class HomePresenter extends BasePresenter<HomeView> {
    HomeModel model;

    @Override
    public void initModel() {
    this.model=new HomeModel();
    mModels.add(model);
    }

    public void initBanner(){
        model.initBanner(new ICallBack<BeannerBean>() {
            @Override
            public void onSuccess(BeannerBean bean) {
                mMvpView.onSuccess(bean);
            }

            @Override
            public void onFain(String msg) {
                mMvpView.onFain(msg);
            }
        });
    }

    public void initPinPai(){
        model.initPinPai(new ICallBack<PinPaiBean>() {
            @Override
            public void onSuccess(PinPaiBean bean) {
                mMvpView.initPinPaiSuccess(bean);
            }

            @Override
            public void onFain(String msg) {
                mMvpView.onFain(msg);
            }
        });
    }

    public void initMiaosha(){
    model.initMiaosha(new ICallBack<MiaoShaBean>() {
        @Override
        public void onSuccess(MiaoShaBean bean) {
            mMvpView.initMiaoSha(bean);
        }

        @Override
        public void onFain(String msg) {
            mMvpView.onFain(msg);
        }
    });
    }

    public void initHaowu(){
        model.initHaowu(new ICallBack<HaoWuBean>() {
            @Override
            public void onSuccess(HaoWuBean bean) {
                mMvpView.initHaoWu(bean);
            }

            @Override
            public void onFain(String msg) {
                mMvpView.onFain(msg);
            }
        });
    }
}
