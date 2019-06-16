package com.example.lenovo.mall.view;

import com.example.lenovo.mall.base.BaseView;
import com.example.lenovo.mall.bean.TopicTabBean;

public interface TopicView extends BaseView {
    void onSuccess(TopicTabBean topicTabBean);
    void onFain(String msg);
}
