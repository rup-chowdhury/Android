package com.example.practicethree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnAC, btnPlusMinus, btnPercentage, btnDivision, btnMultiply, btnMinus, btnPlus, btnEqual, btnDot;

    TextView txtScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.button_one);
        btnTwo = findViewById(R.id.button_two);
        btnThree = findViewById(R.id.button_three);
        btnFour = findViewById(R.id.button_four);
        btnFive = findViewById(R.id.button_five);
        btnSix = findViewById(R.id.button_six);
        btnSeven = findViewById(R.id.button_seven);
        btnEight = findViewById(R.id.button_eight);
        btnNine = findViewById(R.id.button_nine);
        btnZero = findViewById(R.id.button_zero);
        btnAC = findViewById(R.id.button_ac);
        btnPlusMinus = findViewById(R.id.button_plus_minus);
        btnPercentage = findViewById(R.id.button_percentage);
        btnDivision = findViewById(R.id.button_division);
        btnMultiply = findViewById(R.id.button_multiply);
        btnMinus = findViewById(R.id.button_minus);
        btnPlus = findViewById(R.id.button_plus);
        btnEqual = findViewById(R.id.button_equal);
        btnDot = findViewById(R.id.button_dot);

        txtScreen = findViewById(R.id.text_screen);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = txtScreen.getText().toString();
                txtScreen.setText(input + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = txtScreen.getText().toString();
                txtScreen.setText(input +"2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText("3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText("4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText("5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText("6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText("7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText("8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText("9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText("0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText(".");
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
            case
    }
}

















