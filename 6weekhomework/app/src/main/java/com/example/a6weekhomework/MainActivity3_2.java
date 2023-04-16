package com.example.a6weekhomework;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity3_2 extends AppCompatActivity {

    EditText editTextA, editTextB;
    RadioGroup radioGroup;
    Button btnNewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        radioGroup = findViewById(R.id.radioGroup);
        btnNewActivity = findViewById(R.id.btnNewActivity);

        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.radioAdd:
                        intent.putExtra("oper", "+");
                        break;
                    case R.id.radioSub:
                        intent.putExtra("oper", "-");
                        break;
                    case R.id.radioMul:
                        intent.putExtra("oper", "*");
                        break;
                    case R.id.radioDiv:
                        intent.putExtra("oper", "/");
                        break;
                    default:
                        break;
                }

                intent.putExtra("A", Integer.parseInt(editTextA.getText().toString()));
                intent.putExtra("B", Integer.parseInt(editTextB.getText().toString()));
                startActivityForResult(intent, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode == RESULT_OK) {
            int result = data.getIntExtra("Result", 0);
            Toast.makeText(getApplicationContext(), "결과 :" + result, Toast.LENGTH_LONG).show();
        }
    }
}