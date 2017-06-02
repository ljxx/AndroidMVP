package com.ylx.androidmvp.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ylx.androidmvp.R;
import com.ylx.androidmvp.bean.LatestNewsBean;
import com.ylx.androidmvp.mvpframe.base.BaseFragment;
import com.ylx.androidmvp.ui.adapter.TestAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

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
public class MainFragment extends BaseFragment<MainModel, MainPresenter> implements MainContract.View {

    @BindView(R.id.swipe)
    SwipeRefreshLayout mSwipe;
    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerView;

    List<LatestNewsBean.StoriesBean> mList = new ArrayList<LatestNewsBean.StoriesBean>();
    TestAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.main_frag, container, false);
        ButterKnife.bind(this, mView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new TestAdapter(getContext(), mList);
        mRecyclerView.setAdapter(mAdapter);

        return mView;
    }

    @Override
    protected void initData() {
        super.initData();
        presenter.getLatestNews();
    }

    @Override
    public void showLatestNews(LatestNewsBean latestNewsBean) {
        if (latestNewsBean == null) {
            Log.i("=====", "==null==");
        } else {
            Log.i("=====","====" + latestNewsBean.toString());
            for (int i = 0; i < latestNewsBean.getStories().size(); i++){
                mList.add(latestNewsBean.getStories().get(i));
            }
            mAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onRequestError(String msg) {
        super.onRequestError(msg);
        Snackbar.make(getView(), msg, Snackbar.LENGTH_SHORT).show();
    }
}
