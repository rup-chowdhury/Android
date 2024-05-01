package com.example.contactswithdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ContactListActivity extends AppCompatActivity {

    ListView lstContacts;

    ArrayList<ContactModel> allContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);

        lstContacts = findViewById(R.id.lst_contacts);


        ContactTable ct = new ContactTable(ContactListActivity.this);


        allContacts = ct.getAllContacts();


        lstContacts.setAdapter(new CustomAllContactsAdapter(ContactListActivity.this, allContacts));


        lstContacts.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(Con)

                return false;
            }
        });
    }
}