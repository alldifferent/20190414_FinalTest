package com.alldi.a20190414_finaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText lenthEdt;
    EditText weightEdt;
    Button calBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();

    }

    void bindViews() {

        lenthEdt = findViewById(R.id.lenthEdt);
        weightEdt = findViewById(R.id.weightEdt);
        calBtn = findViewById(R.id.calBtn);

    }

    void setValues() {

    }

    void setupEvents() {

        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String lenthstr = lenthEdt.getText().toString();
                String weightstr = weightEdt.getText().toString();

                double height = Double.parseDouble(lenthstr);
                double weight = Double.parseDouble(weightstr);


                Intent intent = new Intent(MainActivity.this, CalActivity.class);
                intent.putExtra("키", height);
                intent.putExtra("몸무게", weight);
                startActivity(intent);


            }
        });
    }
}
