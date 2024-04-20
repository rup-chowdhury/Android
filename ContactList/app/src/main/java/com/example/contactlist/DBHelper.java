package com.example.contactlist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final String TAB_CONTACT = "contact";
    public static final String COL_CONTACT_ID = "id";
    public static final String COL_CONTACT_NAME = "name";
    public static final String COL_CONTACT_EMAIL = "email";
    public static final String COL_CONTACT_PHONE = "phone";
    public DBHelper(Context context) {
        super(context, "my_db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE IF NOT EXISTS contact("+ COL_CONTACT_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, email TEXT, phone TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("CREATE TABLE IF NOT EXISTS contact(id int PRIMARY KEY AUTOINCREMENT, name TEXT, email TEXT, phone TEXT)");
    }
}
