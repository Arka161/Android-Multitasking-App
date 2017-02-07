package com.example.adityavd.androidprojects;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener{
    Button A,S,D,M,button;
    //Various Button classes
    TextView tvresult;
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        A=(Button)findViewById(R.id.add);
        S=(Button)findViewById(R.id.sub);
        D=(Button)findViewById(R.id.div);
        M=(Button)findViewById(R.id.mul);
        et1=(EditText)findViewById(R.id.etFirstNo);
        et2=(EditText)findViewById(R.id.etSecondNo);
        tvresult=(TextView) findViewById(R.id.tvResult);
        button=(Button)findViewById(R.id.button);
        A.setOnClickListener(this);
        S.setOnClickListener(this);
        D.setOnClickListener(this);
        M.setOnClickListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvresult.setText(" ");
            }
        });
    }

    @Override
    public void onClick(View v) {
        String num1=et1.getText().toString();
        String num2=et2.getText().toString();
        //Basic TypeCasting
        switch (v.getId()){
            case R.id.add:
                int Addition=Integer.parseInt(num1)+Integer.parseInt(num2);
                tvresult.setText(String.valueOf(Addition));
                break;
            case R.id.sub:
                int Subtraction=Integer.parseInt(num1)-Integer.parseInt(num2);
                tvresult.setText(String.valueOf(Subtraction));
                break;
            case R.id.div:
                try
                {
                    int Division=Integer.parseInt(num1)/Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(Division));
                    break;}catch (Exception e){
                    tvresult.setText("Cannot divide");
                }
            case R.id.mul:
                int Multi=Integer.parseInt(num1)*Integer.parseInt(num2);
                tvresult.setText(String.valueOf(Multi));
                break;
        }
    }
}
