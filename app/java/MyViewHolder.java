package com.example.jiseaty;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    com.google.android.material.imageview.ShapeableImageView image;
    TextView name,description,dept;
    ImageView shareButton;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        image= itemView.findViewById(R.id.image);
        name=itemView.findViewById(R.id.name);
        description=itemView.findViewById(R.id.description);
        dept=itemView.findViewById(R.id.dept);
        shareButton=itemView.findViewById(R.id.shareButton);


    }

}
