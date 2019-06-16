package com.example.lenovo.mall.presenter;

import com.example.lenovo.mall.base.BasePresenter;
import com.example.lenovo.mall.bean.ClassFixTablayoutBean;
import com.example.lenovo.mall.model.ClassFixTablayoutModel;
import com.example.lenovo.mall.net.ICallBack;
import com.example.lenovo.mall.view.ClassFixTablayoutView;

public class ClassFixTalbaoutPresenter extends BasePresenter<ClassFixTablayoutView> {
    ClassFixTablayoutModel model;
    @Override
    public void initModel() {
        this.model = new ClassFixTablayoutModel();
        mModels.add(model);
    }

    public void initClassFixTab() {
        model.initTablayout(new ICallBack<ClassFixTablayoutBean>() {
            @Override
            public void onSuccess(ClassFixTablayoutBean bean) {
                mMvpView.onSuccess(bean);
            }

            @Override
            public void onFain(String msg) {
                mMvpView.onFain(msg);
            }
        });
    }
}
