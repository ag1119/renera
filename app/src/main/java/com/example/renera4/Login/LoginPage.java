package com.example.renera4.Login;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.renera4.R;

public class LoginPage extends AppCompatActivity {
    TextView resend_otp;
    TextInputEditText phone  ;
    EditText otp;
    Button continueBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        initViews();
    }

    public void initViews(){
        resend_otp = findViewById(R.id.resend_otp);
        phone = findViewById(R.id.phone);
        otp = findViewById(R.id.otp);
        continueBtn = findViewById(R.id.continueBtn);
    }
}
