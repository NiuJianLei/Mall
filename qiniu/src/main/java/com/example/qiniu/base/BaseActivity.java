package com.example.qiniu.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<V extends BaseView,P extends BasePresenter> extends AppCompatActivity implements BaseView{
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LayoutId());
        mPresenter=initPresenter();
        if (mPresenter==null){
            mPresenter.bind();
        }
        initView();
        initdata();
    }

    protected   void initdata(){};


    protected   void initView(){};


    protected abstract P initPresenter();

    protected abstract int LayoutId();
}
