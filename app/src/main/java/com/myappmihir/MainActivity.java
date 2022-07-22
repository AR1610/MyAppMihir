package com.myappmihir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    EditText edtUsername;
    Button btnSignIn;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsername = findViewById(R.id.edt_username);
        btnSignIn = findViewById(R.id.btn_login);
        btnSend = findViewById(R.id.btn_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.google.com"));
                startActivity(i);
            }
        });

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