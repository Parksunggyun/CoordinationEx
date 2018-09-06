package com.example.rowan_dev.coordinationex;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.rowan_dev.coordinationex.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.collapseLayout.setTitle("타이틀입니다.");
        binding.collapseLayout.setExpandedTitleColor(Color.WHITE);
        binding.collapseLayout.setCollapsedTitleTextColor(Color.WHITE);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        binding.recyclerView.setLayoutManager(manager);
        ArrayList<String> names = new ArrayList<>();
        names.add("Alpha");
        names.add("Beta");
        names.add("Charlie");
        names.add("Duke");
        names.add("Emma");
        names.add("Frank");
        names.add("Grace");
        names.add("Henry");
        names.add("Isabella");
        names.add("Jack");
        names.add("Kelley");
        names.add("Leona");
        MainAdapter adapter = new MainAdapter(names, this);
        binding.recyclerView.setAdapter(adapter);

    }
}
