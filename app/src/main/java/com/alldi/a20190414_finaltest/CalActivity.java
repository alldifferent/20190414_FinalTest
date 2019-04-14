package com.alldi.a20190414_finaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CalActivity extends AppCompatActivity {


    TextView resultTxt;
    TextView typeTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        resultTxt = findViewById(R.id.resultTxt);
        typeTxt = findViewById(R.id.typeTxt);


        Intent intent = getIntent();

        String height = intent.getStringExtra("키");
        String weight = intent.getStringExtra("몸무게");

        float numHeight = Float.parseFloat(height);
        float numWeight = Float.parseFloat(weight);

        float Bmi = numWeight / (numHeight * numHeight);

        if (Bmi >= 0 && Bmi < 18.5) {
            String result = String.format("BMI 수치는 %f입니다.", Bmi);
            String typeresult = String.format("BMI 수치가 %f이므로 저체중입니다.", Bmi);
            resultTxt.setText(result);
            typeTxt.setText(typeresult);
        } else if (Bmi >= 18.5 && Bmi < 23) {
            String result = String.format("BMI 수치는 %f입니다.", Bmi);
            String typeresult = String.format("BMI 수치가 %f이므로 정상입니다.", Bmi);
            resultTxt.setText(result);
            typeTxt.setText(typeresult);

        } else if (Bmi >= 23 && Bmi < 25) {
            String result = String.format("BMI 수치는 %f입니다.", Bmi);
            String typeresult = String.format("BMI 수치가 %f이므로 과체중입니다.", Bmi);
            resultTxt.setText(result);
            typeTxt.setText(typeresult);

        } else if (Bmi >= 25 && Bmi < 30) {
            String result = String.format("BMI 수치는 %f입니다.", Bmi);
            String typeresult = String.format("BMI 수치가 %f이므로 비만입니다.", Bmi);
            resultTxt.setText(result);
            typeTxt.setText(typeresult);

        } else {
            String result = String.format("BMI 수치는 %f입니다.", Bmi);
            String typeresult = String.format("BMI 수치가 %f이므로 고도비만입니다.", Bmi);
            resultTxt.setText(result);
            typeTxt.setText(typeresult);

        }

    }
}
