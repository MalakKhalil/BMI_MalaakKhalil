package com.malaak.myapplicationbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class add_food_details extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
TextView v;
Uri imgUri;
Button btn;
ImageView img;
Button saveinFoodDetails;
private static final int PICK_IMAGE=100;
ImageView backIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food_details);

        saveinFoodDetails=findViewById(R.id.save_btn);
        /*save_btn*/
        saveinFoodDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii=new Intent(add_food_details.this,Food_List.class);
                startActivity(iii);
            }
        });
        backIcon=findViewById(R.id.backicon3);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii=new Intent(add_food_details.this,NewRecord.class);
                startActivity(iii);
            }
        });


        Spinner spin=findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence>a=ArrayAdapter.createFromResource
                (this,R.array.Category, android.R.layout.simple_spinner_item);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(a);
        spin.setOnItemSelectedListener(this);
        String category= spin.getSelectedItem().toString();





        img=findViewById(R.id.imageView2);
        btn=findViewById(R.id.upload_photo_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenGallary();
            }
        });

    }
    private void OpenGallary(){
        Intent gallery=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery,PICK_IMAGE);
    }
    protected void onActivityResult(int requestcode,int reultcode,Intent data) {
        super.onActivityResult(requestcode, reultcode, data);
        if(requestcode==RESULT_OK&&requestcode==PICK_IMAGE){
            imgUri=data.getData();
            img.setImageURI(imgUri);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    String text=parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), "addedd", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    /*upload_photo_btn*/



}