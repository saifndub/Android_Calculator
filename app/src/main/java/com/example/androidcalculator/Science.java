package com.example.androidcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Science extends AppCompatActivity implements View.OnClickListener{

    Button btnBasic, btnScience;
    TextView txtDisplay, txtDisplay1;
    Button btnSeven, btnEight, btnNine, btnDel, btnAC, btnFour, btnFive,
            btnSix, btnMultiply, btnDivision, btnOne, btnTwo, btnThree, btnPlus, btnMinus,
            btnZero, btnDbZero, btnDot, btnPlusorMin, btnEqual;

    double fnum, snum, result;
    String text;
    String answer;
    String opt="";

    public int eq;
    public int flag;

    public Science() {
        flag = 0;
        eq = 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);

        btnBasic = findViewById(R.id.btn_basic);
        btnScience = findViewById(R.id.btn_sci);
        txtDisplay1 = findViewById(R.id.txt_display1);
        txtDisplay = findViewById(R.id.txt_display);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);
        btnFour = findViewById(R.id.btn_four);
        btnFive = findViewById(R.id.btn_five);
        btnSix = findViewById(R.id.btn_six);
        btnSeven = findViewById(R.id.btn_seven);
        btnEight = findViewById(R.id.btn_eight);
        btnNine = findViewById(R.id.btn_nine);
        btnZero = findViewById(R.id.btn_zero);
        btnDbZero = findViewById(R.id.btn_db_zero);
        btnDot = findViewById(R.id.btn_dot);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivision = findViewById(R.id.btn_division);
        btnPlusorMin = findViewById(R.id.btn_plusormin);
        btnDel = findViewById(R.id.btn_del);
        btnAC = findViewById(R.id.btn_ac);
        btnEqual = findViewById(R.id.btn_equal);

        btnBasic.setOnClickListener(this);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
//        btnThree.setOnClickListener(this);
//        btnFour.setOnClickListener(this);
//        btnFive.setOnClickListener(this);
//        btnSix.setOnClickListener(this);
//        btnSeven.setOnClickListener(this);
//        btnEight.setOnClickListener(this);
//        btnNine.setOnClickListener(this);
//        btnZero.setOnClickListener(this);
//        btnDbZero.setOnClickListener(this);
//        btnDot.setOnClickListener(this);
//        btnPlus.setOnClickListener(this);
//        btnMinus.setOnClickListener(this);
//        btnMultiply.setOnClickListener(this);
//        btnDivision.setOnClickListener(this);
//        btnPlusorMin.setOnClickListener(this);
//        btnAC.setOnClickListener(this);
//        btnDel.setOnClickListener(this);
//        btnEqual.setOnClickListener(this);

        btnBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Science.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void flag(){
        if(flag==1){
            txtDisplay.setText("");
            flag=0;
        }
        if(eq==1){
            txtDisplay.setText("");
            eq=0;
        }
    }
//    public void calculate(){
//        if(opt=="")
//            fnum = Double.parseDouble(txtDisplay.getText().toString());
//        else {
//            //String answer;
//            snum = Double.parseDouble(txtDisplay.getText().toString());
//
//            if (opt == "+") {
//                result = fnum + snum;
//                answer = String.format("%.0f", result);
//                fnum = result;
//                txtDisplay.setText(answer);
//            }
//            else if(opt == "-")
//            {
//                result = fnum - snum;
//                answer = String.format("%.0f", result);
//                fnum=result;
//                txtDisplay.setText(answer);
//            }
//            else if(opt == "*")
//            {
//                result = fnum * snum;
//                answer = String.format("%.0f", result);
//                fnum=result;
//                txtDisplay.setText(answer);
//            }
//            else if(opt == "/")
//            {
//                result = fnum / snum;
//                answer = String.format("%.0f", result);
//                fnum=result;
//                txtDisplay.setText(answer);
//            }
//        }
//        flag=1;
//    }

    @Override
    public void onClick(View v) {
        //String text;
        switch (v.getId()){

            case R.id.btn_one:
                flag();
                text = txtDisplay.getText().toString();
                txtDisplay.setText(text+1);
                break;
            case R.id.btn_two:
                flag();
                text = txtDisplay.getText().toString();
                txtDisplay.setText(text+2);
                break;

        }
    }
}