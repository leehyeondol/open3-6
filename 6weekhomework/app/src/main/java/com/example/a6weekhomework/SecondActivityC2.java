package com.example.a6weekhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivityC2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondc2);

        Button btnCustomer = findViewById(R.id.btnCustomer);
        Button btnSale = findViewById(R.id.btnSale);
        Button btnProduct = findViewById(R.id.btnProduct);

        btnCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("name","고객 관리");

                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

        btnSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("name","매출 관리");

                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

        btnProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("name","상품 관리");

                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}