package com.example.rainmoney;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button rainy;
    private Button infoo;
    private TextView moneyy;
    private TextView view;
    private int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rainy=findViewById(R.id.rain);
        moneyy=findViewById(R.id.money);
        infoo=findViewById(R.id.info);
        view=findViewById(R.id.infoView);
        rainy.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                Log.d("main", "onClick: executed");
                NumberFormat num =NumberFormat.getCurrencyInstance();
                counter=counter+1000;
                moneyy.setText(String.valueOf(num.format(counter)));
            }

        });
        infoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText("hi you are doing well keep it up");

            }
        });
    }
}