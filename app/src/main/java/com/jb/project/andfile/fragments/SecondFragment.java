package com.jb.project.andfile.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SecondFragment  extends Fragment {

    public RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.second_fragment, container, false);
//        mRecyclerView = (RecyclerView)v.findViewById(R.id.recycler_layout);
//
//        mLayoutManager = new LinearLayoutManager(getContext());
//        mRecyclerView.setLayoutManager(mLayoutManager);
//
//        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(), Model.getList());
//        mRecyclerView.setAdapter(adapter);


        return  v;
    }
}
