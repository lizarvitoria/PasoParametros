package com.example.dm2.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ejercicio2B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        setContentView(R.layout.activity_ejercicio2_b);
        String mensaje, user, pass;
        user = extras.getString("user");
        pass = extras.getString("pass");
        if(user.equals("ibai")&& pass.equals("1234"))
            mensaje = "El USUARIO y la PASSWORD son CORRECTAS";
        else
            mensaje = "USUARIO Y/O PASSWORD INCORRECTA";

        ((TextView)findViewById(R.id.lblMensaje)).setText(mensaje);
    }

    public void salir(View v){
        finish();
    }
}
