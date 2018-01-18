package com.hxh.test_style;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity
{
    int type = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
        final RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
        final RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);
        final RadioButton rb3 = (RadioButton) findViewById(R.id.rb3);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId)
            {
                if(checkedId==rb1.getId())
                {
                    type=1;
                }
                else  if(checkedId==rb2.getId())
                {
                    type=2;
                }
                else  if(checkedId==rb3.getId())
                {
                    type=3;
                }
            }
        });
    }

    public void view(View v)
    {
        startActivity(new Intent(this, ViewActivity.class));
    }

    public void type1(View v)
    {
        startActivity(new Intent(this, TypeActivity1.class));
    }

    public void type2(View v)
    {
        startActivity(new Intent(this, TypeActivity2.class));
    }

    public void type3(View v)
    {
        Intent it = new Intent(this, TypeActivity3.class);
        it.putExtra("color", type);
        startActivity(it);
    }

    public void type4(View v)
    {
        startActivity(new Intent(this, TypeActivity4.class));
    }

    public void type5(View v)
    {
        startActivity(new Intent(this, TypeActivity5.class));
    }

    public void type6(View v)
    {
        startActivity(new Intent(this, TypeActivity6.class));
    }
}
