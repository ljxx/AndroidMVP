package com.ylx.androidmvp.mvpframe.base;

import com.ylx.androidmvp.mvpframe.rx.RxManager;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/6/2  上午11:10
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class BasePresenter<M, V> {
    public M model;
    public V view;
    public RxManager rx = new RxManager();

    public void attachMV(M model, V view) {
        this.model = model;
        this.view = view;
    }

    public void detachMV() {
        rx.clear();
        model = null;
        view = null;
    }
}
