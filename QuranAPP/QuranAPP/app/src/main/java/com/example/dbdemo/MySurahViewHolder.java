package com.example.dbdemo;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

    public class MySurahViewHolder extends RecyclerView.ViewHolder {

        TextView ayah;
        TextView urdu;
        TextView english;

    public MySurahViewHolder(@NonNull View itemView) {
        super(itemView);
         ayah= itemView.findViewById(R.id.ayah);
         urdu= itemView.findViewById(R.id.urdu);
         ayah= itemView.findViewById(R.id.english);

    }

    public void setData(Ayah a) {
       ayah.setText(a.getAyah());
        urdu.setText(a.getUrduTranslation());
        english.setText(a.getEnglishTranslation());
    }
}

