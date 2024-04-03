package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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


        listLekhok.setAdapter(new CustomLekhokListAdapter(lekhok, dob, images, LekhokList.this));

        listLekhok.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(LekhokList.this, lekhok[position], Toast.LENGTH_SHORT).show();

                startActivity(new Intent(LekhokList.this, Golpo.class));
            }
        });
    }
}