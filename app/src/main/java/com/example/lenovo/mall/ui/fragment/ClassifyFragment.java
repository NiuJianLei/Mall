package com.example.lenovo.mall.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.lenovo.mall.R;
import com.example.lenovo.mall.base.BaseFragment;
import com.example.lenovo.mall.base.Constants;
import com.example.lenovo.mall.bean.ClassFixTablayoutBean;
import com.example.lenovo.mall.presenter.ClassFixTalbaoutPresenter;
import com.example.lenovo.mall.ui.adapter.ClassFixVpadapter;
import com.example.lenovo.mall.view.ClassFixTablayoutView;
import com.example.lenovo.mall.weigth.VP;

import java.util.ArrayList;

import butterknife.BindView;
import q.rorbin.verticaltablayout.VerticalTabLayout;

public class ClassifyFragment extends BaseFragment<ClassFixTablayoutView, ClassFixTalbaoutPresenter>   implements ClassFixTablayoutView{

    @BindView(R.id.vtb)
    VerticalTabLayout tabLayout;
    @BindView(R.id.vtbvp)
    VP viewPager;
    private ArrayList<Fragment> fraglist;
    private ArrayList<ClassFixTablayoutBean.DlistEntity> titlelist;
    private ClassFixVpadapter vpadapter;


    @Override
    protected ClassFixTalbaoutPresenter initPresenter() {
        return new ClassFixTalbaoutPresenter();
    }

    @Override
    protected int LayoutId() {
        return R.layout.fragment_classify;
    }

    @Override
    protected void initView() {
        tabLayout.setIndicatorColor(getResources().getColor(R.color.c_00ffffff));
    }

    @Override
    protected void initData() {
        mPresenter.initClassFixTab();
    }

    @Override
    public void onSuccess(ClassFixTablayoutBean bean) {
        fraglist = new ArrayList<>();
        titlelist = new ArrayList<>();
        titlelist.addAll(bean.getDlist());
        for (int i = 0; i < bean.getDlist().size(); i++) {

            Bundle bundle = new Bundle();
            bundle.putSerializable(Constants.DATA,bean.getDlist().get(i));
            CalssTabFragment calssTabFragment = new CalssTabFragment();
            calssTabFragment.setArguments(bundle);
            fraglist.add(calssTabFragment);

        }
        vpadapter = new ClassFixVpadapter(getChildFragmentManager(), fraglist, titlelist);
        viewPager.setAdapter(vpadapter);
        tabLayout.setupWithViewPager(viewPager);



    }

    @Override
    public void onFain(String msg) {

    }
}
