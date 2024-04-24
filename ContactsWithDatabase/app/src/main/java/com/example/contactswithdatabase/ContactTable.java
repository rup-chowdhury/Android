package com.example.contactswithdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ContactTable extends DBHelper{

    public ContactTable(Context context) {
        super(context);
    }

    public void insertContact(String name, String email, String phone){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_CONTACT_NAME, name);
        cv.put(COL_CONTACT_EMAIL, email);
        cv.put(COL_CONTACT_NUMBER, phone);
        db.insert(TAB_CONTACT, null, cv);
        db.close();
    }

    private void getAllContacts(){

    }

    private void updateContact(){

    }

    private void deleteContact(){

    }
}
