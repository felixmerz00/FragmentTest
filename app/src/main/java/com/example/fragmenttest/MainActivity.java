package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //start Activity 1
        TextView textViewActivity1 = (TextView) findViewById(R.id.textViewActivity1);
        textViewActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity1Intent = new Intent(MainActivity.this, Activity1.class);
                startActivity(activity1Intent);
            }
        });

        //start Activity 2
        TextView textViewActivity2 = (TextView) findViewById(R.id.textViewActivity2);
        textViewActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity1Intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(activity1Intent);
            }
        });

        //start Activity 3
        TextView textViewActivity3 = (TextView) findViewById(R.id.textViewActivity3);
        textViewActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity1Intent = new Intent(MainActivity.this, Activity3.class);
                startActivity(activity1Intent);
            }
        });

        //start Activity 4
        TextView textViewActivity4 = (TextView) findViewById(R.id.textViewActivity4);
        textViewActivity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity1Intent = new Intent(MainActivity.this, Activity4.class);
                startActivity(activity1Intent);
            }
        });

    }
}