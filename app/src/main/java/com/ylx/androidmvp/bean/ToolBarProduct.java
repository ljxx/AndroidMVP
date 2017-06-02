package com.ylx.androidmvp.bean;

import android.support.v7.widget.Toolbar;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/6/2  下午3:27
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class ToolBarProduct {
    private Toolbar navigationIcon;
    private Toolbar title;

    public Toolbar getTitle() {
        return title;
    }

    public void setTitle(Toolbar title) {
        this.title = title;
    }

    public Toolbar getNavigationIcon() {
        return navigationIcon;
    }

    public void setNavigationIcon(Toolbar navigationIcon) {
        this.navigationIcon = navigationIcon;
    }
}
