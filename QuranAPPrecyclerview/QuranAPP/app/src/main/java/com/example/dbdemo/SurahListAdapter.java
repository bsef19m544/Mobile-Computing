package com.example.dbdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Context;


public class SurahListAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    int s;
    String[] urduSurahNames;


    private onRecyclerViewClickListener listener;
    View v;


    public interface onRecyclerViewClickListener {
   void onItemClick(int position);
    }

    public void onRecyclerViewClickListener(onRecyclerViewClickListener listener){
        this.listener=listener;
    }

    public SurahListAdapter(int simple_list_item_1, String[] urduSurahNames) {

        this.urduSurahNames=urduSurahNames;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        MyViewHolder viewHolder;
        View view = inflater.inflate(R.layout.activity_surahdata, parent, false);
        viewHolder = new MyViewHolder(view,listener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
     holder.setData(urduSurahNames[position]);
    }


    @Override
    public int getItemCount() {
       return urduSurahNames.length;
        }


    }






