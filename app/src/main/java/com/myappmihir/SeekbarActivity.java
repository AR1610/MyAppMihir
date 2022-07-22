package com.myappmihir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekbarActivity extends AppCompatActivity {

    SeekBar seekBar;
    TextView tvSeekbar,tvRatingbar;
    RatingBar ratingBar;
    Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        seekBar = findViewById(R.id.seekbar);
        tvRatingbar = findViewById(R.id.tv_ratingbar);
        tvSeekbar = findViewById(R.id.tv_seekbar);
        ratingBar = findViewById(R.id.ratingbar);
btnDisplay = findViewById(R.id.btn_display);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {

                tvRatingbar.setText(String.valueOf(rating));
            }
        });


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                tvSeekbar.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(SeekbarActivity.this,HomeActivity.class);
                i.putExtra("KEY_SEEKBAR",tvSeekbar.getText().toString());
                startActivity(i);
            }
        });
    }
}