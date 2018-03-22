package com.example.fanzhaoyu.loginapp;

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {
    private ViewPager mMainVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        mMainVp=(ViewPager)findViewById(R.id.main_vp);

        List<Fragment> fragments=new ArrayList<>();
        fragments.add(new TextFragment());
        fragments.add(new imgFragment());
        fragments.add(new TextFragment());
        MainAdapter mainAdapter=new MainAdapter(getSupportFragmentManager(),fragments);
        mMainVp.setAdapter(mainAdapter);
    }
}
