package com.example.dbdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class search_para_no extends AppCompatActivity {


    public EditText textView3;

    public Button query_btn2;
    public TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_parah_no);
        textView3 = findViewById(R.id.textView3);

        query_btn2 = (Button)findViewById(R.id.query_btn2);






    }
}
