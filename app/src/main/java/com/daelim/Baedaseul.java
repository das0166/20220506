package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Baedaseul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baedaseul);
        Init = this;

    }
    private Baedaseul Init;
    @Override
    protected void onStart(){
        super.onStart();
        String s = getIntent().getStringExtra("id");
        String nickname = getIntent().getStringExtra("nick");
        Button introduction = findViewById(R.id.introduction);
        Button photo = findViewById(R.id.photo);
        Button schedule = findViewById(R.id.schedule);
        Button multiplication = findViewById(R.id.multiplication);
        Button setting = findViewById(R.id.setting);
        TextView nick = findViewById(R.id.nick);
        if(nickname != null){
            nick.setText(nickname);
        } else if(nickname ==null){
            if(s != null){
                nick.setText(s+"님");
            }
        }
        introduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Baedaseul.this, IntroductionActivity.class);
                startActivity(intent);
                finish();
            }
        });
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Baedaseul.this, PhotoActivity.class);
                startActivity(intent);
                finish();
            }
        });
        schedule.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Baedaseul.this,ScheduleActivity.class);
                startActivity(intent);
                finish();
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Baedaseul.this,MultiplicationActivity.class);
                startActivity(intent);
                finish();
            }
        });
        setting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Baedaseul.this,SettingActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}