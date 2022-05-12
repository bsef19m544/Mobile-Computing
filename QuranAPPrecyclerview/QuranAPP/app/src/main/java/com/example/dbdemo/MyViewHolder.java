package com.example.dbdemo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public  class MyViewHolder extends RecyclerView.ViewHolder {

    TextView urdu;


    public MyViewHolder(@NonNull View itemView, SurahListAdapter.onRecyclerViewClickListener  listener) {
        super(itemView);
        urdu= itemView.findViewById(R.id.urdu);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
if(listener !=null ){
    listener.onItemClick(
            getAdapterPosition()
    );
}
            }
        });
    }



    public void setData(String m) {

        urdu.setText(m);


    }


}
