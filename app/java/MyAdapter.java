package com.example.jiseaty;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }
    public void setFilteredList(List<Item> filteredList){
        this.items = filteredList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(items.get(position).getName());
        Picasso.get().load(items.get(position).getImageUrl()).placeholder(R.drawable.placeholder_image).error(R.drawable.error_image1).into(holder.image);
        holder.description.setText(items.get(position).getDescription());
        holder.dept.setText(items.get(position).getDept());

        final int itemPosition = holder.getAdapterPosition();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoutube(items.get(itemPosition).getVideoUrl());
            }
        });

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoLink = items.get(itemPosition).getVideoUrl();
                shareVideo(videoLink);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    private void openYoutube(String videoLink) {
        Log.d("MyAdapter", "Opening YouTube link: " + videoLink);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoLink));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
    private void shareVideo(String videoLink) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, videoLink);

        // Check if the context is an instance of Activity
        if (context instanceof Activity) {
            // If it's an Activity, start the activity directly
            ((Activity) context).startActivity(Intent.createChooser(shareIntent, "Share Video"));
        } else {
            // If it's not an Activity, create a new task and start the activity
            Intent newTaskIntent = new Intent(context, MyDummyActivity.class);
            newTaskIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            newTaskIntent.putExtra("shareIntent", shareIntent);
            context.startActivity(newTaskIntent);
        }
    }




}
