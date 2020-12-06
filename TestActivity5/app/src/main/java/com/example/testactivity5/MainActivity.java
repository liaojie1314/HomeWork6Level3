package com.example.testactivity5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tab1);
        viewPager=findViewById(R.id.vp1);
        initViewpage();
    }
    private void initViewpage(){
        List<String>title=new ArrayList<>();
        title.add("精选");
        title.add("体育");
        title.add("巴萨");
        title.add("购物");
        title.add("明星");
        title.add("视频");
        title.add("健康");
        title.add("励志");
        title.add("图文");
        title.add("本地");
        title.add("动漫");
        title.add("搞笑");
        title.add("科技");
//        for (int i=0;i<title.size();i++){
//            tabLayout.addTab(tabLayout.newTab().setText(title.get(i)));
//        }
        List<Fragment>fragments=new ArrayList<>();
        for (int i=0;i<title.size();i++){
            fragments.add(new ListFragment());
        }
        FragmentAdapter fragmentAdapter=new FragmentAdapter(getSupportFragmentManager(),fragments,title);
        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabsFromPagerAdapter(fragmentAdapter);
    }
}