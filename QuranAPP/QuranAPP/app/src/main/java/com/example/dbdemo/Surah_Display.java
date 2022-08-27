package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Surah_Display extends AppCompatActivity {
    TextView textView;
    RecyclerView ayah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_display);
        Intent intent=getIntent();
        int Surah_no=intent.getIntExtra("Surah_no",-1);
        // textView=findViewById(R.id.textView);
        //textView.setText(Integer.toString(Surah_no));
        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        ayah=findViewById(R.id.ayahs);
       ayah_recycle_view listadapter=new ayah_recycle_view(this,databaseAccess.getSurahAyahs(Surah_no));
      ayah.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        ayah.setAdapter(listadapter);


    }
}