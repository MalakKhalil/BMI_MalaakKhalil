package com.malaak.myapplicationbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CompleteYourInformationTest extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    EditText Wieght;
    Button increment_Weight;
    Button decrement_Weight;
    int count=0;
    Button Increment_high;
    Button Decrement_high;
    EditText high;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_your_information_test);

            Button s=findViewById(R.id.savebtn);
            s.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(CompleteYourInformationTest.this, HomePage.class);
                    startActivity(i);
                }
            });

            /*increment and decrement*/
            Wieght=(EditText) findViewById(R.id.zeroweight) ;
            increment_Weight=(Button) findViewById(R.id.plusWieght);
            decrement_Weight= (Button) findViewById(R.id.minusWeight)  ;

            increment_Weight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    count++;
                    Wieght.setText(String.valueOf(count));
                }
            });
            decrement_Weight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    count--;
                    Wieght.setText(String.valueOf(count));
                }
            });

          /*increment and decrement high*/

        high=(EditText) findViewById(R.id.zeroHigh) ;
         Increment_high=(Button) findViewById(R.id.plusHeight);
        Decrement_high= (Button) findViewById(R.id.minus)  ;

        Increment_high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                high.setText(String.valueOf(count));
            }
        });
        Decrement_high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                high.setText(String.valueOf(count));
            }
        });



            radioGroup=findViewById(R.id.radio_group);
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                    switch (checkedId){
                        case R.id.male:
                            Toast.makeText(getApplicationContext(), "Male selected", Toast.LENGTH_SHORT).show();
                            break;
                        case  R.id.female:
                            Toast.makeText(CompleteYourInformationTest.this, "Female selected", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            });





        }
    }
