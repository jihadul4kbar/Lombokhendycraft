package com.example.jihad.lombokhendycraft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GerabahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerabah);
    }
    public void songket(View view){
        Intent pindah = new Intent(GerabahActivity.this, SongketActivity.class);
        startActivity(pindah);
    }
    public void rotan(View view){
        Intent pindah = new Intent(GerabahActivity.this, RotanActivity.class);
        startActivity(pindah);
    }
}
