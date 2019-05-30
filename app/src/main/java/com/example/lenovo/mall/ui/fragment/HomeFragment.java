package com.example.lenovo.mall.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lenovo.mall.R;
import com.example.lenovo.mall.base.BaseFragment;
import com.example.lenovo.mall.bean.BeannerBean;
import com.example.lenovo.mall.bean.HaoWuBean;
import com.example.lenovo.mall.bean.MiaoShaBean;
import com.example.lenovo.mall.bean.PinPaiBean;
import com.example.lenovo.mall.presenter.HomePresenter;
import com.example.lenovo.mall.ui.adapter.HaoWuRecAdapter;
import com.example.lenovo.mall.ui.adapter.MiaoShaRecAdapter;
import com.example.lenovo.mall.ui.adapter.PinPaiRecAdapter;
import com.example.lenovo.mall.view.HomeView;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class HomeFragment extends BaseFragment<HomeView, HomePresenter> implements HomeView {
    @BindView(R.id.home_banner)
    Banner homeBanner;
    @BindView(R.id.huati)
    TextView huati;
    @BindView(R.id.tehui)
    TextView tehui;
    @BindView(R.id.qiandao)
    TextView qiandao;
    @BindView(R.id.pinpai_recycler)
    RecyclerView pinpaiRecycler;
    @BindView(R.id.miaosha_recycler)
    RecyclerView miaoshaRecycler;
    @BindView(R.id.miaosha_action)
    TextView miaoshaAction;
    @BindView(R.id.miaosha_shengyu)
    TextView miaoshaShengyu;
    @BindView(R.id.haowu_recycler)
    RecyclerView haowuRecycler;
    private ArrayList<BeannerBean.DlistEntity> bannlist;
    private ArrayList<PinPaiBean.DlistEntity> pinpaiList;
    private PinPaiRecAdapter pinpaiAdapter;
    private MiaoShaRecAdapter miaoshaAdapter;
    private HaoWuRecAdapter haowuAdapter;

    @Override
    protected HomePresenter initPresenter() {
        return new HomePresenter();
    }

    @Override
    protected int LayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView() {
        bannlist = new ArrayList<>();

        //品牌Recycler
        pinpaiRecycler.setLayoutManager(new GridLayoutManager(getContext(), 2));
        pinpaiList = new ArrayList<>();
        pinpaiAdapter = new PinPaiRecAdapter(getContext());
        pinpaiRecycler.setAdapter(pinpaiAdapter);
        //秒杀Recyclerview
        miaoshaRecycler.setLayoutManager(new GridLayoutManager(getContext(), 2));
        miaoshaAdapter = new MiaoShaRecAdapter(getContext());
        miaoshaRecycler.setAdapter(miaoshaAdapter);
        //新鲜好物Recyclerview
        haowuRecycler.setLayoutManager(new GridLayoutManager(getContext(), 2));
        haowuAdapter = new HaoWuRecAdapter(getContext());
        haowuRecycler.setAdapter(haowuAdapter);

    }

    @Override
    protected void initData() {
        mPresenter.initBanner();
        mPresenter.initPinPai();
        mPresenter.initMiaosha();
        mPresenter.initHaowu();
    }

    @Override
    public void onSuccess(BeannerBean banner) {
        bannlist.addAll(banner.getDlist());
        homeBanner.setImages(bannlist)
                .setImageLoader(new ImageLoader() {
                    @Override
                    public void displayImage(Context context, Object path, ImageView imageView) {
                        BeannerBean.DlistEntity path1 = (BeannerBean.DlistEntity) path;
                        Glide.with(context).load(path1.getPic()).into(imageView);
                    }
                }).start();
    }

    @Override
    public void onFain(String msg) {

    }

    @Override
    public void initPinPaiSuccess(PinPaiBean pinPaiBean) {
        pinpaiAdapter.setList((ArrayList<PinPaiBean.DlistEntity>) pinPaiBean.getDlist());
    }

    @Override
    public void initMiaoSha(MiaoShaBean miaoShaBean) {

        miaoshaAdapter.setList((ArrayList<MiaoShaBean.DlistEntity>) miaoShaBean.getDlist());


    }

    @Override
    public void initHaoWu(HaoWuBean haoWuBean) {
            haowuAdapter.setList((ArrayList<HaoWuBean.ListEntity>) haoWuBean.getList());
    }

}
