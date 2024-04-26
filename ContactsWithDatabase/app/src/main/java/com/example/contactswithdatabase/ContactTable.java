package com.example.contactswithdatabase;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class ContactTable extends DBHelper{

    public ContactTable(Context context) {
        super(context);
    }

    public void insertContact(ContactModel cm){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_CONTACT_NAME, cm.name);
        cv.put(COL_CONTACT_EMAIL, cm.email);
        cv.put(COL_CONTACT_NUMBER, cm.phoneNumber);
        db.insert(TAB_CONTACT, null, cv);
        db.close();
    }

    public ArrayList<ContactModel> getAllContacts(){

        ArrayList<ContactModel> allContacts = new ArrayList<>();

        SQLiteDatabase db = getReadableDatabase();

        Cursor c = db.query(TAB_CONTACT, null, null, null, null, null, null);

        while (c.moveToNext()){
            @SuppressLint("Range") int id = c.getInt(c.getColumnIndex(COL_CONTACT_ID));
            @SuppressLint("Range") String name = c.getString(c.getColumnIndex(COL_CONTACT_NAME));
            @SuppressLint("Range") String email = c.getString(c.getColumnIndex(COL_CONTACT_EMAIL));
            @SuppressLint("Range") String phone = c.getString(c.getColumnIndex(COL_CONTACT_NUMBER));
            ContactModel cm = new ContactModel(id, name, email, phone);
            allContacts.add(cm);
        }
        db.close();
        return allContacts;
    }

    private void updateContact(){

    }

    private void deleteContact(){

    }
}
