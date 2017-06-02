package com.ylx.androidmvp.api;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.ylx.androidmvp.Constants;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/6/2  上午10:35
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class NetWork {

    private static final int DEFAULT_TIMEOUT = 5;

    private static NetWork mNetWork;

    private static CommonApi mCommonApi;

    private static Retrofit mRetrofit;

    public static NetWork getInstance() {
        if(mNetWork == null){
            mNetWork = new NetWork();
        }
        return mNetWork;
    }

    public CommonApi getCommonApi() {
        return mCommonApi == null ? configRetrofit(CommonApi.class) : mCommonApi;
    }

    private OkHttpClient configClient() {
        OkHttpClient.Builder mOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        return mOkHttpClient.build();
    }

    private <T> T configRetrofit(Class<T> service) {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .client(configClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return mRetrofit.create(service);
    }

}
