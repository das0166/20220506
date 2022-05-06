package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MultiplicationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication);
        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        TextView result = findViewById(R.id.result);
        Button back = findViewById(R.id.back);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();
                for(int i=1; i<10; i++){
                    sb.append("1 * "+ i  + " = " + (1*i) + "\n");
                }
                result.setText(sb.toString());
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();
                for(int i=1; i<10; i++){
                    sb.append("2 * "+ i  + " = " + (2*i) + "\n");
                }
                result.setText(sb.toString());
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();
                for(int i=1; i<10; i++){
                    sb.append("3 * "+ i  + " = " + (3*i) + "\n");
                }
                result.setText(sb.toString());
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();
                for(int i=1; i<10; i++){
                    sb.append("4 * "+ i  + " = " + (4*i) + "\n");
                }
                result.setText(sb.toString());
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();
                for(int i=1; i<10; i++){
                    sb.append("5 * "+ i  + " = " + (5*i) + "\n");
                }
                result.setText(sb.toString());
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();
                for(int i=1; i<10; i++){
                    sb.append("6 * "+ i  + " = " + (6*i) + "\n");
                }
                result.setText(sb.toString());
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();
                for(int i=1; i<10; i++){
                    sb.append("7 * "+ i  + " = " + (7*i) + "\n");
                }
                result.setText(sb.toString());
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();
                for(int i=1; i<10; i++){
                    sb.append("8 * "+ i  + " = " + (8*i) + "\n");
                }
                result.setText(sb.toString());
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();
                for(int i=1; i<10; i++){
                    sb.append("9 * "+ i  + " = " + (9*i) + "\n");
                }
                result.setText(sb.toString());
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MultiplicationActivity.this,Baedaseul.class);
                startActivity(intent);
                finish();
            }
        });
    }
}