package com.example.dm2.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Comunicacion");
    }

    public void Ejercicio1(View v){
        Intent Ejer1 = new Intent(MainActivity.this, Ejercicio1A.class);
        startActivity(Ejer1);
    }

    public void Ejercicio2(View v){
        Intent Ejer2 = new Intent(MainActivity.this, Ejercicio2A.class);
        startActivity(Ejer2);
    }

    public void Ejercicio3(View v){
        Intent Ejer3 = new Intent(MainActivity.this, Ejercicio3A.class);
        startActivity(Ejer3);
    }

    public void Ejercicio4(View v){
        Intent Ejer4 = new Intent(MainActivity.this, Ejercicio4A.class);
        startActivity(Ejer4);
    }

    public void salir(View v){
        finish();
    }
}
