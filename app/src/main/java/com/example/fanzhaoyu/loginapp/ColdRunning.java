package com.example.fanzhaoyu.loginapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ColdRunning extends AppCompatActivity {
    private ViewPager mainVp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coldruning);

        Button start=findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                goToSecondAty(v);
            }
        });
        mainVp=findViewById(R.id.main_vp);
        List<View> views=new ArrayList<>();
        View viewText= LayoutInflater.from(this)
                .inflate(R.layout.view_test,null);
        views.add(viewText);

        View viewImage=LayoutInflater
                .from(this)
                .inflate(R.layout.view_img, null);
        views.add(viewImage);

        MainVpAdapter adapter=new MainVpAdapter(views);
        mainVp.setAdapter(adapter);

        mainVp.setCurrentItem(0);
        mainVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }//当页面滚动的时候

            @Override
            public void onPageSelected(int position) {
                Log.d("hello ", String.valueOf(position));
            }//页面全部占据屏幕的时候
            @Override
            public void onPageScrollStateChanged(int state) {

            }//滚动和停止状态互相改变的时候
        });
    }
    public void goToSecondAty(View view)
    {
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
