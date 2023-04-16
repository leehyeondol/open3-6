package com.example.a6weekhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent receivedIntent = getIntent();
        String username = receivedIntent.getStringExtra("username");
        String password = receivedIntent.getStringExtra("password");

        Toast.makeText(this, username + ", " + password, Toast.LENGTH_LONG).show();

        Button menu01Button = findViewById(R.id.menu01Button);
        menu01Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CustomerActivity.class);
                intent.putExtra("titleMsg", "고객 관리");

                startActivityForResult(intent, 201);
            }
        });

        Button menu02Button = findViewById(R.id.menu02Button);
        menu02Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SaleActivity.class);
                intent.putExtra("titleMsg", "매출 관리");

                startActivityForResult(intent, 202);
            }
        });

        Button menu03Button = findViewById(R.id.menu03Button);
        menu03Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProductActivity.class);
                intent.putExtra("titleMsg", "상품 관리");

                startActivityForResult(intent, 203);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        if (intent != null) {
            if (requestCode == 201) {
                showToast("고객 관리");
            } else if (requestCode == 202) {
                showToast("매출 관리");
            } else if (requestCode == 203) {
                showToast("상품 관리");
            }

            if (intent.getStringExtra("to") != null &&
                    intent.getStringExtra("to").equals("login")) {
                finish();
            }
        }

    }

    public void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}