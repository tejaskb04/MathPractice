package com.example.mathpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LaunchActivity extends AppCompatActivity {

    private Button additionBtn;
    private Button subtractionBtn;
    private Button multiplicationBtn;
    private Button divisionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        additionBtn = (Button) findViewById(R.id.addition);
        subtractionBtn = (Button) findViewById(R.id.subtraction);
        multiplicationBtn = (Button) findViewById(R.id.multiplication);
        divisionBtn = (Button) findViewById(R.id.division);
        additionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LaunchActivity.this, AdditionActivity.class));
            }
        });
        subtractionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LaunchActivity.this, SubtractionActivity.class));
            }
        });
        multiplicationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LaunchActivity.this, MultiplicationActivity.class));
            }
        });
        divisionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LaunchActivity.this, DivisionActivity.class));
            }
        });
    }
}
