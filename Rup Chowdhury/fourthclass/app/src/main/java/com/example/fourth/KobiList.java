package com.example.fourth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class KobiList extends AppCompatActivity {


    //String[] kobis = {"Ruplaal", "Kazi Nazrul Islam", "Syed Mujtaba Ali", "Ruplaal", "Kazi Nazrul Islam", "Syed Mujtaba Ali", "Ruplaal", "Kazi Nazrul Islam", "Syed Mujtaba Ali", "Ruplaal", "Kazi Nazrul Islam", "Syed Mujtaba Ali"};

    String[] kobis;

    String[] dob;

    int[] images = {R.drawable.baseline_personal_injury_24, R.drawable.kazi, R.drawable.rabi};

    ListView lstKobis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kobi_list);


        lstKobis = findViewById(R.id.lst_kobi);

        kobis = getResources().getStringArray(R.array.kobis);

        dob = getResources().getStringArray(R.array.dob);

        lstKobis.setAdapter(new CustomKobiAdapter(KobiList.this, kobis, dob, images));


        //lstKobis.setAdapter(new ArrayAdapter<String>(KobiList.this, R.layout.item_kobi_list, R.id.txt_kobi , kobis));



        lstKobis.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(KobiList.this, kobis[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}