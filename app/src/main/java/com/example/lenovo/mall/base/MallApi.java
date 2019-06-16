package com.example.lenovo.mall.base;

import com.example.lenovo.mall.bean.BeannerBean;
import com.example.lenovo.mall.bean.ClassFixTablayoutBean;
import com.example.lenovo.mall.bean.DetailsBean;
import com.example.lenovo.mall.bean.HaoWuBean;
import com.example.lenovo.mall.bean.LikeBean;
import com.example.lenovo.mall.bean.MiaoShaBean;
import com.example.lenovo.mall.bean.PinPaiBean;
import com.example.lenovo.mall.bean.TopicTabBean;
import com.example.lenovo.mall.bean.TuiJIanBean;

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

    //推荐接口
    @GET("lively")
    Observable<TuiJIanBean> getTuiJian();

    //猜你喜欢接口
    @GET("you_like")
    Observable<LikeBean> getCaini();

    //分类Tablayout接口
    @GET("category")
    Observable<ClassFixTablayoutBean> getClassFixTablayout();

    //专题Tablayout接口
    @GET("cate_show_special ")
    Observable<TopicTabBean> getTopicTab();

    //详情接口
    @GET("goos1")
    Observable<DetailsBean> getDetails();
}
