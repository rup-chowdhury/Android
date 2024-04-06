package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GolpoNameMujtaba extends AppCompatActivity {

    String[] golpoName;

    ListView listGolpo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golpo);

        listGolpo = findViewById(R.id.lst_golpo);

        golpoName = getResources().getStringArray(R.array.golponame);

        listGolpo.setAdapter(new ArrayAdapter<String>(GolpoNameMujtaba.this, android.R.layout.simple_list_item_1, golpoName));

        listGolpo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    Intent ca = new Intent(getApplicationContext(), ReadStory.class);
                    ca.putExtra("manik", "muj1");
                    startActivity(ca);
                } else if (position == 1) {
                    Intent ca = new Intent(getApplicationContext(), ReadStory.class);
                    ca.putExtra("manik","mujtwo");
                    startActivity(ca);
                }
            }
        });

    }
}