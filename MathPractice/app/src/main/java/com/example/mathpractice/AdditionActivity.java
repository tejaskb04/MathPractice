package com.example.mathpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdditionActivity extends AppCompatActivity {

    private Button lvlOneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        lvlOneBtn = (Button) findViewById(R.id.lvl_1);
        lvlOneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdditionActivity.this, AdditionLevelOneActivity.class));
            }
        });
    }
}
