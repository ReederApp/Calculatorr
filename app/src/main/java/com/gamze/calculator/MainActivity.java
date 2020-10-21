package com.gamze.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    TextView result;
    Button add, sub, mul, div, clear, percent;
    float myResult;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        add = findViewById(R.id.addButton);
        sub = findViewById(R.id.subButton);
        mul = findViewById(R.id.mulButton);
        div = findViewById(R.id.divButton);
        clear =findViewById(R.id.clearButton);
        percent =findViewById(R.id.percentButton);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                myResult = num1 + num2;
                result.setText(String.valueOf(myResult));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                myResult = num1 - num2;
                result.setText(String.valueOf(myResult));

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                myResult = num1 * num2;
                result.setText(String.valueOf(myResult));

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                if(num1==0){
                    Toast errorToast = Toast.makeText(MainActivity.this, "Error, number1 cannot be zero!", Toast.LENGTH_SHORT);
                    errorToast.show();
                }
                else{
                    myResult = (float)num1 / num2;
                    result.setText(String.valueOf(myResult));
                }



            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                myResult = num1 % num2;
                result.setText(String.valueOf(myResult));

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1.setText("");
                number2.setText("");
                result.setText("");

            }
        });

    }
}