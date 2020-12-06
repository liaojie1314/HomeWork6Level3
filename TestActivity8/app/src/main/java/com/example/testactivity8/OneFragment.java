package com.example.testactivity8;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class OneFragment extends Fragment {
    ViewPager viewPager;
    TabLayout tabLayout;
    List<View>views;
    List<String>titles;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,@Nullable
                             Bundle savedInstanceState){
       View view=inflater.inflate(R.layout.fragment_one,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view,@Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        viewPager=view.findViewById(R.id.one_view_pager);
        tabLayout=view.findViewById(R.id.tab_layout);
        View viewOne=LayoutInflater.from(view.getContext()).inflate(R.layout.fragment_one_view_1,null);
        View viewTwo=LayoutInflater.from(view.getContext()).inflate(R.layout.fragment_one_view_2,null);
        View viewThree=LayoutInflater.from(view.getContext()).inflate(R.layout.fragment_one_view_3,null);
        View viewFour=LayoutInflater.from(view.getContext()).inflate(R.layout.fragment_one_view_4,null);
        View viewFive=LayoutInflater.from(view.getContext()).inflate(R.layout.fragment_one_view_5,null);
        View viewSix=LayoutInflater.from(view.getContext()).inflate(R.layout.fragment_one_view_6,null);
        View viewSeven=LayoutInflater.from(view.getContext()).inflate(R.layout.fragment_one_view_7,null);
        View viewEight=LayoutInflater.from(view.getContext()).inflate(R.layout.fragment_one_view_8,null);
        views=new ArrayList<>();
        views.add(viewOne);
        views.add(viewTwo);
        views.add(viewThree);
        views.add(viewFour);
        views.add(viewFive);
        views.add(viewSix);
        views.add(viewSeven);
        views.add(viewEight);
        titles=new ArrayList<>();
        titles.add("新闻");
        titles.add("视频");
        titles.add("咨询");
        titles.add("美食");
        titles.add("综艺");
        titles.add("体育");
        titles.add("健康");
        titles.add("考古");

        ViewPagerAdapter adapter=new ViewPagerAdapter(views,titles);
        for (String title:titles){
            tabLayout.addTab(tabLayout.newTab().setText(title));
        }
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(adapter);

    }
//    int[] pics={
//            R.drawable.bird,
//            R.drawable.cat,
//            R.drawable.dog,
//            R.drawable.duck,
//            R.drawable.horse,
//            R.drawable.mouse,
//            R.drawable.wolf,
//    };
//    String[] names={
//            "鸟",
//            "猫",
//            "狗",
//            "鸭",
//            "马",
//            "老鼠",
//            "狼",
//    };
//    List<Map<String,Object>>lineData=new ArrayList<>();
//    private void addData(){
//        Map<String,Object>map=null;
//        Random random=new Random();
//        for (int i=0;i<30;i++){
//            int n=random.nextInt(pics.length);
//            map=new HashMap<>();
//            map.put("pic",pics[n]);
//            map.put("name",names[n]);
//            map.put("desc","我是一只"+names[n]);
//            lineData.add(map);
//        }
//    }

}