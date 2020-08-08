package com.example.mentesana;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Menu extends AppCompatActivity {

    private String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        nombre = getIntent().getStringExtra("persona");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Si necesitas ayuda puedes llamar en Ibagué a:\nYo te escucho: 123 - Cruz Roja: 3183730661", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void salir(View view){
        Intent ingreso = new Intent(this, MainActivity.class);
        startActivity(ingreso);
    }

    public void irPresente(View view){
        Intent definicion = new Intent(this, Definicion.class);
        definicion.putExtra("persona", nombre);
        String componente = "presente";
        definicion.putExtra("componente", componente);
        startActivity(definicion);
    }

    public void irAceptacion(View view){
        Intent definicion = new Intent(this, Definicion.class);
        definicion.putExtra("persona", nombre);
        String componente = "aceptacion";
        definicion.putExtra("componente", componente);
        startActivity(definicion);
    }

    public void irValores(View view){
        Intent definicion = new Intent(this, Definicion.class);
        definicion.putExtra("persona", nombre);
        String componente = "valores";
        definicion.putExtra("componente", componente);
        startActivity(definicion);
    }

    public void irContextual(View view){
        Intent definicion = new Intent(this, Definicion.class);
        definicion.putExtra("persona", nombre);
        String componente = "contextual";
        definicion.putExtra("componente", componente);
        startActivity(definicion);
    }

    public void irAccion(View view){
        Intent definicion = new Intent(this, Definicion.class);
        definicion.putExtra("persona", nombre);
        String componente = "accion";
        definicion.putExtra("componente", componente);
        startActivity(definicion);
    }
}