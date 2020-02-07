package com.example.budgetmanagerdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

public class singup extends AppCompatActivity {
EditText PasswordEdit;
Boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        PasswordEdit = findViewById(R.id.PasswordEdit);
        final String password = PasswordEdit.getText().toString();


        PasswordEdit.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction() == MotionEvent.ACTION_UP){

                    if (motionEvent.getRawX() >= PasswordEdit.getRight() - PasswordEdit.getTotalPaddingRight()) {

                        if (flag == true) {

                            PasswordEdit.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            flag=false;
                        } else {
                            flag = true;
                            PasswordEdit.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                        }
                    }
                }
                return false;
            }
        });
    }
}
