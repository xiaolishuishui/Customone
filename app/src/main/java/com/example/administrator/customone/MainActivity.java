package com.example.administrator.customone;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Custom histogram_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

       initData();
        //=====================================

    }

    private void initData() {
        //在list集合添加数据
        ArrayList<Custom.Bar> list = new ArrayList<Custom.Bar>();
        for(int i=1; i<6; i++){
            //取得随机颜色
            float ratio = (float) Math.random();
            int color = (int) (Color.GRAY * ratio);
            Custom.Bar bar=new Custom.Bar(i, ratio, color, "第"+i+"名 ", "10000"+i);
            list.add(bar);
        }
        histogram_view.setBarLists(list);
    }

    private void initView() {
        histogram_view = (Custom) findViewById(R.id.histogram_view);
    }
}