package com.ylx.androidmvp.ui.main;

import com.ylx.androidmvp.bean.LatestNewsBean;
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
 * 创建日期：2017/6/2  下午4:06
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public interface MainContract {

    interface View extends BaseView {
        void showLatestNews(LatestNewsBean latestNewsBean);
    }

    interface Model extends BaseModel {
        Observable<LatestNewsBean> getLatestNews();
    }

    abstract class Presenter extends BasePresenter<Model, View> {
        abstract void getLatestNews();
    }

}
