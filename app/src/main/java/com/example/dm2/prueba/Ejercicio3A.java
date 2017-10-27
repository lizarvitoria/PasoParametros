package com.example.dm2.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Ejercicio3A extends AppCompatActivity {
    Random rand = new Random();
    int correctas = 0, incorrectas = 0, num1 = rand.nextInt(100), num2 = rand.nextInt(100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3_a);
        ((EditText)findViewById(R.id.txtNum1)).setText(""+num1);
        ((EditText)findViewById(R.id.txtNum2)).setText(""+num2);
    }

    public void comprobar(View v){
        Intent Ejer3B = new Intent(Ejercicio3A.this, Ejercicio3B.class);
        Ejer3B.putExtra("num1",Integer.parseInt(((EditText)findViewById(R.id.txtNum1)).getText().toString()));
        Ejer3B.putExtra("num2",Integer.parseInt(((EditText)findViewById(R.id.txtNum2)).getText().toString()));
        Ejer3B.putExtra("resultado",Integer.parseInt(((EditText)findViewById(R.id.editResultado)).getText().toString()));
        startActivityForResult(Ejer3B,1234);
    }

    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        if (requestCode==1234 && resultCode==RESULT_OK ) {
            if(data.getExtras().getBoolean("resultado"))
                correctas++;
            else
                incorrectas++;
            num1 = rand.nextInt(100);
            num2 = rand.nextInt(100);
            ((TextView)findViewById(R.id.lblCorrectas)).setText(""+correctas);
            ((TextView)findViewById(R.id.lblIncorrectas)).setText(""+incorrectas);
            ((EditText)findViewById(R.id.txtNum1)).setText(""+num1);
            ((EditText)findViewById(R.id.txtNum2)).setText(""+num2);
            ((EditText)findViewById(R.id.editResultado)).setText("");
        }
    }

}
