package com.rup.signinsignupfirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    EditText edtSignInEmail, edtSignInPassword;

    Button btnSignUp, btnRegisterUser;

    FirebaseAuth mAuth;

    ProgressBar progressBar;

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent i = new Intent(MainActivity.this, Info.class);
            startActivity(i);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progress_bar);

        mAuth = FirebaseAuth.getInstance();

        edtSignInEmail = findViewById(R.id.edt_signin_email);
        edtSignInPassword = findViewById(R.id.edt_signin_password);

        btnSignUp = findViewById(R.id.btn_sign_in);
        btnRegisterUser = findViewById(R.id.btn_register_user);


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userRegister();
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

    private void userRegister() {
        String email = edtSignInEmail.getText().toString().trim();
        String password = edtSignInPassword.getText().toString().trim();

        if (email.isEmpty()){
            edtSignInEmail.setError("Enter an Valid Email");
            edtSignInEmail.requestFocus();
            return;
        }

        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            edtSignInEmail.setError("Please put a valid email");
            edtSignInEmail.requestFocus();
            return;
        }

        if (password.isEmpty()){
            edtSignInPassword.setError("Please put a password");
            edtSignInPassword.requestFocus();
            return;
        }

        if (password.length()<6){
            edtSignInPassword.setError("Minimum length of a password should be 6");
            edtSignInPassword.requestFocus();
            return;
        }

        mAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
        @Override
        public void onComplete(@NonNull Task<AuthResult> task) {
            progressBar.setVisibility(View.GONE);
            if (task.isSuccessful()) {
                Toast.makeText(MainActivity.this, "Authentication Successful.",
                        Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Info.class);
                startActivity(i);
                finish();


            } else {
                // If sign in fails, display a message to the user.

                Toast.makeText(MainActivity.this, "Authentication failed.",
                        Toast.LENGTH_SHORT).show();

            }
        }
    });
    }

}