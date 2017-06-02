package com.ylx.androidmvp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ylx.androidmvp.R;
import com.ylx.androidmvp.bean.LatestNewsBean;

import java.util.ArrayList;
import java.util.List;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/6/2  下午4:40
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class TestAdapter extends RecyclerView.Adapter<TestAdapter.MyHolder> {

    private Context mContext;
    private List<LatestNewsBean.StoriesBean> mList = new ArrayList<LatestNewsBean.StoriesBean>();

    public TestAdapter(Context context, List<LatestNewsBean.StoriesBean> list) {
        this.mContext = context;
        this.mList = list;
    }


    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(mContext).inflate(R.layout.test_adapter_item, parent, false);
        MyHolder myHolder = new MyHolder(mView);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.textView.setText(mList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public MyHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text_main);
        }
    }
}
