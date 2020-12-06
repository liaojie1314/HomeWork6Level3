package com.example.testactivity8;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class OneFragmentView_1 extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerViewAdapter mAdapter;
    private View mainView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,
                            @Nullable Bundle savedInstanceState) {
        mainView=inflater.inflate(R.layout.fragment_one_view_1, container, false);
        initView();
        return mainView;
    }
    private void initView(){
//        mRecyclerView=mainView.findViewById(R.id.line_recy_view);
        mLayoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        ArrayList<String>data=new ArrayList<>();
        for (int i=0;i<20;i++){
            data.add("新闻:"+i);
        }
        mAdapter=new RecyclerViewAdapter(getActivity(),data);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}