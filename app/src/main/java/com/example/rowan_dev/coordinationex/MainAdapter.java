package com.example.rowan_dev.coordinationex;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.rowan_dev.coordinationex.databinding.ItemMainBinding;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter {

    private ArrayList<String> names;
    private Context context;

    public MainAdapter(ArrayList<String> names, Context context) {
        this.names = names;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemMainBinding binding = ItemMainBinding.inflate(LayoutInflater.from(context), viewGroup, false);
        return new MainHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        MainHolder holder = (MainHolder) viewHolder;
        ItemMainBinding binding = holder.binding;
        binding.textView.setText(names.get(i));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    class MainHolder extends RecyclerView.ViewHolder {
        ItemMainBinding binding;

        public MainHolder(ItemMainBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
