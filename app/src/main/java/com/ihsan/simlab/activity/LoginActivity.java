package com.ihsan.simlab.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.ihsan.simlab.R;

public class LoginActivity extends AppCompatActivity {

    private String[] itemsTipePengguna = {"Dosen", "Mahasiswa", "Pengunjung"};
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItemsTipePengguna;
    TextView tvBuatAkun;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        autoCompleteTextView = findViewById(R.id.autoCompletePengguna);
        adapterItemsTipePengguna = new ArrayAdapter<String>(this, R.layout.list_item_tipe_pengguna, itemsTipePengguna);
        autoCompleteTextView.setAdapter(adapterItemsTipePengguna);
        String textBuatAkun = "Pengunjung Belum Punya Akun? <b><font color=#396ead>Buat Akun</font></b>";

        tvBuatAkun = findViewById(R.id.tv_buat_akun);
        tvBuatAkun.setText(Html.fromHtml(textBuatAkun));
        tvBuatAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }

}