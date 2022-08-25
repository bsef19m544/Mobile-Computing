package com.example.dbdemo;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ViewHolder extends RecyclerView.ViewHolder {
    TextView ayah;
    TextView urdu;
    TextView english;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        ayah=itemView.findViewById(R.id.ayah);
        urdu= itemView.findViewById(R.id.urdu);
        english= itemView.findViewById(R.id.english);


    }
    public void setData(Ayah m) {
        ayah.setText(m.getAyah());
        urdu.setText(m.getUrduTranslation());
        english.setText(m.getEnglishTranslation());


    }

}