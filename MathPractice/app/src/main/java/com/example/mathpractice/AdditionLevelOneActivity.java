package com.example.mathpractice;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class AdditionLevelOneActivity extends AppCompatActivity {

    private TextView time;
    private TextView problem;
    private EditText answer;
    private Button enter;
    private Button zeroBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
    private String text = "";
    private int userAnswer;
    private int correctAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_level_one);
        time = (TextView) findViewById(R.id.time);
        problem = (TextView) findViewById(R.id.problem);
        answer = (EditText) findViewById(R.id.answer);
        enter = (Button) findViewById(R.id.enter);
        zeroBtn = (Button) findViewById(R.id.zero);
        oneBtn = (Button) findViewById(R.id.one);
        twoBtn = (Button) findViewById(R.id.two);
        threeBtn = (Button) findViewById(R.id.three);
        fourBtn = (Button) findViewById(R.id.four);
        fiveBtn = (Button) findViewById(R.id.five);
        sixBtn = (Button) findViewById(R.id.six);
        sevenBtn = (Button) findViewById(R.id.seven);
        eightBtn = (Button) findViewById(R.id.eight);
        nineBtn = (Button) findViewById(R.id.nine);
        answer.setText(text);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userAnswer = Integer.parseInt(answer.getText().toString());
            }
        });
        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += "0";
                answer.setText(text);
            }
        });
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += "1";
                answer.setText(text);
            }
        });
        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += "2";
                answer.setText(text);
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += "3";
                answer.setText(text);
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += "4";
                answer.setText(text);
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += "5";
                answer.setText(text);
            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += "6";
                answer.setText(text);
            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += "7";
                answer.setText(text);
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += "8";
                answer.setText(text);
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += "9";
                answer.setText(text);
            }
        });
        generateProblem(problem);
        CountDownTimer countDownTimer = new CountDownTimer(120000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                time.setText("Seconds Remaining: " + millisUntilFinished / 1000);
                if (userAnswer == correctAnswer) {
                    generateProblem(problem);
                    text = "";
                    answer.setText(text);
                }
            }

            @Override
            public void onFinish() {
                Toast.makeText(AdditionLevelOneActivity.this, "Time is Up!", Toast.LENGTH_SHORT);
                // Implement Other Logic
            }
        }.start();
    }

    private void generateProblem(TextView problem) {
        Random r = new Random();
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        problem.setText(a + " " + "+" + " " + b + " " + "=");
        correctAnswer = calculateCorrectAnswer(a, b);
    }

    private int calculateCorrectAnswer(int a, int b) {
        return a + b;
    }
}
