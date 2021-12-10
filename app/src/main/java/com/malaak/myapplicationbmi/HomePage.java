package com.malaak.myapplicationbmi;

import android.graphics.Paint;
import android.os.Bundle;
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



    }

}