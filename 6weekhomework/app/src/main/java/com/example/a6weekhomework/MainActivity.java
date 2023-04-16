package com.example.a6weekhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    Button btnNewActivity;
    RadioButton radioSecond, radioThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("직접 풀어보기 10-1");

        btnNewActivity = findViewById(R.id.btnNewActivity);
        radioSecond = findViewById(R.id.radioSecond);
        radioThird = findViewById(R.id.radioThird);

        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent;
                if (radioSecond.isChecked()) {
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                } else {
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);
                }
                startActivity(intent);
            }
        });
    }
}