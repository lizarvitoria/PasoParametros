package com.example.dm2.prueba;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ejercicio2A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2_a);
        setTitle("Comunicacion");
    }

    public void iniciar(View v){
        Intent Ejer2B = new Intent(Ejercicio2A.this, Ejercicio2B.class);
        Ejer2B.putExtra("user",((EditText)findViewById(R.id.txtUser)).getText().toString());
        Ejer2B.putExtra("pass",((EditText)findViewById(R.id.txtPass)).getText().toString());
        startActivity(Ejer2B);
    }

    public void olvidada(View v){
        AlertDialog alertDialog = new AlertDialog.Builder(Ejercicio2A.this).create();
        alertDialog.setTitle("");
        alertDialog.setMessage("Qué pena...");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}
