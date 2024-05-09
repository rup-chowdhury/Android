package com.example.contactswithdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;

import java.util.ArrayList;

public class ContactListActivity extends AppCompatActivity {

    ListView lstContacts;

    ArrayList<ContactModel> allContacts;

    LinearLayout layoutLinear;

    Button btnUpdate, btnDelete;

    ContactTable ct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);

        layoutLinear = findViewById(R.id.layout_linear);

        lstContacts = findViewById(R.id.lst_contacts);


        ct = new ContactTable(ContactListActivity.this);


        allContacts = ct.getAllContacts();


        lstContacts.setAdapter(new CustomAllContactsAdapter(ContactListActivity.this, allContacts));


        lstContacts.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

//                Opening the popup

                createPopUpWindow(position);




                return false;
            }
        });
    }

    private void createPopUpWindow(int position){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popUpView = inflater.inflate(R.layout.edit_delete_popup, null);



        int width = ViewGroup.LayoutParams.MATCH_PARENT;

        int height = ViewGroup.LayoutParams.MATCH_PARENT; // to show the popup in full screen

        boolean focusable = true;

        PopupWindow popupWindow = new PopupWindow(popUpView, width, height, focusable);


        layoutLinear.post(new Runnable() {
            @Override
            public void run() {
                popupWindow.showAtLocation(layoutLinear, Gravity.CENTER, 0, 0);
            }
        });

        btnUpdate = popUpView.findViewById(R.id.btn_update);
        btnDelete = popUpView.findViewById(R.id.btn_delete);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ContactListActivity.this, MainActivity.class);
                i.putExtra("id", allContacts.get(position).id);

                startActivity(i);

                popupWindow.dismiss();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct = new ContactTable(ContactListActivity.this);

                int id = allContacts.get(position).id;
                ContactModel cm = new ContactModel(id);

//                cm.id = id;

                ct.deleteContact(id);
                popupWindow.dismiss();

                startActivity(new Intent(ContactListActivity.this, ContactListActivity.class));



            }
        });
    }
}