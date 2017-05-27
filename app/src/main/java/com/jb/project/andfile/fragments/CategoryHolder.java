package com.jb.project.andfile.fragments;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


class CategoryHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ImageView mImageView;
    TextView mTextView, mTextView1, mTextView2, mTextView3, mTextView4;
    Intent intent;
    Context context;
    RatingBar mRatingBar;

    public CategoryHolder(View itemView) {
        super(itemView);
//        mTextView = (TextView)itemView.findViewById(R.id.name);
        mTextView1 = (TextView)itemView.findViewById(R.id.textView3);
        mTextView2 = (TextView)itemView.findViewById(R.id.textView5);
        mImageView = (ImageView)itemView.findViewById(R.id.imageView);
        mRatingBar = (RatingBar)itemView.findViewById(R.id.ratingBar2);
        mTextView3 = (TextView)mImageView.findViewById(R.id.isOpen);
        mTextView4 = (TextView)mImageView.findViewById(R.id.address_text);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Toast.makeText(v.getContext(), "23", Toast.LENGTH_SHORT).show();

    }


}
