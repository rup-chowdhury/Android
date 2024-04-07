package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadStory extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_story);

        Bundle extras = getIntent().getExtras();
        String story = "demo text";

        TextView storyName = findViewById(R.id.story_name);

        TextView story_ = findViewById(R.id.story);

        if (extras != null){
           story = extras.getString("manik");

           if (story.equals("mone")){
               storyName.setText(R.string.golponamemanik1);

               String part1 = getResources().getString(R.string.golpomanik1_1);
               String part2 = getResources().getString(R.string.golpomanik1_2);
               String part3 = getResources().getString(R.string.golpomanik1_3);


               String fullStory = part1 + part2 +
                       part3;

               story_.setText(fullStory);
           } else if (story.equals("mtwo")) {
               storyName.setText(R.string.golponamemanik2);
               story_.setText(R.string.golpomanik2);
           } else if (story.equals("muj1")) {
               storyName.setText(R.string.golponamemujtaba1);
               story_.setText(R.string.golpo1);
           } else if (story.equals("mujtwo")) {
               storyName.setText(R.string.golponamemujtaba2);
               story_.setText(R.string.golpo2);
               Log.e("RUP", "Rosh");

           }
        }
    }
}