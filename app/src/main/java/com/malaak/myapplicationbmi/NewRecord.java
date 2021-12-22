package com.malaak.myapplicationbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class NewRecord extends AppCompatActivity {
    EditText Wieght;
    Button increment_Weight;
    Button decrement_Weight;
    int count=0;
    int count1=0;
    Button Increment_high;
    Button Decrement_high;
    EditText high;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);

        Wieght=findViewById(R.id.zeroweight);
        increment_Weight=findViewById(R.id.plusWieght);
        decrement_Weight=findViewById(R.id.minusWeight);
        Increment_high= findViewById(R.id.plusHeight);
        Decrement_high=findViewById(R.id.minus);
        high=findViewById(R.id.zeroHigh);
        ImageView backicon;
        backicon=findViewById(R.id.backicon3);
        backicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii=new Intent(NewRecord.this,HomePage.class);
                startActivity(iii);
            }
        });



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
                if (count<=0){
                    Wieght.setText(String.valueOf(0));
                }
                else {
                    count--;
                    Wieght.setText(String.valueOf(count));
                }
            }
        });

        /*increment and decrement high*/

        high=(EditText) findViewById(R.id.zeroHigh) ;
        Increment_high=(Button) findViewById(R.id.plusHeight);
        Decrement_high= (Button) findViewById(R.id.minus)  ;

        Increment_high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;
                high.setText(String.valueOf(count1));
            }
        });
        Decrement_high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count1<=0){
                    high.setText(String.valueOf(0));
                }
                else {
                    high.setText(String.valueOf(count1));
                    count1--;

                }
            }
        });







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