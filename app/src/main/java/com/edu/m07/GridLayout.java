package com.edu.m07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class GridLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            startActivity(new Intent(this, RelativeLayout.class));
        });
    }
}