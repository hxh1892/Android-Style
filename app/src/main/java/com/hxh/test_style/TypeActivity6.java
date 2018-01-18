package com.hxh.test_style;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TypeActivity6 extends AppCompatActivity
{
    View view;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_setsystemui);

        view = getWindow().getDecorView();
    }

    public void bt1(View v)
    {
        //恢复正常状态
        view.setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
    }

    public void bt2(View v)
    {
        //隐藏状态栏（顶部下滑恢复正常状态）
        view.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    public void bt3(View v)
    {
        //隐藏状态栏（顶部下滑恢复正常状态）
        view.setSystemUiVisibility(View.INVISIBLE);
    }

    public void bt4(View v)
    {
        //顶端布局会被状态栏遮住（只有点击恢复正常状态才可恢复）
        view.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }

    public void bt5(View v)
    {
        //顶端布局会被状态栏遮住（只有点击恢复正常状态才可恢复）
        view.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
    }

    public void bt6(View v)
    {
        //顶端布局会被状态栏遮住（只有点击恢复正常状态才可恢复）
        view.setSystemUiVisibility(View.SYSTEM_UI_LAYOUT_FLAGS);
    }

    public void bt7(View v)
    {
        //隐藏导航栏（任何点击恢复正常状态）
        view.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }

    public void bt8(View v)
    {
        //状态栏显示处于低能显示状态(low profile模式)，状态栏导航栏上一些图标显示会被隐藏(底部上顶部下滑呼出恢复正常状态)
        view.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE);
    }

    public void bt9(View v)
    {
        //隐藏导航栏(底部上顶部下滑呼出恢复正常状态)
        view.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE);
    }

    public void bt10(View v)
    {
        //隐藏导航栏(底部上顶部下滑呼出导航栏，过一段时间自动消失)
        view.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

    public void bt11(View v)
    {
        //全屏模式(底部上顶部下滑呼出导航栏，过一段时间自动消失)
        view.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
}
