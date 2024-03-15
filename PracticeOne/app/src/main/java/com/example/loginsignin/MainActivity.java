//This app consists of two pages. They are login page and signup page.
//User can go from one page to another by clicking designated button.
package com.example.loginsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signUp;

        signUp = (android.widget.Button)findViewById(R.id.registerUser);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, newUser.class);

                startActivity(intent);
            }
        });
    }
}