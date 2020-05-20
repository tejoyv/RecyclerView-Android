package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    // data array
    String[]data;

    public ProgrammingAdapter(String[]data){
        this.data=data;
    }

    // creates view and stores in viewholder.For this we'll be using object
    // of LayoutInflater class
    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new ProgrammingViewHolder(view);
    }

    // binds data with the views (data binding).for this create list_item.xml
    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {
        String title = data[position];
        holder.textView.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    // nested viewholder class for retaining views so that it can be recycled
    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView textView;
        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            imgIcon = (ImageView)itemView.findViewById(R.id.image);
            textView = (TextView)itemView.findViewById(R.id.text);
        }
    }
}
