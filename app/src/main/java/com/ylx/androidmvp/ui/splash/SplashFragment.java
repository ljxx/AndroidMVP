package com.ylx.androidmvp.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.ylx.androidmvp.ui.main.MainActivity;
import com.ylx.androidmvp.R;
import com.ylx.androidmvp.bean.SplashImgBean;
import com.ylx.androidmvp.mvpframe.base.BaseFragment;
import com.ylx.androidmvp.mvpframe.rx.RxSchedulerHelper;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
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
 * 创建日期：2017/6/2  上午11:28
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class SplashFragment extends BaseFragment<SplashModel, SplashPresenter> implements SplashContract.View {

    private static final String TAG = "SplashFragment";

    @BindView(R.id.contentFrame)
    ImageView contentFrame;

    public SplashFragment() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.splash_frag, container, false);
        ButterKnife.bind(this, mView);
        return mView;
    }

    @Override
    protected void initData() {
        super.initData();
        presenter.getSplashImg();
    }

    @Override
    public void showImg(SplashImgBean imgBean) {
        Glide.with(getContext()).load(imgBean.getImg()).into(contentFrame);
    }

    @Override
    public void onRequestEnd() {
        super.onRequestEnd();
        Observable.timer(2, TimeUnit.SECONDS)
                .compose(RxSchedulerHelper.<Long>io_main())
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull Long aLong) {
                        startActivity(new Intent(getActivity(), MainActivity.class));
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
