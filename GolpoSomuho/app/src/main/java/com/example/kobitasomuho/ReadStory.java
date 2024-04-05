package com.example.kobitasomuho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReadStory extends AppCompatActivity {

    Bundle extras = getIntent().getExtras();
    String story = "demo text";

    TextView storyName = findViewById(R.id.story_name);

    TextView story_ = findViewById(R.id.story);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_story);

        if (extras != null){
           story = extras.getString("manik");

           if (story.equals("mone")){
               storyName.setText(R.string.golponamemanik1);
               story_.setText(R.string.golpomanik1_1 + R.string.golpomanik1_2 + R.string.golpomanik1_3 + R.string.golpomanik1_4);
           }
        }
    }
}