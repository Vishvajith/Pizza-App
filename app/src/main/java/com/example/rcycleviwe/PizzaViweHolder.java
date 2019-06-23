package com.example.rcycleviwe;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class PizzaViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    RelativeLayout relativeLayout;
    PizzaViewHolder(View view) {
        super(view);
        relativeLayout = view.findViewById(R.id.listitem);
        textView = view.findViewById(R.id.textView);
    }
}
