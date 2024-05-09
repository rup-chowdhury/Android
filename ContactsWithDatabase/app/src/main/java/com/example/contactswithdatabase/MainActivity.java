package com.example.contactswithdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtEmail, edtPhone;

    Button btnSave, btnAllContacts, btnClear;

    ContactTable ct;

    boolean isEdit = false;

    ArrayList<ContactModel> allContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ct = new ContactTable(MainActivity.this);

        edtName = findViewById(R.id.edt_name);
        edtEmail = findViewById(R.id.edt_email);
        edtPhone = findViewById(R.id.edt_phone);

        btnSave = findViewById(R.id.btn_save);



        btnAllContacts = findViewById(R.id.btn_all_contact);

        allContacts = ct.getAllContacts();

        CustomAllContactsAdapter ca = new CustomAllContactsAdapter(MainActivity.this, allContacts);

        int id = getIntent().getIntExtra("id", -7);

        if (id != -7){

            isEdit = true;

            btnSave.setText("Update");     // The text of the button will change into "Update" when updating the data

            btnSave.setTextSize(20);
            btnSave.setPadding(90, 20, 70, 20);


            ContactModel cm= ct.getContact(id);
            edtName.setText(cm.name);
            edtEmail.setText(cm.email);
            edtPhone.setText(cm.phoneNumber);
        }

//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
//            ContactModel cm = getIntent().getSerializableExtra("id", ContactModel.class);
//
//            if (cm != null){
//                edtName.setText(cm.name);
//                edtEmail.setText(cm.email);
//                edtPhone.setText(cm.phoneNumber);
//            }
//
//        }
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
                    ct = new ContactTable(MainActivity.this);

                    ContactModel cm = new ContactModel(name, email, phone);  //Creating a constructor with 3 variables
                                                                             //either it will want an ID at first

                    if (isEdit){
                        cm.id = id;
                        ct.updateContact(cm);
                        Toast.makeText(MainActivity.this, "Contact Updated", Toast.LENGTH_SHORT).show();
                    }else {
                        ct.insertContact(cm);
                        Toast.makeText(MainActivity.this, "Contact Added", Toast.LENGTH_SHORT).show();
                    }


                    Intent i = new Intent(MainActivity.this, ContactListActivity.class);
                    Bundle b = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle();

                    startActivity(i , b);


                }
            }
        });

        btnAllContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ContactListActivity.class);

                Bundle b = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle();

                startActivity(i, b);
            }
        });
//        DBHelper myDBHelper = new DBHelper(MainActivity.this);


        btnClear = findViewById(R.id.btn_clear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtName.setText("");
                edtEmail.setText("");
                edtPhone.setText("");
            }
        });
    }



    @Override
    protected void onPause() {
        super.onPause();

        if(!isEdit) {
        // Creating a shared pref object with a file name "MySharedPref" in private mode
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        // write all the data entered by the user in SharedPreference and apply
        myEdit.putString("name", edtName.getText().toString());
        myEdit.putString("email", edtEmail.getText().toString());
        myEdit.putString("number", edtPhone.getText().toString());
        myEdit.apply();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (!isEdit){
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        String s1 = sh.getString("name", "");
        String s2 = sh.getString("email", "");
        String s3 = sh.getString("number", "");

        // Setting the fetched data in the EditTexts
        edtName.setText(s1);
        edtEmail.setText(s2);
        edtPhone.setText(s3);

        }
    }
}