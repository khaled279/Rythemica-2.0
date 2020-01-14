package com.example.rythemica;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class SplashScreen extends AppCompatActivity {
    public static int splashTimer = 3000 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_splash_screen);
        setTheme(R.style.splashScreenTheme);
        getSupportActionBar().hide(); //hide the title bar

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashScreen = new Intent(SplashScreen.this , MainActivity.class) ;
                startActivity(splashScreen);
                finish();
            }
        } , splashTimer);
        super.onCreate(savedInstanceState);
    }
}
