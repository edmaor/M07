package com.edu.m07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MixLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mix_layout);

        Button btn = findViewById(R.id.btn_refresh);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3_1 = findViewById(R.id.btn3_1);
        Button btn3_2 = findViewById(R.id.btn3_2);
        btn.setOnClickListener(view -> {
            startActivity(new Intent(this, FrameLayout.class));
        });
    }
}