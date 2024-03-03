package com.example.jiseaty;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyQues1ViewHolder extends RecyclerView.ViewHolder {

    TextView date ;

    public MyQues1ViewHolder(@NonNull View itemView) {
        super(itemView);
        date = itemView.findViewById(R.id.sub_name);
    }
}
