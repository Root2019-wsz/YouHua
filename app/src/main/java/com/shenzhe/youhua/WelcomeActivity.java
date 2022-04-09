package com.shenzhe.youhua;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import androidx.annotation.Nullable;

public class WelcomeActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);


        //系统日志输出获取启动时间
        //I/ActivityTaskManager: Displayed com.shenzhe.youhua/.WelcomeActivity: +1s10ms
    }
}
