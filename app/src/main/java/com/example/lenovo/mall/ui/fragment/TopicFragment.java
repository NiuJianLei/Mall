package com.example.lenovo.mall.ui.fragment;

import android.media.Image;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.request.RequestOptions;
import com.example.lenovo.mall.R;
import com.example.lenovo.mall.base.BaseFragment;
import com.example.lenovo.mall.bean.TopicTabBean;
import com.example.lenovo.mall.presenter.EmptyPresenter;
import com.example.lenovo.mall.presenter.TopicPresenter;
import com.example.lenovo.mall.ui.adapter.TopicRecAdapter;
import com.example.lenovo.mall.util.ImageLoader;
import com.example.lenovo.mall.view.EmptyView;
import com.example.lenovo.mall.view.TopicView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class TopicFragment extends BaseFragment<TopicView, TopicPresenter> implements TopicView {
    @BindView(R.id.topic_tablayout)
    TabLayout tablayout;
    @BindView(R.id.topic_recyclerview)
    RecyclerView recycler;
    private ArrayList<TopicTabBean.CategoryEntity> tablist;
    private ImageView imagea;
    private TextView titlea;
    private ImageView imageb;
    private TextView titleb;
    private TopicRecAdapter adapter;

    @Override
    protected TopicPresenter initPresenter() {
        return new TopicPresenter();
    }

    @Override
    protected int LayoutId() {
        return R.layout.fragment_topic;
    }

    @Override
    protected void initView() {

        tablist = new ArrayList<>();
        //Tab1布局
        tablayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.c_00ffffff));
        View view = View.inflate(getContext(), R.layout.tab_topic_a, null);
        imagea = view.findViewById(R.id.taba_image);
        titlea = view.findViewById(R.id.taba_title);
        tablayout.addTab(tablayout.newTab().setCustomView(view));
        //tab2布局
        View inflate = View.inflate(getContext(), R.layout.tab_topic_b, null);
        imageb = inflate.findViewById(R.id.tabb_image);
        titleb = inflate.findViewById(R.id.tabb_title);
        tablayout.addTab(tablayout.newTab().setCustomView(inflate));

        //配置Recyclerview

        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new TopicRecAdapter(getContext());
        recycler.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        mPresenter.initTopicTab();
    }

    @Override
    public void onSuccess(TopicTabBean topicTabBean) {
        List<TopicTabBean.CategoryEntity> category = topicTabBean.getCategory();
        ImageLoader.setCircleImage(getContext(), category.get(0).getIcon(), imagea, R.drawable.a5);
        titlea.setText(category.get(0).getName());

        titleb.setTag(category.get(1).getName());
        ImageLoader.setCircleImage(getContext(), category.get(1).getIcon(), imageb, R.drawable.a5);
        tablist.addAll(category);
        adapter.setList((ArrayList<TopicTabBean.CategoryEntity>) category);
    }

    @Override
    public void onFain(String msg) {

    }
}
