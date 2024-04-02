package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Log.e("Rup","onCreate");
        new Handler().postDelayed(new Runnable() {  //Delay Timer on Splash screen
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, LekhokList.class));
            finish();
            }
        },2000);
        }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}