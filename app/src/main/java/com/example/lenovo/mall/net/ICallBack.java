package com.example.lenovo.mall.net;

public interface ICallBack<T> {
    void onSuccess(T bean);
    void onFain(String msg);

}
