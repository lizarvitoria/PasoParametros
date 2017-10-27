package com.example.dm2.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ejercicio4B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4_b);
        Bundle extras = getIntent().getExtras();
        ((TextView)findViewById(R.id.lblNombre)).setText(extras.getString("nombre"));
        ((TextView)findViewById(R.id.lblApellidos)).setText(extras.getString("apellidos"));
        ((TextView)findViewById(R.id.lblSexo)).setText(extras.getString("sexo"));
        ((TextView)findViewById(R.id.lblAficiones)).setText(extras.getString("aficiones"));
        if(extras.getString("aficiones").length()==0)
            ((TextView)findViewById(R.id.lblAficiones)).setText("Ninguna");
    }

    public void salir(View v){
        finish();
    }
}
