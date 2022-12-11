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
        Button btns = findViewById(R.id.btn_switch);
        Button btn1 = findViewById(R.id.btn1);
        btn.setOnClickListener(view -> startActivity(new Intent(this, FrameLayout.class)));
    }
}