package com.example.fourth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class SplashScreen extends AppCompatActivity {

    ConstraintLayout llSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        llSplash = findViewById(R.id.ll_splash);


        Log.e("Rup","onCreate");
//        llSplash.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                Intent i = new Intent(SplashScreen.this, MainActivity.class);
//
//                startActivity(i);
//
//                //startActivity(new Intent(SplashScreen.this, MainActivity.class));
//            }


//        new Handler().postDelayed(new Runnable() {  //Delay Timer on Splash screen
//            @Override
//            public void run() {
//                startActivity(new Intent(SplashScreen.this, MainActivity.class));
//            finish();
//            }
//        },2000);
//        };

//        Thread th = new Thread(){
//
//            @Override
//            public void run() {
//                super.run();
//
//                try {
//                    sleep(3000);
//                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };

        //th.start();

        new Thread(){

            @Override
            public void run() {
                super.run();

                try {
                    sleep(3000);
                    startActivity(new Intent(SplashScreen.this, KobiList.class));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e("Rup", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("Rup", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e("Rup", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e("Rup", "onPause");

        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("Rup", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("Rup", "onDestroy");
    }
}
