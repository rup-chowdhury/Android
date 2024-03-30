package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LekhokList extends AppCompatActivity {

    String[] lekhok;

    String[] dob;

    int[] images = {R.drawable.mujtaba, R.drawable.manik, R.drawable.satyajit, R.drawable.siraj, R.drawable.bivuti};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lekhok_list);
    }
}