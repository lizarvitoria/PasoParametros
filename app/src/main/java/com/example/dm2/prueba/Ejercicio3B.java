package com.example.dm2.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ejercicio3B extends AppCompatActivity {
    boolean correcto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3_b);
        Bundle extras = getIntent().getExtras();
        String mensaje = "El resultado de la operación es ";
        int num1, num2, resultado;
        num1 = extras.getInt("user");
        num2 = extras.getInt("pass");
        resultado = extras.getInt("pass");
        correcto = num1+num2==resultado;
        if(correcto)
            mensaje += "CORRECTO";
        else
            mensaje += "INCORRECTO";
        ((TextView)findViewById(R.id.lblMensaje)).setText(mensaje);
    }

    public void salir(View v) {
        Intent intent = new Intent();
        intent.putExtra("resultado",correcto);
        setResult(RESULT_OK, intent);
        finish();
    }
}
