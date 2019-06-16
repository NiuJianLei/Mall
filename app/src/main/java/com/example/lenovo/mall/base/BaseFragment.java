package com.example.lenovo.mall.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.lenovo.mall.R;

import butterknife.ButterKnife;

public abstract class BaseFragment<V extends BaseView,P extends BasePresenter>extends Fragment implements BaseView {
    protected P mPresenter;
    private AlertDialog dialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(LayoutId(), null);
        ButterKnife.bind(this,inflate);
        mPresenter=initPresenter();
        if (mPresenter!=null){
            mPresenter.bind(this);
        }
        ImageView img = new ImageView(getContext());
        img.setImageResource(R.drawable.a5);
        img.setAnimation(AnimationUtils.loadAnimation(getContext(),R.anim.xuanzhuan));
        dialog = new AlertDialog.Builder(getContext())
                .setView(img)
                .create();
        initView();
        initData();
        initListener();
        return inflate;
    }

    protected void initListener() {
    }

    protected void initData() {

    }

    protected void initView() {

    }

    protected abstract P initPresenter();

    protected abstract int LayoutId();

    protected void showLoading(){
        dialog.show();
    }

    protected void hideLoading(){
        dialog.dismiss();
    }
}
