package com.ihsan.simlab.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.ihsan.simlab.R;

public class LoginActivity extends AppCompatActivity {

    private String[] itemsTipePengguna = {"Dosen", "Mahasiswa", "Pengunjung"};
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItemsTipePengguna;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        autoCompleteTextView = findViewById(R.id.autoCompletePengguna);
        adapterItemsTipePengguna = new ArrayAdapter<String>(this, R.layout.list_item, itemsTipePengguna);
        autoCompleteTextView.setAdapter(adapterItemsTipePengguna);
    }
}