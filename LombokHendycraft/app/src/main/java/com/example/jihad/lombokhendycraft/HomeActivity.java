package com.example.jihad.lombokhendycraft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
    }
    public void Beranda(View view){
        Intent pindah = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(pindah);
    }

    public void Songket(View view){
        Intent pindah = new Intent(HomeActivity.this, SongketActivity.class);
        startActivity(pindah);
    }
}
