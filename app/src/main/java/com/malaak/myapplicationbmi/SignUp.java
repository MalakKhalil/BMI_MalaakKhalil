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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

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
        Repassword=findViewById(R.id.re_password);
        create=findViewById(R.id.btn);
        login=findViewById(R.id.login_Text_signup);
        /*exception*/
        signUp_password= findViewById(R.id.passinsignup);
        /*exception*/
        FirebaseAuth mAuth;
        mAuth=FirebaseAuth.getInstance();
/*
        if (mAuth.getCurrentUser()!=null){
            Intent intent=new Intent(SignUp.this,CompleteYourInformationTest.class);
            startActivity(intent);
            finish();

        }
*/
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=name.getText().toString().trim();
                String useremail=email.getText().toString().trim();

                String password=signUp_password.toString().trim();
                String reppassword=Repassword.getText().toString().trim();


                if (password.length()<=8){
                    signUp_password.setError("Password should be more than 8");
                    return;

                }


                if (TextUtils.isEmpty(username)){
                    name.setError("Name is required");
                    return;
                }

                if (TextUtils.isEmpty(useremail)){
                    email.setError("Email is required");
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    signUp_password.setText("password required");;
                    return;
                }
                if (TextUtils.isEmpty(reppassword)){
                    Repassword.setError("Re-Password is required");
                    return;
                }


               mAuth.createUserWithEmailAndPassword(useremail,password).addOnCompleteListener(
                       new OnCompleteListener<AuthResult>() {
                   @Override
                   public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(SignUp.this,"user created",Toast.LENGTH_SHORT).show();

                        Intent intent=new Intent(SignUp.this,CompleteYourInformationTest.class);
                        startActivity(intent);
                    }
                    else {

                        Toast.makeText(SignUp.this,"Error!!!!!"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();

                    }
                   }
               });



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
