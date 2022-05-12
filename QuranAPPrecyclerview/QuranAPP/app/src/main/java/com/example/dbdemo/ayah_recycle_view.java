package com.example.dbdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ayah_recycle_view extends RecyclerView.Adapter<ViewHolder> {
    Context context;
    ArrayList<Ayah> t;
    public ayah_recycle_view(@NonNull Context context, ArrayList<Ayah> ayah) {
     this.context=context;
     this.t=ayah;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


            LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
            View view=layoutInflater.inflate(R.layout.activity_list_adapter_ayahs,parent,false);
            ViewHolder viewHolder= new ViewHolder(view);
            return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(t.get(position));

    }

    @Override
    public int getItemCount() {
        return t.size();
    }
}