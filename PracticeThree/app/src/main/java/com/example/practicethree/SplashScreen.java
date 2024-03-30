package com.example.practicethree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SplashScreen extends AppCompatActivity {

    ConstraintLayout actSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        actSplash = findViewById(R.id.act_splash);

        actSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SplashScreen.this, MainActivity.class);

                startActivity(i);

                //startActivity(new Intent(SplashScreen.this, MainActivity.class));
            }
    }
}
}