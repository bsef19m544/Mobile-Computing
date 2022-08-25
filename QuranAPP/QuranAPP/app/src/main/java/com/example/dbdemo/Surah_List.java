package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

public class Surah_List extends AppCompatActivity {
   // ListView surah_list;
   private RecyclerView recyclerView;
    public String[] urduSurahNames = {
            "الفاتحۃ",
            "البقرۃ",
            "آل عمران",
            "النسآء",
            "المآئدۃ",
            "الانعام",
            "الاعراف",
            "الانفال",
            "التوبۃ",
            "یونس",
            "ھود",
            "یوسف",
            "الرعد",
            "ابراھیم",
            "الحجر",
            "النحل",
            "الاسراء",
            "الکہف",
            "مریم",
            "طٰہٰ",
            "الانبیآء",
            "الحج",
            "المؤمنون",
            "النور",
            "الفرقان",
            "الشعراء",
            "النمل",
            "القصص",
            "العنکبوت",
            "الروم",
            "لقمٰن",
            "السجدۃ",
            "الاحزاب",
            "سبا",
            "فاطر",
            "یٰسٓ",
            "الصّٰفّٰت",
            "صٓ",
            "الزمر",
            "الغافر",
            "فصلت",
            "الشُّورٰی",
            "الزُّخرُف",
            "الدُّخَان",
            "الجاثیہ",
            "الاحقاف",
            "محمد",
            "الفتح",
            "الحجرات",
            "قٓ",
            "الذّٰریٰت",
            "الطّور",
            "النجم",
            "القمر",
            "الرحمٰن",
            "الواقعۃ",
            " الحدید",
            "المجادلۃ",
            "الحشر",
            " الممتحنۃ",
            "الصّف",
            "الجُمعۃ",
            "المُنٰفِقُون",
            " التّغابن",
            "الطّلاق",
            "التحریم",
            "الملک",
            "القلم",
            " الحاقہ",
            "المعارج",
            "نُوح",
            "الجن",
            "المزّمّل",
            "المدّثّر",
            "القیٰمۃ",
            "الانسان",
            "المرسلٰت",
            "النَّبَاِ",
            "النّٰزِعٰتِ",
            "عَبَسَ",
            " التَّکوِیر",
            " الاِنفِطَار",
            "المُطَفِّفِین",
            "الاِنشِقَاق",
            "البُرُوج",
            "الطَّارق",
            "الاَعلیٰ",
            "الغَاشِیَۃ",
            "الفجر",
            "البلد",
            " الشَّمس",
            "الَّیل",
            "الضُّحٰی",
            "الم نشرح",
            "التّین",
            "العَلَق",
            " القدر",
            "البیّنۃ",
            "الزّلزال",
            "العٰدیٰت",
            " القارعۃ",
            "التّکاثُر",
            " العصر",
            "الھُمَزَۃ",
            "الفِیل",
            "قُرَیش",
            "المَاعُون",
            "الکوثر",
            "الکٰفرون",
            "النَّصَر",
            "اللَّھب",
            "الاخلاص",
            "الفَلَق",
            " النَّاس"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_list);
        recyclerView=findViewById(R.id.activity_surah_list);
//        Intent intent=getIntent();
        QDH qdh=new QDH();


        SurahListAdapter myRecyclerAdapter = new SurahListAdapter(android.R.layout.simple_list_item_1, urduSurahNames);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(myRecyclerAdapter);
        myRecyclerAdapter.onRecyclerViewClickListener(new SurahListAdapter.onRecyclerViewClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent=new Intent(getApplicationContext(), Surah_Display.class);
                intent.putExtra("Surah_no",position+1);
                startActivity(intent);
            }
        });


     //   recyclerView.setOnClickListener();


       // ArrayAdapter<String> arrayadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,qdh.GetSurahNames());
       // surah_list.setAdapter(arrayadapter);


//            }
  //      });
    }
}
