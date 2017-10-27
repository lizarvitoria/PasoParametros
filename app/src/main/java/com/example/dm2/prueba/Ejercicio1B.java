package com.example.dm2.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1B extends AppCompatActivity {
    private String mensaje1 = "Hola ";
    private String mensaje2 = ". ¿Aceptas las condiciones?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        setContentView(R.layout.activity_ejercicio1_b);
        setTitle("Aceptar Condiciones");
        ((TextView)findViewById(R.id.lblIden)).setText(mensaje1+extras.getString("nombre") + " " + extras.getString("apellidos")+mensaje2);
    }

    public void aceptar(View v){
        Intent intent = new Intent();
        intent.putExtra("respuesta", true);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void rechazar(View v){
        Intent intent = new Intent();
        intent.putExtra("respuesta", false);
        setResult(RESULT_OK, intent);
        finish();
    }

}
