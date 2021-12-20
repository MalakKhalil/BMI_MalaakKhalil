package com.malaak.myapplicationbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);

        /*saveinNewRecord*/
        Button saveButton;
        saveButton=findViewById(R.id.saveinNewRecord);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii=new Intent(NewRecord.this,add_food_details.class);
                startActivity(iii);
            }
        });
    }
}