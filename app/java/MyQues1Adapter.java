package com.example.jiseaty;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyQues1Adapter extends RecyclerView.Adapter<MyQues1ViewHolder> {
    Context context;
    List<Item3> items;

    public MyQues1Adapter(Context context, List<Item3> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyQues1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyQues1ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view_ques,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyQues1ViewHolder holder, int position) {
        holder.date.setText(items.get(position).getDate());
        final int itemPosition = holder.getAdapterPosition();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, pdfview.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("webUrl",items.get(itemPosition).getPdf_url());
                intent.putExtra("pdfName",items.get(itemPosition).getPdf_name());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
