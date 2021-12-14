package com.malaak.myapplicationbmi;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.malaak.myapplicationbmi.RecycleViewClasses.BMIAdapter;
import com.malaak.myapplicationbmi.RecycleViewClasses.BMIRecord;
import  java.util.*;
public class HomePage extends AppCompatActivity {
RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        rv=findViewById(R.id.rv);
        ArrayList<BMIRecord>record=new ArrayList<>();
        record.add(new BMIRecord("18/3/1999",20,"Normal",20));
        record.add(new BMIRecord("18/3/1999",20,"Normal",20));
        record.add(new BMIRecord("18/3/1999",20,"Normal",20));
        record.add(new BMIRecord("18/3/1999",20,"Normal",20));
        record.add(new BMIRecord("18/3/1999",20,"Normal",20));
        record.add(new BMIRecord("18/3/1999",20,"Normal",20));
        record.add(new BMIRecord("18/3/1999",20,"Normal",20));


        BMIAdapter adapter=new BMIAdapter(record);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);

        TextView underline=(TextView) findViewById(R.id.underline_logout);
        underline.setPaintFlags(underline.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);


        Button btn =findViewById(R.id.addFood_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomePage.this,Food_List.class);
                startActivity(i);
            }
        });



/*
 protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Username=findViewById(R.id.Username);
        password=findViewById(R.id.passwordinlogin);
        Login=findViewById(R.id.log_in_btn);
        SignUp=findViewById(R.id.sign_up);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login.this,HomePage.class);
                startActivity(i);
            }
        });


    }*/

    }

}