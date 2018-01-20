package com.hxh.style;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TypeActivity5 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        MyApp app = (MyApp) this.getApplication();

        if (app.theme == R.style.AppTheme_Light)
        {
            setTheme(R.style.AppTheme_Light);
            //使用默认主题
        }
        else if (app.theme == R.style.AppTheme_Dark)
        {
            //使用自定义的主题
            setTheme(R.style.AppTheme_Dark);
        }

        setContentView(R.layout.act_setbg);
    }

    public void setstyle(View v)
    {
        MyApp app = (MyApp) this.getApplication();

        if (app.theme == R.style.AppTheme_Light)
        {
            app.theme = R.style.AppTheme_Dark;
        }
        else if (app.theme == R.style.AppTheme_Dark)
        {
            app.theme = R.style.AppTheme_Light;
        }

        recreate();
    }
}

