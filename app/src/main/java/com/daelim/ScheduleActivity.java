package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        Button back = findViewById(R.id.back);
        ListView schedule = findViewById(R.id.schedule);
        schedule.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new String[]{"자료구조와알고리즘", "스마트콘텐츠프로젝트", "졸업작품(캡스톤디자인)", "모바일프로젝트"}));
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScheduleActivity.this,Baedaseul.class);
                startActivity(intent);
                finish();
            }
        });
    }
}