package com.example.jiseaty;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyMapAdapter extends RecyclerView.Adapter<MyMapViewHolder> {

    Context context;
    List<Item1> items;

    public MyMapAdapter(Context context, List<Item1> items) {
        this.context = context;
        this.items = items;
    }

    public void setFilteredList(List<Item1> filteredList){
        this.items = filteredList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyMapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyMapViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view_map,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyMapViewHolder holder, int position) {
        holder.loc_name.setText(items.get(position).getLocation_name());
        final int itemsPosition = holder.getAdapterPosition();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,FinalMap.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("loc_name",items.get(itemsPosition).getLocation_name());
                intent.putExtra("loc_name1",items.get(itemsPosition).getLocation_name1());
                intent.putExtra("image_url",items.get(itemsPosition).getImage_Url());
                intent.putExtra("lat",items.get(itemsPosition).getLatitude());
                intent.putExtra("lon",items.get(itemsPosition).getLongitude());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
