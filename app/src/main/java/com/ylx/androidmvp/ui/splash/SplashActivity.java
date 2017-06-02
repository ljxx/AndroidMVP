package com.ylx.androidmvp.ui.splash;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.ylx.androidmvp.R;
import com.ylx.androidmvp.mvpframe.base.BaseActivity;

import butterknife.BindView;

public class SplashActivity extends BaseActivity {

    @BindView(R.id.content)
    FrameLayout mContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //去除标题栏
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void initFragment() {
        super.initFragment();
        SplashFragment splashFragment = new SplashFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content, splashFragment).commit();
    }
}
