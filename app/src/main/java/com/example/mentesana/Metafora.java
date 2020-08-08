package com.example.mentesana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mentesana.model.Componente;
import com.example.mentesana.model.Data;

public class Metafora extends AppCompatActivity {

    private String nombre;
    private String componente;

    private TextView tvMetafora;
    private TextView tvVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metafora);

        nombre = getIntent().getStringExtra("persona");
        componente = getIntent().getStringExtra("componente");

        tvMetafora = (TextView)findViewById(R.id.txtMetafora);
        tvVideo = (TextView)findViewById(R.id.txtVideo);

        Data arregloDatos = new Data();
        Componente datos = arregloDatos.obtenerDato(componente);

        tvMetafora.setText(datos.getMetafora());
        tvVideo.setText(datos.getVideo());
    }

    public void irEjercicio(View view){
        Intent ejercicio = new Intent(this, Ejercicio.class);
        ejercicio.putExtra("persona", nombre);
        ejercicio.putExtra("componente", componente);
        startActivity(ejercicio);
    }
}