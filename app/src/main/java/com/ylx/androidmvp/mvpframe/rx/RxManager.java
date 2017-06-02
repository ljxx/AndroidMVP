package com.ylx.androidmvp.mvpframe.rx;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/6/2  上午11:05
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class RxManager {
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public void add(Disposable disposable) {
        compositeDisposable.add(disposable);
    }

    public void clear() {
        compositeDisposable.clear();
    }
}
