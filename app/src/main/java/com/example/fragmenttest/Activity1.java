package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    private FragmentOne fragment1 = FragmentOne.newInstance("String1", "String2");
    private FragmentTwo fragment2 = FragmentTwo.newInstance("String", "String2");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).add(R.id.fragmentContainerView, fragment1).commit();
        }

        Button button1 = (Button) findViewById(R.id.btnFragment1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainerView, fragment1).commit();
            }
        });

        Button button2 = (Button) findViewById(R.id.btnFragment2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainerView, fragment2).commit();
            }
        });
    }
}