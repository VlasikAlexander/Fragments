package com.jb.project.andfile.fragments;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class RecyclerAdapter extends RecyclerView.Adapter<CategoryHolder> {
    ArrayList<Model> mPerson;
    Context mContext;


    public RecyclerAdapter(Context context, ArrayList<Model> list) {
        mContext = context;
        mPerson = list;

    }
    @Override
    public CategoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item_favorites, null);
        return new CategoryHolder(view);

    }

    @Override
    public void onBindViewHolder(CategoryHolder holder, int position) {
        holder.mImageView.setImageResource(Model.getList().get(position).getPhotoId());
        holder.mTextView1.setText(Model.getList().get(position).getAddress());
        holder.mTextView2.setText(Model.getList().get(position).getCity());
        holder.mTextView3.setText(Model.getList().get(position).getCity());
        holder.mTextView4.setText(Model.getList().get(position).getCity());
        holder.mRatingBar.setProgress(3);



    }

    @Override
    public int getItemCount() {
        return mPerson.size();
    }
}
