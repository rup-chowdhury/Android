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

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnPlusMinus.setOnClickListener(this);
        btnPercentage.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnDot.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String input = txtScreen.getText().toString();

//        if (v.getId() == R.id.button_one){
//            txtScreen.setText(input + "1");
//        } else if (v.getId() == R.id.button_two){
//            txtScreen.setText(input + "2");
//        }

        switch (v.getId()){
            case R.id.button_one:
                txtScreen.setText(input + "1");
                break;

            case R.id.button_two:
                txtScreen.setText(input + "2");
                break;

            case R.id.button_three:
                txtScreen.setText(input + "3");
                break;

            case R.id.button_four:
                txtScreen.setText(input + "4");
                break;

            case R.id.button_five:
                txtScreen.setText(input + "5");
                break;

            case R.id.button_six:
                txtScreen.setText(input + "6");
                break;

            case R.id.button_seven:
                txtScreen.setText(input + "7");
                break;

            case R.id.button_eight:
                txtScreen.setText(input + "8");
                break;

            case R.id.button_nine:
                txtScreen.setText(input + "9");
                break;

            case R.id.button_zero:
                txtScreen.setText(input + "0");
                break;

            case R.id.button_dot:
                txtScreen.setText(input + ".");
                break;
        }

    }
}

















