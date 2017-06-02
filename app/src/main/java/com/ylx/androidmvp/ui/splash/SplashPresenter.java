package com.ylx.androidmvp.ui.splash;

import com.ylx.androidmvp.bean.SplashImgBean;

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
 * 创建日期：2017/6/2  上午11:30
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class SplashPresenter extends SplashContract.Presenter {
    @Override
    void getSplashImg() {
       rx.add(model.getSplashImg().subscribe(
               new Consumer<SplashImgBean>() {
                   @Override
                   public void accept(@NonNull SplashImgBean splashImgBean) throws Exception {
                       view.showImg(splashImgBean);
                   }
               },
               new Consumer<Throwable>() {
                   @Override
                   public void accept(@NonNull Throwable throwable) throws Exception {
                       if (view != null)
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
