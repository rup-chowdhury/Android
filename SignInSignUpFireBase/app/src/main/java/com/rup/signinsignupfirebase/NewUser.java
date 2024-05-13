package com.rup.signinsignupfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class NewUser extends AppCompatActivity {

    EditText edtSignUpEmail, edtSignUpPassword;

    Button btnSignUp, btnSignIn;

    ProgressBar progressBar;

    FirebaseAuth mAuth;

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent i = new Intent(NewUser.this, MainActivity.class);
            startActivity(i);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user);

        mAuth = FirebaseAuth.getInstance();

        progressBar = findViewById(R.id.progress_bar);

        edtSignUpEmail = findViewById(R.id.edt_signup_email);
        edtSignUpPassword = findViewById(R.id.edt_signup_password);

        btnSignUp = findViewById(R.id.btn_sign_up);
        btnSignIn = findViewById(R.id.log_in);

        btnSignUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                progressBar.setVisibility(View.VISIBLE);
                userRegister();
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewUser.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }

    private void userRegister() {
        String email = edtSignUpEmail.getText().toString().trim();
        String password = edtSignUpPassword.getText().toString().trim();

        if (email.isEmpty()){
            edtSignUpEmail.setError("Please put an email address");
            edtSignUpEmail.requestFocus();
            return;
        }

        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            edtSignUpEmail.setError("Please put a valid email");
            edtSignUpEmail.requestFocus();
            return;
        }

        if (password.isEmpty()){
            edtSignUpPassword.setError("Please put a password");
            edtSignUpPassword.requestFocus();
            return;
        }

        if (password.length()<6){
            edtSignUpPassword.setError("Minimum length of a password should be 6");
            edtSignUpPassword.requestFocus();
            return;
        }


        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar.setVisibility(View.GONE);
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(NewUser.this, "Authentication successful.",
                                    Toast.LENGTH_SHORT).show();

                            FirebaseUser user = mAuth.getCurrentUser();

                            Intent i = new Intent(NewUser.this, MainActivity.class);
                            startActivity(i);
                            finish();
                        } else {
                            // If sign in fails, display a message to the user.

                            Toast.makeText(NewUser.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }
                    }
                });


    }
}
