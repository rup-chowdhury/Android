package com.example.contactswithdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtEmail, edtPhone;

    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_name);
        edtEmail = findViewById(R.id.edt_email);
        edtPhone = findViewById(R.id.edt_phone);

        btnSave = findViewById(R.id.btn_save);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, email, phone;

                name = edtName.getText().toString();
                email = edtEmail.getText().toString();
                phone = edtPhone.getText().toString();

                if(name.isEmpty() || email.isEmpty() || phone.isEmpty()){
                    Toast.makeText(MainActivity.this, "Information Missing!", Toast.LENGTH_SHORT).show();
                } else {
                    ContactTable ct = new ContactTable(MainActivity.this);

                    ct.insertContact(name, email, phone);

                    Toast.makeText(MainActivity.this, "Contact Added", Toast.LENGTH_SHORT).show();
                }
            }
        });


//        DBHelper myDBHelper = new DBHelper(MainActivity.this);

    }
}