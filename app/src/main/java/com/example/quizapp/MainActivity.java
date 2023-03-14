package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private String[] questions={"Is Java a OOP Language?","Is Java a person?","Is Java introduced in 1855?","Is Java has abstract Class?"};
private boolean[] answers={true,false,false,true};
private int score=0;
private int index=0;
Button yes;
Button no;
TextView que;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        que=findViewById(R.id.question);
        que.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length-1)
                {
                    if(answers[index]==true)
                        score++;
                    index++;
                    if(index<=questions.length-1) {
                        que.setText(questions[index]);
                    }
                    else
                        Toast.makeText(MainActivity.this, "Your Score is : "+score, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    index=0;
                    score=0;
                    que.setText(questions[index]);
                }
                }

        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length-1)
                {
                    if(answers[index]==false) {
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1) {
                        que.setText(questions[index]);
                    }
                    else
                        Toast.makeText(MainActivity.this, "Your Score is : "+score, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    index=0;
                    score=0;
                    que.setText(questions[index]);
                }

            }
        });

    }
}