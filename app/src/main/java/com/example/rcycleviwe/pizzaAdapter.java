package com.example.rcycleviwe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class pizzaAdapter extends RecyclerView.Adapter<PizzaViewHolder> {
    private String Pizza[] = {"Pizza one", "Pizza two", "Pizza three"};


    @Override
    public PizzaViewHolder onCreateViewHolder( ViewGroup viewGroup, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View listItem = layoutInflater.inflate(R.layout.listlayout,null);
        PizzaViewHolder vh =new PizzaViewHolder(listItem);
        return vh;
    }

    @Override
    public void onBindViewHolder( PizzaViewHolder holder, final int  position) {
        holder.textView.setText(Pizza[position]);

    }

    @Override
    public int getItemCount() {
        return Pizza.length;
    }
}
