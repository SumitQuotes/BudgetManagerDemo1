package com.example.budgetmanagerdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {

Button loginButton;
EditText PasswordEdit,EmailEdit;
TextView singup;

String EmailEntry;
String PasswordEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EmailEdit = findViewById(R.id.EmailEdit);
        PasswordEdit = findViewById(R.id.PasswordEdit);
        loginButton = findViewById(R.id.LoginButton);
        singup=findViewById(R.id.signup);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EmailEntry = EmailEdit.getText().toString();
                PasswordEntry = PasswordEdit.getText().toString();


            }
        });
        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent singupintent = new Intent(login.this,singup.class);
                startActivity(singupintent);

            }
        });
    }
}
