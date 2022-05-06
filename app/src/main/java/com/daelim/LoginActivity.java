package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText id = findViewById(R.id.id);
        EditText pw = findViewById(R.id.pw);
        CheckBox auto_login = findViewById(R.id.auto_login);
        Button login = findViewById(R.id.login);
        SharedPreferences sp = getSharedPreferences("login_data",MODE_PRIVATE);
        SharedPreferences.Editor et = sp.edit();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.putString("id",id.getText().toString());
                et.putString("pw",pw.getText().toString());
                et.putBoolean("auto_login",auto_login.isChecked());
                et.commit();
                String s = sp.getString("id",id.getText().toString());
                String d = sp.getString("pw",id.getText().toString());
                if(s == null && d ==null) {

                }else{
                    Intent intent = new Intent(LoginActivity.this, Baedaseul.class);
                    intent.putExtra("id",s);
                    startActivity(intent);
                    finish();
                }
            }
        });
        if(sp.getBoolean("auto_login",false)){
            auto_login.setChecked(true);
            String idd = sp.getString("id","");
            String pass = sp.getString("pw","");
            id.setText(idd);
            pw.setText(pass);
        } else if(sp.getBoolean("auto_login",false)!=false){
            et.clear();
        }
    }

}
