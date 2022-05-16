package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  // EditText editTextTextPersonName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
       // editTextTextPersonName =(EditText) findViewById(R.id.editTextTextPersonName);

    }

   /* public void ProcessChalo(View view) {
        String Phone = editTextTextPersonName.getText().toString();
        Toast.makeText(MainActivity.this , "My number is " + Phone, Toast.LENGTH_LONG ).show();


    }*/
}