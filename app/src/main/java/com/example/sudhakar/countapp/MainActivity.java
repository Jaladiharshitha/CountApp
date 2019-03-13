package com.example.sudhakar.countapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText num_one,num_two;
    Button add_n,sub_n,mul_n,div_n;
    float n,m;
    float r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.result);
        num_one=findViewById(R.id.num1);
        num_two=findViewById(R.id.num2);
        add_n=findViewById(R.id.add);
        sub_n=findViewById(R.id.sub);
        mul_n=findViewById(R.id.mul);
        div_n=findViewById(R.id.div);

        add_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(num_one.getText().toString())&&TextUtils.isEmpty(num_two.getText().toString())){

                    Toast.makeText(MainActivity.this, "Enter All Fields", Toast.LENGTH_SHORT).show();

                }else {
                    n=Float.valueOf(num_one.getText().toString());
                    m=Float.valueOf(num_two.getText().toString());
                    r=n+m;
                    result.setText(Float.toString(r));
                }
            }
        });

        sub_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(num_one.getText().toString())&&TextUtils.isEmpty(num_two.getText().toString())){

                    Toast.makeText(MainActivity.this, "Enter All Fields", Toast.LENGTH_SHORT).show();

                }else {
                    n=Float.valueOf(num_one.getText().toString());
                    m=Float.valueOf(num_two.getText().toString());
                    r=n-m;
                    result.setText(Float.toString(r));
                }
            }
        });

        mul_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if (TextUtils.isEmpty(num_one.getText().toString())&&TextUtils.isEmpty(num_two.getText().toString())){

                        Toast.makeText(MainActivity.this, "Enter All Fields", Toast.LENGTH_SHORT).show();

                    }else {
                        n=Float.valueOf(num_one.getText().toString());
                        m=Float.valueOf(num_two.getText().toString());
                        r=n*m;
                        result.setText(Float.toString(r));
                    }

            }
        });

        div_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(num_one.getText().toString())&&TextUtils.isEmpty(num_two.getText().toString())){

                    Toast.makeText(MainActivity.this, "Enter All Fields", Toast.LENGTH_SHORT).show();

                }else {
                    n=Float.valueOf(num_one.getText().toString());
                    m=Float.valueOf(num_two.getText().toString());
                    r=n/m;
                    result.setText(Float.toString(r));
                }
            }
        });
    }



}
