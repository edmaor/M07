package com.edu.m07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Music extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button back = findViewById(R.id.goback);
        back.setOnClickListener(view -> startActivity(new Intent(this, Buttons_extended.class)));

        RecyclerView recyclerView = findViewById(R.id.recycled);
        String[] localData = {
                "positions:Ariana Grande",
                "Kiss me more:Doja Cat",
                "Antes de morirme:C.Tangana ft.Rosalía",
                "Los Tontos:C.Tangana",
                "Ingobernable:C.Tangana",
                "Vivir así:Nathy Peluso"
        };
        Recicled recicled = new Recicled(localData);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(recicled);
    }
}