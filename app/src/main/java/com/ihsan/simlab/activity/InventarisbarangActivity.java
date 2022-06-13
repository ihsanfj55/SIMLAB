package com.ihsan.simlab.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import com.ihsan.simlab.R;
import com.ihsan.simlab.adapter.AdapterBarang;

import java.util.ArrayList;

public class InventarisbarangActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    AdapterBarang adapterBarang;
    ArrayList<String> namabarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventaris_barang);
        bindBarang();

    }
    private void bindBarang(){
        namabarang = new ArrayList<>();
        namabarang.add("Computer HP Pavilion Gaming");
        namabarang.add("Crimping Tool Deli");
        namabarang.add("Mikrotik RB501");
        namabarang.add("Monitor HP 24MH");
        namabarang.add("Mouse HP");
        namabarang.add("Keyboard HP");
        recyclerView = findViewById(R.id.rv_barang);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterBarang = new AdapterBarang(this, namabarang);
        recyclerView.setAdapter(adapterBarang);


    }
}