package com.example.mentesana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mentesana.model.Componente;
import com.example.mentesana.model.Data;

public class Definicion extends AppCompatActivity {

    private String nombre;
    private String componente;

    private TextView tvTitulo;
    private TextView tvDefinicion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definicion);

        nombre = getIntent().getStringExtra("persona");
        componente = getIntent().getStringExtra("componente");

        tvTitulo = (TextView)findViewById(R.id.txtTitulo);
        tvDefinicion = (TextView)findViewById(R.id.txtDefinicion);

        Data arregloDatos = new Data();
        Componente datos = arregloDatos.obtenerDato(componente);

        tvTitulo.setText(datos.getNombre());
        tvDefinicion.setText(nombre + "" + datos.getDefinicion());

    }

    public void irMetafora(View view){
        Intent metafora = new Intent(this, Metafora.class);
        metafora.putExtra("persona", nombre);
        metafora.putExtra("componente", componente);
        startActivity(metafora);
    }

}