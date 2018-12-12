package com.example.akazad.recycalerview1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
     Context c;
     ArrayList<String> CityNames;


    public MyAdapter( Context c, ArrayList<String> CityNames) {
        this.c = c;
        this.CityNames = CityNames;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.rowlayout, parent,false );
        MyViewHolder VH=new MyViewHolder(v);
        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
    holder.nametext.setText(CityNames.get(position));
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(c, CityNames.get(position), Toast.LENGTH_SHORT).show();
        }
    });

    }



    @Override
    public int getItemCount() {
        return CityNames.size();
    }
}
