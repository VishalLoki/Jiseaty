package com.example.jiseaty;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyMapViewHolder extends RecyclerView.ViewHolder {
    TextView loc_name;
    public MyMapViewHolder(@NonNull View itemView){
        super(itemView);
        loc_name = itemView.findViewById(R.id.loc_name);
    }
}
