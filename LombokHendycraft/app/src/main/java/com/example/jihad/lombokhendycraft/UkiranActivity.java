package com.example.jihad.lombokhendycraft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UkiranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ukiran);
    }
    public void rotan(View view){
        Intent pindah = new Intent(UkiranActivity.this, RotanActivity.class);
        startActivity(pindah);
    }

}
