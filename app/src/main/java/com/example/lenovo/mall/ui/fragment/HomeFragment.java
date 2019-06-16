package com.example.lenovo.mall.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
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
import com.example.lenovo.mall.bean.LikeBean;
import com.example.lenovo.mall.bean.MiaoShaBean;
import com.example.lenovo.mall.bean.PinPaiBean;
import com.example.lenovo.mall.bean.TuiJIanBean;
import com.example.lenovo.mall.presenter.HomePresenter;
import com.example.lenovo.mall.ui.activity.DetailsActivity;
import com.example.lenovo.mall.ui.adapter.HaoWuRecAdapter;
import com.example.lenovo.mall.ui.adapter.LikeRecAdapter;
import com.example.lenovo.mall.ui.adapter.MiaoShaRecAdapter;
import com.example.lenovo.mall.ui.adapter.PinPaiRecAdapter;
import com.example.lenovo.mall.ui.adapter.TuiJianRecAdapter;
import com.example.lenovo.mall.view.HomeView;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
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
    @BindView(R.id.tuijian_recycler)
    RecyclerView tuijianRecycler;
    Unbinder unbinder;
    @BindView(R.id.like_recycler)
    RecyclerView likeRecycler;
    Unbinder unbinder1;
    @BindView(R.id.home_details)
    TextView homeDetails;
    Unbinder unbinder2;
    private ArrayList<BeannerBean.DlistEntity> bannlist;
    private ArrayList<PinPaiBean.DlistEntity> pinpaiList;
    private PinPaiRecAdapter pinpaiAdapter;
    private MiaoShaRecAdapter miaoshaAdapter;
    private HaoWuRecAdapter haowuAdapter;
    private TuiJianRecAdapter tuiJianadapter;
    private View view;
    private LikeRecAdapter adapter;

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
        //推荐RecyclerView
        tuijianRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        tuiJianadapter = new TuiJianRecAdapter(getContext());
        tuijianRecycler.setAdapter(tuiJianadapter);
        //猜你喜欢接口
        likeRecycler.setLayoutManager(new GridLayoutManager(getContext(), 2));
        adapter = new LikeRecAdapter(getContext());
        likeRecycler.setAdapter(adapter);



    }

    @Override
    protected void initData() {
        mPresenter.initBanner();
        mPresenter.initPinPai();
        mPresenter.initMiaosha();
        mPresenter.initHaowu();
        mPresenter.initTuiJian();
        mPresenter.initLike();
        showLoading();
    }

    @OnClick(R.id.home_details)
    public void onClick() {
        Intent intent = new Intent(getContext(), DetailsActivity.class);
        startActivity(intent);
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
        hideLoading();
    }

    @Override
    public void onFain(String msg) {
        hideLoading();
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

    @Override
    public void initTuiJian(TuiJIanBean tuiJianbean) {
        List<TuiJIanBean.DlistEntity> dlist = tuiJianbean.getDlist();
        tuiJianadapter.setList((ArrayList<TuiJIanBean.DlistEntity>) dlist);
    }

    @Override
    public void initlike(LikeBean likeBean) {
        List<LikeBean.DlistEntity> dlist = likeBean.getDlist();
        adapter.setList((ArrayList<LikeBean.DlistEntity>) dlist);
    }


}
