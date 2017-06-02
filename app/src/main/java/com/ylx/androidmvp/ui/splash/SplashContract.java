package com.ylx.androidmvp.ui.splash;

import com.ylx.androidmvp.bean.SplashImgBean;
import com.ylx.androidmvp.mvpframe.base.BaseModel;
import com.ylx.androidmvp.mvpframe.base.BasePresenter;
import com.ylx.androidmvp.mvpframe.base.BaseView;

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
public interface SplashContract {
    interface View extends BaseView {
        void showImg(SplashImgBean imgBean);
    }

    interface Model extends BaseModel {
        Observable<SplashImgBean> getSplashImg();
    }

    abstract class Presenter extends BasePresenter<Model, View> {
        abstract void getSplashImg();
    }
}
