package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtEmail, edtPhoneNumber;
    Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_name);
        edtEmail = findViewById(R.id.edt_email);
        edtPhoneNumber = findViewById(R.id.edt_phone_number);
        btnSave = findViewById(R.id.btn_save);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, email, phone;

                name = edtName.getText().toString();
                email = edtEmail.getText().toString();
                phone = edtPhoneNumber.getText().toString();

                if (name.isEmpty() || email.isEmpty() || phone.isEmpty()){
                    Toast.makeText(MainActivity.this, "Some information is missing, please check!!",
                            Toast.LENGTH_SHORT).show();

                }else{
                    ContactTable ct = new ContactTable(MainActivity.this);
                    ContactModel cm = new ContactModel(name, email,phone);
                    ct.insertContact(cm);
                    Toast.makeText(MainActivity.this, "Contact added.", Toast.LENGTH_SHORT).show();
                }


            }
        });
//        DBHelper myDbHerlper = new DBHelper(MainActivity.this);

    }
}