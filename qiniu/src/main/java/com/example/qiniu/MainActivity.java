package com.example.qiniu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.qiniu.base.BaseActivity;
import com.example.qiniu.base.MyPresenter;
import com.example.qiniu.base.myView;

public class MainActivity extends BaseActivity<myView,MyPresenter> {


    @Override
    protected MyPresenter initPresenter() {
        return null;
    }

    @Override
    protected int LayoutId() {
        return 0;
    }

    @Override
    protected void initView() {
        super.initView();

    }

    @Override
    protected void initdata() {
        super.initdata();

    }
}
