package com.malaak.myapplicationbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    EditText name;
    EditText email;
    EditText signUp_password;
    EditText Repassword;
    Button create;
    TextView login;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name=findViewById(R.id.Username);
        email=findViewById(R.id.e_mail);
        signUp_password=findViewById(R.id.password);
        Repassword=findViewById(R.id.re_password);
        create=findViewById(R.id.btn);
        login=findViewById(R.id.login_Text_signup);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUp.this,completeInformation.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iiii=new Intent(SignUp.this,Login.class);
                startActivity(iiii);

            }
        });
    }
}
