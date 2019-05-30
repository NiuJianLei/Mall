package com.example.lenovo.mall.view;

import com.example.lenovo.mall.base.BaseView;
import com.example.lenovo.mall.bean.BeannerBean;
import com.example.lenovo.mall.bean.HaoWuBean;
import com.example.lenovo.mall.bean.MiaoShaBean;
import com.example.lenovo.mall.bean.PinPaiBean;

public interface HomeView extends BaseView {
    void onSuccess(BeannerBean banner);
    void onFain(String msg);

    void initPinPaiSuccess(PinPaiBean pinPaiBean);
    void initMiaoSha(MiaoShaBean miaoShaBean);
    void initHaoWu(HaoWuBean haoWuBean);

}
