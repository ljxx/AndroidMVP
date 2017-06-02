package com.ylx.androidmvp.ui.main;

import com.ylx.androidmvp.api.NetWork;
import com.ylx.androidmvp.bean.LatestNewsBean;
import com.ylx.androidmvp.mvpframe.rx.RxSchedulerHelper;

import io.reactivex.Observable;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/6/2  下午4:07
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class MainModel implements MainContract.Model {
    @Override
    public Observable<LatestNewsBean> getLatestNews() {
        return NetWork.getInstance().getCommonApi().getLatestNews()
                .compose(RxSchedulerHelper.<LatestNewsBean>io_main());
    }
}
