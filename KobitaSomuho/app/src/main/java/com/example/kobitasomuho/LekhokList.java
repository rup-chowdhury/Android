package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class LekhokList extends AppCompatActivity {

    String[] lekhok;

    String[] dob;

    ListView listLekhok;

    int[] images = {R.drawable.mujtaba, R.drawable.manik, R.drawable.satyajit, R.drawable.siraj, R.drawable.bivuti};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lekhok_list);

        listLekhok = findViewById(R.id.lst_lekhok);

        lekhok = getResources().getStringArray(R.array.lekhokname);

        dob = getResources().getStringArray(R.array.lekhokbirth);


    }
}