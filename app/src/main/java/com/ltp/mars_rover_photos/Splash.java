package com.ltp.mars_rover_photos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread(){
            @Override
            public void run(){
                try {
                    sleep(4000);
                    Intent intent = new Intent(Splash.this, login.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                super.run();
            }
        };thread.start();
    }
}