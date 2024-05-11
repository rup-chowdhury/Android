package com.rup.signinsignupfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        
    }
}