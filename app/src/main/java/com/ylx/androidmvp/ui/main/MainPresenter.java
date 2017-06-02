package com.ylx.androidmvp.ui.main;

import android.util.Log;

import com.ylx.androidmvp.bean.LatestNewsBean;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/6/2  下午4:06
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class MainPresenter extends MainContract.Presenter {
    @Override
    void getLatestNews() {
        rx.add(model.getLatestNews().subscribe(
                new Consumer<LatestNewsBean>() {
                    @Override
                    public void accept(@NonNull LatestNewsBean latestNewsBean) throws Exception {
                        Log.i("===MainPresenter=","===" + latestNewsBean.toString());
                        if (view == null){
                            Log.i("=====","====view==");
                        }
                        view.showLatestNews(latestNewsBean);
                    }
                },
                new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        view.onRequestError(throwable.toString());
                    }
                },
                new Action() {
                    @Override
                    public void run() throws Exception {
                        view.onRequestEnd();
                    }
                }
        ));
    }
}
