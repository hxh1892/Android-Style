package com.hxh.test_style;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hxh.test_style.StatusBarColorChange.StatusBarColorChangeUtils;

public class TypeActivity3 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
//        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        int type = getIntent().getIntExtra("color", 1);

        if (type == 1)
        {
//            ImmerseThemeUtils.compat(this, Color.parseColor("#339900dd"));
            StatusBarColorChangeUtils.setStatusBarColor(this, R.color.type1);
        }
        else if (type == 2)
        {
//            ImmerseThemeUtils.compat(this, Color.parseColor("#8800dd99"));
            StatusBarColorChangeUtils.setStatusBarColor(this, R.color.type2);
        }
        else if (type == 3)
        {
//            ImmerseThemeUtils.compat(this, Color.parseColor("#ccee5500"));
            StatusBarColorChangeUtils.setStatusBarColor(this, R.color.type3);
        }

        setContentView(R.layout.act_type);
    }
}
