package com.ihsan.simlab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ihsan.simlab.R;

import java.util.List;

public class AdapterBarang extends RecyclerView.Adapter<AdapterBarang.ViewHolder> {
    private LayoutInflater layoutInflater;
    private List<String> data;

    public AdapterBarang(Context context, List<String> data) {
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }

    @NonNull
    @Override
    public AdapterBarang.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_item_barang, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBarang.ViewHolder holder, int position) {
        String namaBarang = data.get(position);
        holder.tvNamaBarang.setText(namaBarang);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaBarang;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaBarang = itemView.findViewById(R.id.tv_nama_barang);
        }
    }
}
