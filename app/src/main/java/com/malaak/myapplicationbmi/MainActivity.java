package com.malaak.myapplicationbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thread();
                b1=findViewById(R.id.btn);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,Login.class);
                        startActivity(intent);
                    }
                });

            }
            public void thread(){
        Thread thread=new Thread(){
            @Override
            public void run(){
                try{
                    sleep(3000);
                    Intent n=new Intent(MainActivity.this,Login.class);
                    startActivity(n);
                    finish();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        thread.start();
            }
        }













