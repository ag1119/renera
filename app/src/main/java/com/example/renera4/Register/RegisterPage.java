package com.example.renera4.Register;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.renera4.R;

public class RegisterPage extends AppCompatActivity {
    TextView resend_otp , loginBtn;
    TextInputEditText phone , name  ;
    EditText otp;
    Button continueBtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        initViews();
    }

    public void initViews(){
        resend_otp = findViewById(R.id.resend_otp);
        phone = findViewById(R.id.phone);
        name = findViewById(R.id.name);
        otp = findViewById(R.id.otp);
        continueBtn = findViewById(R.id.continueBtn);
        loginBtn = findViewById(R.id.loginBtn);
    }
}
