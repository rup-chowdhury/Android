package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Golpo extends AppCompatActivity {

    String[] golpoName;

    String[] golpo;

    ListView listGolpo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golpo);

        listGolpo = findViewById(R.id.lst_golpo);

        golpoName = getResources().getStringArray(R.array.golponame);

        listGolpo.setAdapter(new ArrayAdapter<String>(Golpo.this, android.R.layout.simple_list_item_1, golpoName));
    }
}