package com.example.dm2.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1_a);
        setTitle("Nombre & Apellidos");
    }

    public void verificar(View v){
        Intent Ejer1B = new Intent(Ejercicio1A.this, Ejercicio1B.class);
        Ejer1B.putExtra("nombre",((EditText)findViewById(R.id.txtNombre)).getText().toString());
        Ejer1B.putExtra("apellidos",((EditText)findViewById(R.id.txtApellidos)).getText().toString());
        startActivityForResult(Ejer1B,001);

    }

    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        if (requestCode==001 && resultCode==RESULT_OK ){
            String mensaje = data.getExtras().getBoolean("respuesta") ? "ACEPTADO" : "RECHAZADO";
            ((TextView)findViewById(R.id.lblCondiciones)).setText(mensaje);
        }
    }

    public void salir(View v){
        finish();
    }

}
