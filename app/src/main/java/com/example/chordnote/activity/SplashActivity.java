package com.example.chordnote.activity;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.chordnote.ui.UIHelper;

public class SplashActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // 设置启动界面的应用logo
        ImageView splashLogo = (ImageView) findViewById(R.id.splash_image);
        splashLogo.setImageResource(R.mipmap.ic_launcher);
        // 5秒后进入主界面（学习界面）
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                UIHelper.showMain(SplashActivity.this);
            }
        }, 3000);
    }
}
