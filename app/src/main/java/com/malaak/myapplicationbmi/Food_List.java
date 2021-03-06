package com.malaak.myapplicationbmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.malaak.myapplicationbmi.foodrecycleview.Food;
import com.malaak.myapplicationbmi.foodrecycleview.FoodAdapter;

import java.util.ArrayList;

public class Food_List extends AppCompatActivity {
RecyclerView re_v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        re_v=findViewById(R.id.re_view);
        ArrayList<Food>f=new ArrayList<>();
        f.add(new Food(R.drawable.banana,"Banana","Fruit","500 cal/g"));
        f.add(new Food(R.drawable.banana,"Banana","Fruit","500 cal/g"));

        f.add(new Food(R.drawable.banana,"Banana","Fruit","500 cal/g"));
        f.add(new Food(R.drawable.banana,"Banana","Fruit","500 cal/g"));
        f.add(new Food(R.drawable.banana,"Banana","Fruit","500 cal/g"));

        FoodAdapter adapter=new FoodAdapter(f);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        re_v.setHasFixedSize(true);
        re_v.setLayoutManager(lm);
        re_v.setAdapter(adapter);
        ImageView v1;
        v1=findViewById(R.id.backicon3);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii=new Intent(Food_List.this,add_food_details.class);
                startActivity(iii);
            }
        });

        Button edit;
        edit=findViewById(R.id.button_edit1);
        /*
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii=new Intent(Food_List.this,Login.class);
                startActivity(iii);
            }
        });

         */

    }
}