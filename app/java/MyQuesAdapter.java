package com.example.jiseaty;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyQuesAdapter extends RecyclerView.Adapter<MyQuesViewHolder> {
    Context context;
    List<Item2> items;

    public MyQuesAdapter(Context context, List<Item2> items) {
        this.context = context;
        this.items = items;
    }
    @NonNull
    @Override
    public MyQuesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyQuesViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view_ques,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyQuesViewHolder holder, int position) {
        holder.sub_name.setText(items.get(position).getSub_name());
        final int itemPosition = holder.getAdapterPosition();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, subject2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("deptName",items.get(itemPosition).getDept());
                intent.putExtra("reg",items.get(itemPosition).getReg());
                intent.putExtra("sem",items.get(itemPosition).getSem());
                intent.putExtra("sub_name",items.get(itemPosition).getSub_name());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
