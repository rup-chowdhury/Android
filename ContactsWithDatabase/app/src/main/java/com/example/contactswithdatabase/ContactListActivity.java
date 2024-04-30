package com.example.contactswithdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ContactListActivity extends AppCompatActivity {

    ListView lstContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);

        lstContacts = findViewById(R.id.lst_contacts);

        
    }
}