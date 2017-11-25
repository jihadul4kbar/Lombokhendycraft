package com.example.jihad.lombokhendycraft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SongketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songket);
    }
    public void Beranda(View view){
        Intent pindah = new Intent(SongketActivity.this, HomeActivity.class);
        startActivity(pindah);
    }
    public void gerabah(View view){
        Intent pindah = new Intent(SongketActivity.this, GerabahActivity.class);
        startActivity(pindah);
    }
}
