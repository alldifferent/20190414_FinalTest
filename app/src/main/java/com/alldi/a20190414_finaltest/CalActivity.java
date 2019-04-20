package com.alldi.a20190414_finaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CalActivity extends AppCompatActivity {


    TextView bmiTxt;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        bindViews();
        setupEvents();
        setValues();

    }

    void setupEvents(){



    }

    void setValues(){

        double height = getIntent().getDoubleExtra("키", 0);
        double weight = getIntent().getDoubleExtra("몸무게", 0);

        double BMI = weight/((height/100)*(height/100));

        resultTxt.setText(String.format("%f 입니다.",BMI));

        if (BMI < 18.5){
            bmiTxt.setText("저체중");
        }else if(BMI<23){
            bmiTxt.setText("정상");
        }else if(BMI<25){
            bmiTxt.setText("과체중");
        }else if(BMI<30){
            bmiTxt.setText("비만");
        }else{
            bmiTxt.setText("고도비만");
        }


    }

    void bindViews(){

        bmiTxt = findViewById(R.id.bmiTxt);
        resultTxt = findViewById(R.id.resultTxt);
    }
}
