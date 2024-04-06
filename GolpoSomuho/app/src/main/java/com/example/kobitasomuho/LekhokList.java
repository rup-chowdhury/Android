package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LekhokList extends AppCompatActivity {

    String[] lekhok;

    String[] dob;

    ListView listLekhok;

    int[] images = {R.drawable.mujtaba, R.drawable.manik, R.drawable.satyajit, R.drawable.siraj, R.drawable.bivuti};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lekhok_list);

        //Try for the large text

        private String getLargeString() {
            StringBuilder largeString = new StringBuilder();
            BufferedReader reader;
            try {
                reader = new BufferedReader(new InputStreamReader(getAssets().open("large_string.txt")));
                String str;
                while ((str = reader.readLine()) != null) {
                    largeString.append(str);
                }
                reader.close();
                return largeString.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }




        listLekhok = findViewById(R.id.lst_lekhok);

        lekhok = getResources().getStringArray(R.array.lekhokname);

        dob = getResources().getStringArray(R.array.lekhokbirth);


        listLekhok.setAdapter(new CustomLekhokListAdapter(lekhok, dob, images, LekhokList.this));

        listLekhok.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(LekhokList.this, lekhok[position], Toast.LENGTH_SHORT).show();

                if (position == 0) {
                    startActivity(new Intent(LekhokList.this, GolpoNameMujtaba.class));
                } else if (position == 1) {
                    startActivity(new Intent(LekhokList.this, GolpoListManik.class));
                }
            }
        });
    }
}