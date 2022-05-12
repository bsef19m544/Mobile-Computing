package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;

public class Parah_Display extends AppCompatActivity {

    TextView textView;
    RecyclerView ayahs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parah_display);
        Intent intent=getIntent();
        int Parah_no=intent.getIntExtra("Parah_no",-1);
        // textView=findViewById(R.id.textView);
        //textView.setText(Integer.toString(Surah_no));
        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        ayahs=findViewById(R.id.ayahs);
        ayah_recycle_view listadapter=new ayah_recycle_view(this,databaseAccess.getParahAyahs(Parah_no));
        ayahs.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        ayahs.setAdapter(listadapter);



    }
}