package com.rup.signinsignupfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Info extends AppCompatActivity {

    FirebaseAuth mAuth;

    TextView txtEmail;

    Button btnLogOut;

    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        mAuth = FirebaseAuth.getInstance();

        txtEmail = findViewById(R.id.txt_email);

        btnLogOut = findViewById(R.id.btn_log_out);

        
    }
}