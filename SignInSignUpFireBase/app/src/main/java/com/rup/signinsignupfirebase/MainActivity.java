package com.rup.signinsignupfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtSignInEmail, edtSignInPassword;

    Button btnSignUp, btnRegisterUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSignInEmail = findViewById(R.id.edt_signin_email);
        edtSignInPassword = findViewById(R.id.edt_signin_password);

        btnSignUp = findViewById(R.id.btn_sign_in);
        btnRegisterUser = findViewById(R.id.btn_register_user);


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnRegisterUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NewUser.class);
                startActivity(i);
            }
        });
    }
}