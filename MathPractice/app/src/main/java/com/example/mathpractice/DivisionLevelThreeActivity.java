package com.example.mathpractice;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class DivisionLevelThreeActivity extends AppCompatActivity {

    private TextView time;
    private TextView score;
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
    private Button backspace;
    private CountDownTimer countDownTimer;
    private Random r;
    private String text = "";
    private int userAnswer = Integer.MIN_VALUE;
    private int userScore = 0;
    private int correctAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division_level_three);
        time = (TextView) findViewById(R.id.time);
        score = (TextView) findViewById(R.id.score);
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
        backspace = (Button) findViewById(R.id.backspace);
        answer.setText(text);
        score.setText("Score ");
        r = new Random();
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    userAnswer = Integer.parseInt(answer.getText().toString());
                    if (userAnswer == correctAnswer) {
                        generateProblem(problem);
                        text = "";
                        answer.setText(text);
                        userAnswer = Integer.MIN_VALUE;
                        userScore += 10;
                        score.setText("Score " + userScore);
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    // Show Error Message
                }
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
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.length() != 0) {
                    text = text.substring(0, text.length() - 1);
                    answer.setText(text);
                }
            }
        });
        generateProblem(problem);
        countDownTimer = new CountDownTimer(120000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                time.setText("Seconds Remaining: " + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                Toast.makeText(DivisionLevelThreeActivity.this, "Time is Up!", Toast.LENGTH_LONG)
                        .show();
                time.setText("Time!");
                enter.setEnabled(false);
                zeroBtn.setEnabled(false);
                oneBtn.setEnabled(false);
                twoBtn.setEnabled(false);
                threeBtn.setEnabled(false);
                fourBtn.setEnabled(false);
                fiveBtn.setEnabled(false);
                sixBtn.setEnabled(false);
                sevenBtn.setEnabled(false);
                eightBtn.setEnabled(false);
                nineBtn.setEnabled(false);
                backspace.setEnabled(false);
            }
        };
        countDownTimer.start();
    }

    private void generateProblem(TextView problem) {
        int a = r.nextInt(990) + 100;
        while (a == 0) {
            a = r.nextInt();
        }
        int b = generateDivisor(a);
        problem.setText(a + " / " + b + " = ");
        correctAnswer = a / b;
    }
    private int generateDivisor(int a) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                factors.add(i);
            }
        }
        int index = r.nextInt(factors.size());
        return factors.get(index);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent keyEvent) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            countDownTimer.cancel();
        }
        return super.onKeyDown(keyCode, keyEvent);
    }
}
