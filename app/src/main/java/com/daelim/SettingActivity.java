package com.daelim;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        SharedPreferences sp = getSharedPreferences("config",MODE_PRIVATE);
        SharedPreferences.Editor et = sp.edit();
        Button back = findViewById(R.id.back);
        Button logout = findViewById(R.id.logout);
        EditText pwd = findViewById(R.id.pwd);
        EditText nickname = findViewById(R.id.nickname);
        Button pwd_change = findViewById(R.id.pw_change);
        Button nick_change = findViewById(R.id.nick_change);
        pwd_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.putString("pwd",pwd.getText().toString());
                et.commit();
                AlertDialog.Builder ab = new AlertDialog.Builder(SettingActivity.this)
                        .setTitle("알람")
                        .setMessage("비밀번호가 변경되었습니다.")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        });
                AlertDialog ad = ab.create();
                ad.show();
                String ch_pwd = sp.getString("pwd",pwd.getText().toString());
                pwd.setText(pwd.getText());
            }
        });
        nick_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.putString("nick",nickname.getText().toString());
                et.commit();
                AlertDialog.Builder ab = new AlertDialog.Builder(SettingActivity.this)
                        .setTitle("알람")
                        .setMessage("닉네임이 변경되었습니다.")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        });
                AlertDialog ad = ab.create();
                ad.show();
                nickname.setText(nickname.getText());
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ch_nick = sp.getString("nick",nickname.getText().toString());
                Intent intent = new Intent(SettingActivity.this,Baedaseul.class);
                intent.putExtra("nick",ch_nick);
                startActivity(intent);
                finish();
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}