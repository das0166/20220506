package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhotoActivity extends AppCompatActivity {
    private int[] imageIDs = new int[] {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        Button back = findViewById(R.id.back);
        GridView gridview = (GridView)findViewById(R.id.gridview);
        PhotoGridAdapter PhotoGridAdapter = new PhotoGridAdapter(this, imageIDs);
        gridview.setAdapter(PhotoGridAdapter);
        back.bringToFront();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhotoActivity.this,Baedaseul.class);
                startActivity(intent);
                finish();
            }
        });
    }
}