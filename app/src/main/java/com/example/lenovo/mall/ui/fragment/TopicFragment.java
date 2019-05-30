package com.example.lenovo.mall.ui.fragment;

import com.example.lenovo.mall.R;
import com.example.lenovo.mall.base.BaseFragment;
import com.example.lenovo.mall.presenter.EmptyPresenter;
import com.example.lenovo.mall.view.EmptyView;

public class TopicFragment extends BaseFragment<EmptyView,EmptyPresenter> {
    @Override
    protected EmptyPresenter initPresenter() {
        return new EmptyPresenter();
    }

    @Override
    protected int LayoutId() {
        return R.layout.fragment_topic;
    }
}
