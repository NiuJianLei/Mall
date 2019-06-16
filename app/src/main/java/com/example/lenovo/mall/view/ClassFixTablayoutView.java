package com.example.lenovo.mall.view;

import com.example.lenovo.mall.base.BaseView;
import com.example.lenovo.mall.bean.ClassFixTablayoutBean;

public interface ClassFixTablayoutView extends BaseView {
    void onSuccess(ClassFixTablayoutBean bean);
    void onFain(String msg);
}
