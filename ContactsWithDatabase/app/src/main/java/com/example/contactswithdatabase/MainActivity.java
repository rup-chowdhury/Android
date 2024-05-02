package com.example.contactswithdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtEmail, edtPhone;

    Button btnSave, btnAllContacts;

    ArrayList<ContactModel> allContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            ContactModel cm = getIntent().getSerializableExtra("id", ContactModel.class);

            if (cm != null){
                edtName.setText(cm.name);
                edtEmail.setText(cm.email);
                edtPhone.setText(cm.phoneNumber);
            }

        }

        edtName = findViewById(R.id.edt_name);
        edtEmail = findViewById(R.id.edt_email);
        edtPhone = findViewById(R.id.edt_phone);

        btnSave = findViewById(R.id.btn_save);

        btnAllContacts = findViewById(R.id.btn_all_contact);

        ContactTable ct = new ContactTable(MainActivity.this);
        allContacts = ct.getAllContacts();

        CustomAllContactsAdapter ca = new CustomAllContactsAdapter(MainActivity.this, allContacts);
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

                    ContactModel cm = new ContactModel(name, email, phone);  //Creating a constructor with 3 variables
                                                                             //either it will want an ID at first

                    ct.insertContact(cm);

                    Toast.makeText(MainActivity.this, "Contact Added", Toast.LENGTH_SHORT).show();



                }
            }
        });

        btnAllContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContactListActivity.class));
            }
        });
//        DBHelper myDBHelper = new DBHelper(MainActivity.this);

    }
}