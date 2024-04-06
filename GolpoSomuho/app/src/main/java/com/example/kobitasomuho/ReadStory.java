package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
               story_.setText(R.string.golpomanik1);
           } else if (story.equals("mtwo")) {
               storyName.setText(R.string.golponamemanik2);
               story_.setText(R.string.golpomanik2);
           }
        }
    }
}