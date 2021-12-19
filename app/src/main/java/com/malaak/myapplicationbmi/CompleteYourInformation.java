package com.malaak.myapplicationbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CompleteYourInformation extends AppCompatActivity {
RadioGroup radioGroup;
RadioButton radioButton;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_your_information);


        radioGroup=findViewById(R.id.radio_group);

    }

}