package com.example.contactswithdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper myDBHelper = new DBHelper(MainActivity.this);

        ContactTable ct = new ContactTable(MainActivity.this);

        ct.insertContact("RUP", "rupbd1@gmail.com", "01915817061");
    }
}