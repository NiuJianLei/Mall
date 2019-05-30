package com.example.lenovo.mall.base;

import com.example.lenovo.mall.bean.BeannerBean;
import com.example.lenovo.mall.bean.HaoWuBean;
import com.example.lenovo.mall.bean.MiaoShaBean;
import com.example.lenovo.mall.bean.PinPaiBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MallApi {
    String mallUrl="http://47.92.105.146:8002/";

    //banner接口
    @GET("advertising_list")
    Observable<BeannerBean> getBanner();


    //品牌接口
    @GET("brand ")
    Observable<PinPaiBean> getPinPai();

    //秒杀接口
    @GET("ceckil_goods")
    Observable<MiaoShaBean> getMiaoSha();

    //新鲜好物接口
    @GET("fresgh_goods")
    Observable<HaoWuBean> getHaoWu();
}
