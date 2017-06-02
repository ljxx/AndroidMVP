package com.ylx.androidmvp.ui.splash;

import com.ylx.androidmvp.api.NetWork;
import com.ylx.androidmvp.bean.SplashImgBean;
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
 * 创建日期：2017/6/2  上午11:30
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class SplashModel implements SplashContract.Model  {
    @Override
    public Observable<SplashImgBean> getSplashImg() {
        return NetWork.getInstance().getCommonApi().getSplashImg().compose(RxSchedulerHelper.<SplashImgBean>io_main());
    }
}
