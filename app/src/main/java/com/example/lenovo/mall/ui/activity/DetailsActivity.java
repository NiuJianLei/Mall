package com.example.lenovo.mall.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.lenovo.mall.R;
import com.example.lenovo.mall.base.BaseActivity;
import com.example.lenovo.mall.bean.DetailsBean;
import com.example.lenovo.mall.presenter.DetailsPresenter;
import com.example.lenovo.mall.ui.adapter.DetailsRecAdapter;
import com.example.lenovo.mall.view.DetailsView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class DetailsActivity extends BaseActivity<DetailsView, DetailsPresenter> implements DetailsView {

    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };


    @BindView(R.id.details_recycler)
    RecyclerView recycler;
    @BindView(R.id.details_car)
    Button car;
    @BindView(R.id.details_mai)
    Button mai;
    @BindView(R.id.tv_sum)
    TextView mSum;
    @BindView(R.id.checkAll)
    CheckBox checkAll;
    private DetailsRecAdapter adapter;
    private ArrayList<DetailsBean.DlistEntity> list;
    private int countSum = 1;
    private int newPosition = 0;
    private float priceSum = 0.00f;

    protected DetailsPresenter initPresenter() {
        return new DetailsPresenter();
    }

    @Override
    protected int Layoutid() {
        return R.layout.activity_details;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        mPresenter.initDetails();
        list = new ArrayList<>();



    }

    @Override
    public void onDetalisSuccess(DetailsBean detailsBean) {
//        adapter.setList((ArrayList<DetailsBean.DlistEntity>) detailsBean.getDlist());
        List<DetailsBean.DlistEntity> dlist = detailsBean.getDlist();
        list.addAll(dlist);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DetailsRecAdapter(this,list);
        recycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        adapter.setListener(new DetailsRecAdapter.OnClickListener() {

            private String price;

            @Override
            public void OnClick(HashMap<Integer, Boolean> map, int position) {
                newPosition = position;
                //所选商品价格
                price=list.get(position).getPrice();

                //是否选中
                if (map.get(position)&&price!=null) {
                    priceSum += (Float.valueOf(price) * countSum*1.0f);
                } else if (!TextUtils.isEmpty(price)){
                    priceSum -= (Float.valueOf(price) * countSum*1.0f);
                    if (checkAll.isChecked()) {
                        checkAll.setChecked(false);
                    }
                }
                mSum.setText("总计：" + priceSum + "");
            }
        });
        adapter.setAddListener(new DetailsRecAdapter.OnAddClickListener() {
            @Override
            public void OnAddClick(View view, int position, Boolean boo) {
                countSum+=1;
                adapter.setCountSum(countSum);
                if(boo==true){
                    priceSum=Integer.valueOf(list.get(newPosition).getPrice())*countSum;
                    mSum.setText("总计："+priceSum+"");
                }else{
                    mSum.setText("0");
                }

            }
        });
    }

    @Override
    public void onDetalisFail(String msg) {

    }

    @OnClick({R.id.details_car, R.id.details_mai})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.details_car:

                break;
            case R.id.details_mai:

                break;
        }
    }
}
