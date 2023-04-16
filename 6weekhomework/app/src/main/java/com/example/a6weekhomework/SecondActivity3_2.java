package com.example.a6weekhomework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity3_2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("Second 액티비티");

        Intent inIntent = getIntent();
        String oper = inIntent.getStringExtra("oper");

        int result;
        if (oper.equals("+")) {
            result = inIntent.getIntExtra("A", 0) + inIntent.getIntExtra("B", 0);
        } else if (oper.equals("-")) {
            result = inIntent.getIntExtra("A", 0) - inIntent.getIntExtra("B", 0);
        } else if (oper.equals("*")) {
            result = inIntent.getIntExtra("A", 0) * inIntent.getIntExtra("B", 0);
        } else {
            result = inIntent.getIntExtra("A", 0) / inIntent.getIntExtra("B", 0);
        }

        Button btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outIntent = new Intent(getApplicationContext(), MainActivity.class);
                outIntent.putExtra("Result", result);
                setResult(RESULT_OK, outIntent);
                finish();
            }
        });
    }
}