package com.example.intents;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


 public class Activity2 extends AppCompatActivity {
        TextView t;
        protected  void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity2);
            t=findViewById(R.id.textView);
            Intent intent = getIntent();
            t.setText((intent.getStringExtra("text")));
        }

    }


