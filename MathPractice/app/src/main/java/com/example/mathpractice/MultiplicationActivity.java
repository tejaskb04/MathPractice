package com.example.mathpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MultiplicationActivity extends AppCompatActivity {

    private Button lvlOneBtn;
    private Button lvlTwoBtn;
    private Button lvlThreeBtn;
    private Button lvlFourBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication);
        lvlOneBtn = (Button) findViewById(R.id.lvl_1);
        lvlTwoBtn = (Button) findViewById(R.id.lvl_2);
        lvlThreeBtn = (Button) findViewById(R.id.lvl_3);
        lvlFourBtn = (Button) findViewById(R.id.lvl_4);
        lvlOneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MultiplicationActivity.this, MultiplicationLevelOneActivity.class));
            }
        });
        lvlTwoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MultiplicationActivity.this, MultiplicationLevelTwoActivity.class));
            }
        });
        lvlThreeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MultiplicationActivity.this, MultiplicationLevelThreeActivity.class));
            }
        });
        lvlFourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MultiplicationActivity.this, MultiplicationLevelFourActivity.class));
            }
        });
    }
}
