package com.example.jihad.lombokhendycraft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RotanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotan);
    }

    public void gerabah(View view){
        Intent pindah = new Intent(RotanActivity.this, GerabahActivity.class);
        startActivity(pindah);
    }
    public void ukiran(View view){
        Intent pindah = new Intent(RotanActivity.this, UkiranActivity.class);
        startActivity(pindah);
    }
}
