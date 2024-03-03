package com.example.jiseaty;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyQuesViewHolder extends RecyclerView.ViewHolder {
    TextView sub_name;

    public MyQuesViewHolder(@NonNull View itemView) {
        super(itemView);
        sub_name = itemView.findViewById(R.id.sub_name);
    }
}
