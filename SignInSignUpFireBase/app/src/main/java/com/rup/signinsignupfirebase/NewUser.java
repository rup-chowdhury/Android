package com.rup.signinsignupfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NewUser extends AppCompatActivity {

    EditText edtSignUpEmail, edtSignUpPassword;

    Button btnSignUp, btnSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user);

        edtSignUpEmail = findViewById(R.id.edt_signup_email);
        edtSignUpPassword = findViewById(R.id.edt_signup_password);

        btnSignUp = findViewById(R.id.btn_sign_up);
        btnSignIn = findViewById(R.id.log_in);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userRegister();
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewUser.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

    private void userRegister() {
        String email = edtSignUpEmail.getText().toString().trim();
        String password = edtSignUpPassword.getText().toString().trim();

        if (email.isEmpty()){
            edtSignUpEmail.setError("Please put valid email");
            edtSignUpEmail.requestFocus();
            return;
        }

    }
}
