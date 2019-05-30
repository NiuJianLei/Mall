package com.example.lenovo.mall.model;

import com.example.lenovo.mall.base.BaseModel;
import com.example.lenovo.mall.base.MallApi;
import com.example.lenovo.mall.bean.BeannerBean;
import com.example.lenovo.mall.bean.HaoWuBean;
import com.example.lenovo.mall.bean.MiaoShaBean;
import com.example.lenovo.mall.bean.PinPaiBean;
import com.example.lenovo.mall.net.BaseObserver;
import com.example.lenovo.mall.net.HttpUtils;
import com.example.lenovo.mall.net.ICallBack;
import com.example.lenovo.mall.net.RxUtils;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class HomeModel extends BaseModel {
    public void initBanner(final ICallBack<BeannerBean> iCallBack){
        MallApi apiserver = HttpUtils.getInstance().getApiserver(MallApi.mallUrl, MallApi.class);
        Observable<BeannerBean> banner = apiserver.getBanner();
        banner.compose(RxUtils.<BeannerBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<BeannerBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        addDisposable(d);
                    }

                    @Override
                    public void onNext(BeannerBean beannerBean) {
                        iCallBack.onSuccess(beannerBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iCallBack.onFain(e.getMessage());
                    }
                });
    }


    public void initPinPai(final ICallBack<PinPaiBean> iCallBack){
        MallApi apiserver = HttpUtils.getInstance().getApiserver(MallApi.mallUrl, MallApi.class);
        Observable<PinPaiBean> pinPai = apiserver.getPinPai();
        pinPai.compose(RxUtils.<PinPaiBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<PinPaiBean>() {
                    @Override
                    public void onError(Throwable e) {
                        iCallBack.onFain(e.getMessage());
                    }

                    @Override
                    public void onSubscribe(Disposable d) {
                        addDisposable(d);
                    }

                    @Override
                    public void onNext(PinPaiBean pinPaiBean) {
                        iCallBack.onSuccess(pinPaiBean);

                    }
                });
    }

    public void initMiaosha(final ICallBack<MiaoShaBean> iCallBack){
        MallApi apiserver = HttpUtils.getInstance().getApiserver(MallApi.mallUrl, MallApi.class);
        Observable<MiaoShaBean> miaoSha = apiserver.getMiaoSha();
        miaoSha.compose(RxUtils.<MiaoShaBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<MiaoShaBean>() {
                    @Override
                    public void onError(Throwable e) {
                        iCallBack.onFain(e.getMessage());
                    }

                    @Override
                    public void onSubscribe(Disposable d) {
                        addDisposable(d);
                    }

                    @Override
                    public void onNext(MiaoShaBean miaoShaBean) {
                        iCallBack.onSuccess(miaoShaBean);
                    }
                });
    }


   public void initHaowu(final ICallBack<HaoWuBean> iCallBack){
       MallApi apiserver = HttpUtils.getInstance().getApiserver(MallApi.mallUrl, MallApi.class);
       Observable<HaoWuBean> compose = apiserver.getHaoWu().compose(RxUtils.<HaoWuBean>rxObserableSchedulerHelper());
       compose.subscribe(new BaseObserver<HaoWuBean>() {
           @Override
           public void onError(Throwable e) {
               iCallBack.onFain(e.getMessage());
           }

           @Override
           public void onSubscribe(Disposable d) {
               addDisposable(d);
           }

           @Override
           public void onNext(HaoWuBean haoWuBean) {
                iCallBack.onSuccess(haoWuBean);
           }
       });
   }


}
