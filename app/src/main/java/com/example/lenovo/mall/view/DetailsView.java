package com.example.lenovo.mall.view;

import com.example.lenovo.mall.base.BaseView;
import com.example.lenovo.mall.bean.DetailsBean;

public interface DetailsView extends BaseView {
    void onDetalisSuccess(DetailsBean detailsBean);
    void onDetalisFail(String msg);
}
