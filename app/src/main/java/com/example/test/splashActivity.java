package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashActivity extends Activity {
    private static  int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

   /*     Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(splashActivity.this,dashboardActivity.class));
                }
            }
        };
        thread.start(); */

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(splashActivity.this,dashboardActivity.class);
                startActivity(homeIntent);
                finish();
            }
        } , SPLASH_TIME_OUT);
    }



}
