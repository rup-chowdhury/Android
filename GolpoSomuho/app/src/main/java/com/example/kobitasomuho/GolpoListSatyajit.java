package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class GolpoListSatyajit extends AppCompatActivity {

    String[] golpoList;

    ListView lstGolpo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golpo_list_satyajit);

        lstGolpo = findViewById(R.id.lst_satyajit);

        golpoList = getResources().getStringArray(R.string.golponamesatyajit1);
    }
}