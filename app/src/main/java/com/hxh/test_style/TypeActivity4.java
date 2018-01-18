package com.hxh.test_style;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class TypeActivity4 extends AppCompatActivity
{
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //要么沉浸，要么设置颜色不沉浸

        //顶部状态栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//        getWindow().setStatusBarColor(getResources().getColor(R.color.type1));

        //底部导航栏
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
//        getWindow().setNavigationBarColor(getResources().getColor(R.color.type2));

        setContentView(R.layout.act_type);
    }
}
