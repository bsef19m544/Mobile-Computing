package com.example.learningapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
public class Pages extends AppCompatActivity {
    TextView alpa;
    ImageView myImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pages);
        Intent intent=getIntent();

        alpa=findViewById(R.id.alphabetName);
        myImage=(ImageView) findViewById(R.id.picture);
        String alphabet=(String)intent.getStringExtra("name");
        String value=(String)intent.getStringExtra("value");


        String fnm = alphabet.toLowerCase(); //  this is image file name
        String PACKAGE_NAME = getApplicationContext().getPackageName();
        int imgId = getResources().getIdentifier(PACKAGE_NAME+":drawable/"+fnm , null, null);


        myImage.setImageResource(imgId);
        alpa.setText(value);


    }
}
