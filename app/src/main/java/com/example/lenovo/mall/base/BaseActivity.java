package com.example.lenovo.mall.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.lenovo.mall.R;

import butterknife.ButterKnife;

public abstract class BaseActivity<V extends BaseView,P extends BasePresenter> extends AppCompatActivity implements BaseView{
    protected P mPresenter;
    private AlertDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(Layoutid());
        mPresenter=initPresenter();
        ButterKnife.bind(this);
        if (mPresenter!=null){
            mPresenter.bind(this);
        }
        ImageView img = new ImageView(this);
        img.setImageResource(R.drawable.a5);
        img.setAnimation(AnimationUtils.loadAnimation(this,R.anim.xuanzhuan));
        dialog = new AlertDialog.Builder(this)
                .setView(img)
                .create();
        initView();
        initData();
        initListener();
    }

    protected void initListener() {

    }

    protected void initData() {

    }

    protected void initView() {

    }

    protected abstract P initPresenter();

    protected abstract int Layoutid();

    protected void showLoading(){
        dialog.show();
    }

    protected void hideLoading(){
        dialog.dismiss();
    }
}
