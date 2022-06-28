package com.myappmihir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView tvUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvUsername = findViewById(R.id.tv_userName);

        Intent  i = getIntent();
        String strUserName = i.getStringExtra("KEY_USERNAME");
        tvUsername.setText(strUserName);

    }
}