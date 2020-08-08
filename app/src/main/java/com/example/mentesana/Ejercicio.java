package com.example.mentesana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mentesana.model.Componente;
import com.example.mentesana.model.Data;

public class Ejercicio extends AppCompatActivity {

    private String nombre;
    private String componente;

    private TextView tvEjercicio;
    private TextView tvVideoEjercicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

        nombre = getIntent().getStringExtra("persona");
        componente = getIntent().getStringExtra("componente");

        tvEjercicio = (TextView)findViewById(R.id.txtEjercicio);
        tvVideoEjercicio = (TextView)findViewById(R.id.txtVideoEjercicio);

        Data arregloDatos = new Data();
        Componente datos = arregloDatos.obtenerDato(componente);

        tvEjercicio.setText(nombre + "" + datos.getEjercicio());
        tvVideoEjercicio.setText(datos.getVideoEjercicio());
    }

    public void irMenu(View view){
        Intent menu = new Intent(this, Menu.class);
        menu.putExtra("persona", nombre);
        startActivity(menu);
    }

}