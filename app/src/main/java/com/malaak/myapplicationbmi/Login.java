package com.malaak.myapplicationbmi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    EditText Username ;
    EditText password;
    Button Login;
    TextView SignUp;
    FirebaseAuth fauth;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Username=findViewById(R.id.Username);
        password=findViewById(R.id.passwordinlogin);
        Login=findViewById(R.id.log_in_btn);
        SignUp=findViewById(R.id.sign_up_text_in_loginpage);
        fauth=FirebaseAuth.getInstance();

        Login.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String usernameinLogin=Username.getText().toString().trim();
                String passwordinSignup=password.getText().toString().trim();


                if (TextUtils.isEmpty(usernameinLogin)){
                    Username.setError("Name is required");
                    return;
                }
                if (TextUtils.isEmpty(passwordinSignup)){

                    password.setError("password required");;
                    return;
                }

          fauth.signInWithEmailAndPassword(usernameinLogin,passwordinSignup).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
              @Override
              public void onComplete(@NonNull Task<AuthResult> task) {
                  if (task.isSuccessful()){
                      Toast.makeText(Login.this,"Login successfully",Toast.LENGTH_SHORT).show();
                      Intent i=new Intent(Login.this, HomePage.class);
                      startActivity(i);

                  }
                  else {
                      Toast.makeText(Login.this, "Error!!!!!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                  }
              }
          });

            }
        });
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii=new Intent(Login.this,SignUp.class);
                startActivity(iii);
            }
        });


    }

}
