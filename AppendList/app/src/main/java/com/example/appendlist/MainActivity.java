package com.example.appendlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.view.View;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    Button btn;
    ArrayList<String> studentList = new ArrayList<String>();
    ListView listView;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_list);
        btn= findViewById(R.id.button);
        edit = findViewById(R.id.edit);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, studentList);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentList.add(edit.getText().toString());
                arrayAdapter.notifyDataSetChanged();
            }});


    }
}