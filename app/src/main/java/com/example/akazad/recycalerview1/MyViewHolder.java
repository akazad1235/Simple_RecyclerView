package com.example.akazad.recycalerview1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder{

    TextView nametext;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        nametext=(TextView) itemView.findViewById(R.id.CityId);
    }
}
