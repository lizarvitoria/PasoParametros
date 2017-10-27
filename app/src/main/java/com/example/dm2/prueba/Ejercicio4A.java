package com.example.dm2.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.List;

public class Ejercicio4A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4_a);
    }

    public void enviar(View v){
        if(comprobarInputs()) {
            Intent Ejer4B = new Intent(Ejercicio4A.this, Ejercicio4B.class);
            int idRadio = ((RadioGroup) findViewById(R.id.grupoSexo)).getCheckedRadioButtonId();
            Ejer4B.putExtra("nombre", ((EditText) findViewById(R.id.txtNom)).getText().toString());
            Ejer4B.putExtra("apellidos", ((EditText) findViewById(R.id.txtApe)).getText().toString());
            Ejer4B.putExtra("sexo", (((RadioButton) findViewById(idRadio)).getText()).toString());
            String aficiones = "";
            if (((CheckBox) findViewById(R.id.chk1)).isChecked())
                aficiones += ((CheckBox) findViewById(R.id.chk1)).getText().toString();
            if (((CheckBox) findViewById(R.id.chk2)).isChecked()) {
                if (aficiones.length() > 0)
                    aficiones += ", ";
                aficiones += ((CheckBox) findViewById(R.id.chk2)).getText().toString();
            }
            if (((CheckBox) findViewById(R.id.chk3)).isChecked()){
                if (aficiones.length() > 0)
                    aficiones += ", ";
                aficiones += ((CheckBox) findViewById(R.id.chk3)).getText().toString();
            }
            if(((CheckBox)findViewById(R.id.chk4)).isChecked()) {
                if (aficiones.length() > 0)
                    aficiones += ", ";
                aficiones += ((CheckBox) findViewById(R.id.chk4)).getText().toString();
            }
            Ejer4B.putExtra("aficiones", aficiones);
            startActivity(Ejer4B);
        }else
            Toast.makeText(getApplicationContext(), "Faltan datos por introducir",Toast.LENGTH_SHORT).show();
    }

    public boolean comprobarInputs(){
        boolean completo = true;
        if(((EditText)findViewById(R.id.txtNom)).getText().toString().length()==0 || ((EditText)findViewById(R.id.txtApe)).getText().toString().length()==0)
            completo = false;
        else{
            if(!((RadioButton)(findViewById(R.id.radMasculino))).isChecked() && !((RadioButton)(findViewById(R.id.radFemenino))).isChecked() )
                completo = false;
        }
        return completo;
    }
}
