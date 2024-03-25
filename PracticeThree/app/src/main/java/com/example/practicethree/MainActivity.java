package com.example.practicethree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnAC, btnPlusMinus, btnPercentage, btnDivision, btnMultiply, btnMinus, btnPlus, btnEqual, btnDot;

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
    }
}