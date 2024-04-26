package com.example.contactswithdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtEmail, edtPhone;

    Button btnSave;

    ArrayList<ContactModel> allContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_name);
        edtEmail = findViewById(R.id.edt_email);
        edtPhone = findViewById(R.id.edt_phone);

        btnSave = findViewById(R.id.btn_save);

        ContactTable ct = new ContactTable(MainActivity.this);
        allContacts = ct.getAllContacts();
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
                    ContactModel cm = new ContactModel(name, email, phone);
                    ct.insertContact(cm);

                    Toast.makeText(MainActivity.this, "Contact Added", Toast.LENGTH_SHORT).show();
                }
            }
        });


//        DBHelper myDBHelper = new DBHelper(MainActivity.this);

    }
}