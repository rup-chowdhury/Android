package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class GolpoListManik extends AppCompatActivity {

    String[] golpoName;

    ListView lstGolpo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golpo_list_manik);

        lstGolpo = findViewById(R.id.lst_golpo_manik);
    }
}