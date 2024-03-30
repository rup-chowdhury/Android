package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class LekhokList extends AppCompatActivity {

    String[] lekhok;

    String[] dob;

    ListView

    int[] images = {R.drawable.mujtaba, R.drawable.manik, R.drawable.satyajit, R.drawable.siraj, R.drawable.bivuti};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lekhok_list);

        lstKobis = findViewById(R.id.lst_kobi);

        kobis = getResources().getStringArray(R.array.kobis);

        dob = getResources().getStringArray(R.array.dob);
    }
}