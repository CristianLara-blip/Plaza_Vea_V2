package com.example.plazavea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Botones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);
    }
    public void Salir(View v) {
        Intent salir = new Intent(this, Menu.class);
        startActivity(salir);
    }

}