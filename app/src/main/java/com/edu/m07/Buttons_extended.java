package com.edu.m07;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class Buttons_extended extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private String signer = null;
    private String options = null;
    private int opts = 0;
    private String spinnerText = null;

    public String checkSigner(){
        if (signer == null) signer = "UNSIGNED";
        return signer;
    }
    public String checkOptions(){
        switch (opts) {
            case 0:
                options = "NO OPTIONS CHECKED";
                break;
            case 1:
                options = "RADIO";
                break;
            case 2:
                options = "BUTTONS";
                break;
            case 3:
                options = "{ RADIO , BUTTONS }";
        }
        return options;
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_extended);

        Button btn = findViewById(R.id.button);
        Button submit = findViewById(R.id.submit);
        TextView txtv = findViewById(R.id.result);
        RadioGroup rbg = findViewById(R.id.rbg);

        CheckBox cb1 = findViewById(R.id.cb1);
        CheckBox cb2 = findViewById(R.id.cb2);

        btn.setOnClickListener(view -> startActivity(new Intent(this, MixLayout.class)));
        submit.setOnClickListener(view -> txtv.setText("Signed : " + checkSigner() + "\nOptions : " + checkOptions()));
        cb1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) opts += 1;
            else opts -=1;
        });
        cb2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) opts += 2;
            else opts -=2;
        });
        rbg.setOnCheckedChangeListener((group, checkedId) -> {
            View radioButton = rbg.findViewById(checkedId);
            int index = rbg.indexOfChild(radioButton);
            switch (index) {
                case 0:
                    signer = "Edu";
                    break;
                case 1:
                    signer = "Victor";
                    break;
                case 2:
                    signer = "Alex";
                    break;
            }
        });

        // SPINNER
        Spinner spinner = findViewById(R.id.course_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.courses_array, R.layout.spinner_res);
        adapter.setDropDownViewResource(R.layout.spinner_res);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }
    //Spinner OnSelect
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        spinnerText = (String) parent.getItemAtPosition(position);
        TextView spinnerTextView = findViewById(R.id.itemTextView);
        spinnerTextView.setText(spinnerText);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
}