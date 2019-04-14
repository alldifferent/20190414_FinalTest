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

        lenthEdt = findViewById(R.id.lenthEdt);
        weightEdt = findViewById(R.id.weightEdt);
        calBtn = findViewById(R.id.calBtn);

        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String lenth = lenthEdt.getText().toString();
                String weight = weightEdt.getText().toString();


                Intent intent = new Intent(MainActivity.this, CalActivity.class);
                intent.putExtra("키", lenth);
                intent.putExtra("몸무게", weight);
                startActivity(intent);


            }
        });


    }
}
