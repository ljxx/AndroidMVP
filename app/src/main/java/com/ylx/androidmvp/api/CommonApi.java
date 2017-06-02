package com.ylx.androidmvp.api;

import com.ylx.androidmvp.bean.LatestNewsBean;
import com.ylx.androidmvp.bean.SplashImgBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/6/2  上午10:33
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public interface CommonApi {
    @GET("start-image/1080*1776/")
    Observable<SplashImgBean> getSplashImg();

    @GET("news/latest")
    Observable<LatestNewsBean> getLatestNews();
}
