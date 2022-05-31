package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "This is Main Activity";
    Button btn, btnc;
    TextView tv;
    private int counter =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "This is my on create");
        btn = findViewById(R.id.button);
        btnc = findViewById(R.id.button2);
        tv= findViewById(R.id.tv1);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);


            }

        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++counter;
                tv.setText("Total"+counter);


            }
        });
        if(savedInstanceState!=null){
            String count = savedInstanceState.getString("count");
            if(tv!=null){
                tv.setText(count);

            }

        }
    }
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("Count", String.valueOf(tv.getText()));

    }
}