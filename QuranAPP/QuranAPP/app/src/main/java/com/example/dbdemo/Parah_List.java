package com.example.dbdemo;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Parah_List extends AppCompatActivity {
    private RecyclerView recyclerView;
    public String[] ParahName = {"الم ",
            "سیقول ",
            "تلک الرسل ",
            "لن تنالوالبر",
            "والمحصنت",
            "لایحب اللہ ",
            "واذاسمعوا",
            "ولواننا",
            "قال الملاء",
            "واعلموا",
            "یعتذرون ",
            "ومامن دآبۃ",
            "وماابرئ",
            "ربما",
            "سبحن الذی ",
            "قال الم ",
            "اقترب للناس",
            "قد افلح",
            "وقال الذین ",
            "امن خلق",
            "اتل مااوحی",
            "ومن یقنت ",
            "ومالی ",
            "فمن اظلم ",
            "الیہ یرد",
            "حم ",
            "قال فماخطبکم ",
            "قدسمع اللہ ",
            "تبارک الذی ",
            "عم یتسآءلون ",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parah_list);
        recyclerView=findViewById(R.id.parah_list);
//        Intent intent=getIntent();
        SurahListAdapter myRecyclerAdapter = new SurahListAdapter(android.R.layout.simple_list_item_1,ParahName);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(myRecyclerAdapter);
        myRecyclerAdapter.onRecyclerViewClickListener(new SurahListAdapter.onRecyclerViewClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent=new Intent(getApplicationContext(), Parah_Display.class);
                intent.putExtra("Parah_no",position+1);
                startActivity(intent);
            }
        });

    }
}