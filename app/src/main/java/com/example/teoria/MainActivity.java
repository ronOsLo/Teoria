package com.example.teoria;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    EditText et1, et2;
    Button btnSuma;
    Button btnResta;
    Button btnMultiplicacion;
    Button btnDividir;
    Button btnLimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.txtNumero1);
        et2 = (EditText) findViewById(R.id.txtNumero2);

            btnSuma = (Button) findViewById(R.id.btnSuma);
            btnSuma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    float n1, n2, res;
                    if (et1.getText().length()==0){
                        Toast.makeText(getApplicationContext(),"Ingrece valores ", Toast.LENGTH_SHORT).show();
                    } else if (et2.getText().length()==0) {
                        Toast.makeText(getApplicationContext(),"Ingrece valores ", Toast.LENGTH_SHORT).show();
                    }else {
                        n1 = Float.parseFloat(et1.getText().toString());
                        n2 = Float.parseFloat(et2.getText().toString());
                        res = n1 + n2;
                        Toast.makeText(getApplicationContext(), "El resultado es: " + res, Toast.LENGTH_SHORT).show();
                    }
                }
            });

            btnResta=(Button) findViewById(R.id.btnResta);
            btnResta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    float n1, n2, res;
                    if (et1.getText().length()==0){
                        Toast.makeText(getApplicationContext(),"Ingrece valores ", Toast.LENGTH_SHORT).show();
                    } else if (et2.getText().length()==0) {
                        Toast.makeText(getApplicationContext(),"Ingrece valores ", Toast.LENGTH_SHORT).show();
                    }else {
                        n1 = Float.parseFloat(et1.getText().toString());
                        n2 = Float.parseFloat(et2.getText().toString());
                        res = n1 - n2;
                        Toast.makeText(getApplicationContext(), "El resultado es: " + res, Toast.LENGTH_SHORT).show();
                    } }
            });

            btnMultiplicacion = (Button) findViewById(R.id.btnMultiplicacion);
            btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    float n1, n2, res;
                    if (et1.getText().length()==0){
                        Toast.makeText(getApplicationContext(),"Ingrece valores ", Toast.LENGTH_SHORT).show();
                    } else if (et2.getText().length()==0) {
                        Toast.makeText(getApplicationContext(),"Ingrece valores ", Toast.LENGTH_SHORT).show();
                    }else {
                        n1 = Float.parseFloat(et1.getText().toString());
                        n2 = Float.parseFloat(et2.getText().toString());
                        res = n1 + n2;
                        Toast.makeText(getApplicationContext(), "El resultado es: " + res, Toast.LENGTH_SHORT).show();
                    }
                }
            });
            btnDividir = (Button) findViewById(R.id.btnDividir);
            btnDividir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    float n1, n2, res;
                    if (et1.getText().length()==0){
                        Toast.makeText(getApplicationContext(),"Ingrece valores ", Toast.LENGTH_SHORT).show();
                    } else if (et2.getText().length()==0) {
                        Toast.makeText(getApplicationContext(),"Ingrece valores ", Toast.LENGTH_SHORT).show();
                    }else {
                        n1 = Float.parseFloat(et1.getText().toString());
                        n2 = Float.parseFloat(et2.getText().toString());
                        res = n1 + n2;
                        Toast.makeText(getApplicationContext(), "El resultado es: " + res, Toast.LENGTH_SHORT).show();
                    }
                }
            });


        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et2.setText("");
                et1.setText("");
            }
        });



    }
    }
