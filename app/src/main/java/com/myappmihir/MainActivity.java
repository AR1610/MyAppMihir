package com.myappmihir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUsername;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsername = findViewById(R.id.edt_username);
        btnSignIn = findViewById(R.id.btn_login);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUserName = edtUsername.getText().toString();
                Toast.makeText(MainActivity.this, "Username is "
                        + strUserName, Toast.LENGTH_SHORT).show();


                Intent i = new Intent(MainActivity.this,HomeActivity.class);
                i.putExtra("KEY_USERNAME",strUserName);
                startActivity(i);

            }
        });

    }
}