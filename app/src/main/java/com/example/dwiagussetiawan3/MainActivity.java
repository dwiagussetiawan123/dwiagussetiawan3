package com.example.dwiagussetiawan3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button tombol;
    Intent pindah;
    ImageButton btnKucing,btnAnjing,btnUlar;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKucing = findViewById(R.id.btn_buka_ras_kucing);
        btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
        btnUlar = findViewById(R.id.btn_buka_ras_ular);
        tombol = findViewById(R.id.btn_buka_Myprofil);
        btnUlar.setOnClickListener(view -> bukaGaleri("Ular"));
        btnKucing.setOnClickListener(view -> bukaGaleri("Kucing"));
        btnAnjing.setOnClickListener(view -> bukaGaleri("Anjing"));
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, MyprofilActivity.class);
                startActivity(pindah);
            }
        });
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}