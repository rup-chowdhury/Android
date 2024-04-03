package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GolpoNameMujtaba extends AppCompatActivity {

    String[] golpoName;

    String[] golpo;

    ListView listGolpo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golpo);

        listGolpo = findViewById(R.id.lst_golpo);

        golpoName = getResources().getStringArray(R.array.golponame);

        listGolpo.setAdapter(new ArrayAdapter<String>(GolpoNameMujtaba.this, android.R.layout.simple_list_item_1, golpoName));

        
        startActivity(new Intent(GolpoNameMujtaba.this, GolpoMujtaba.class));
    }
}