package com.example.lenovo.mall.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.lenovo.mall.R;
import com.example.lenovo.mall.base.BaseActivity;
import com.example.lenovo.mall.presenter.EmptyPresenter;
import com.example.lenovo.mall.ui.fragment.ClassifyFragment;
import com.example.lenovo.mall.ui.fragment.HomeFragment;
import com.example.lenovo.mall.ui.fragment.MyFragment;
import com.example.lenovo.mall.ui.fragment.TopicFragment;
import com.example.lenovo.mall.view.EmptyView;
import com.jaeger.library.StatusBarUtil;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<EmptyView, EmptyPresenter> {

    @BindView(R.id.gouwuche)
    ImageView gouwuche;
    @BindView(R.id.main_toolbar)
    Toolbar mainToolbar;
    @BindView(R.id.main_fram)
    FrameLayout mainFram;
    @BindView(R.id.main_tablayout)
    TabLayout mainTablayout;
    @BindView(R.id.main_xiaoxi)
    ImageView mainXiaoxi;
    @BindView(R.id.main_shoucuo)
    ImageView mainShoucuo;
    private int HOME = 0;
    private int CLASSIFY=1;
    private int TOPIC=2;
    private int My=3;
    private int lastPosition=0;
    private ArrayList<Fragment> fraglist;
    private FragmentManager manager;

    @Override
    protected EmptyPresenter initPresenter() {
        return new EmptyPresenter();
    }

    @Override
    protected int Layoutid() {
        return R.layout.activity_main;
    }


    @Override
    protected void initView() {

        //改变状态栏的字体颜色
        StatusBarUtil.setLightMode(this);
        //给Tablayout设置Title
        mainTablayout.addTab(mainTablayout.newTab().setText("首页").setIcon(R.drawable.tab_home_selected));
        mainTablayout.addTab(mainTablayout.newTab().setText("分类").setIcon(R.drawable.tab_classify_selected));
        mainTablayout.addTab(mainTablayout.newTab().setText("专题").setIcon(R.drawable.tab_topic_selected));
        mainTablayout.addTab(mainTablayout.newTab().setText("我的").setIcon(R.drawable.tab_my_selected));
        //添加fragment
        fraglist = new ArrayList<>();
        fraglist.add(new HomeFragment());
        fraglist.add(new ClassifyFragment());
        fraglist.add(new TopicFragment());
        fraglist.add(new MyFragment());

        //默认显示第一个Fragment
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.main_fram,fraglist.get(0));
        transaction.commit();
        //监听Tablayout
        mainTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        switchType(HOME);
                        break;
                    case 1:
                        switchType(CLASSIFY);
                        break;
                    case 2:
                        switchType(TOPIC);
                        break;
                    case 3:
                        switchType(My);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void switchType(int type) {
        Fragment fragment = fraglist.get(type);
        FragmentTransaction transaction = manager.beginTransaction();
        if (!fragment.isAdded()){
            transaction.add(R.id.main_fram,fragment);
        }
        transaction.hide(fraglist.get(lastPosition));
        transaction.show(fragment);
        transaction.commit();
        lastPosition=type;
    }
}
