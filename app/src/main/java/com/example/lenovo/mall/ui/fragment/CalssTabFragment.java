package com.example.lenovo.mall.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.mall.R;
import com.example.lenovo.mall.base.BaseFragment;
import com.example.lenovo.mall.base.Constants;
import com.example.lenovo.mall.bean.ClassFixTablayoutBean;
import com.example.lenovo.mall.presenter.EmptyPresenter;
import com.example.lenovo.mall.ui.adapter.ClassFixRecAdapter;
import com.example.lenovo.mall.view.EmptyView;

import java.io.Serializable;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class CalssTabFragment extends BaseFragment<EmptyView, EmptyPresenter> {
    @BindView(R.id.class_recycler)
    RecyclerView classRecycler;

    @Override
    protected EmptyPresenter initPresenter() {
        return new EmptyPresenter();
    }

    @Override
    protected int LayoutId() {
        return R.layout.classfixtablayout_fragment;
    }

    @Override
    protected void initView() {
        classRecycler.setLayoutManager(new GridLayoutManager(getContext(),2));
        ClassFixTablayoutBean.DlistEntity serializable = (ClassFixTablayoutBean.DlistEntity) getArguments().getSerializable(Constants.DATA);

        ClassFixRecAdapter adapter = new ClassFixRecAdapter(getContext(), (ArrayList<ClassFixTablayoutBean.DlistEntity.ListEntity>) serializable.getList());
        classRecycler.setAdapter(adapter);
    }
}
