package com.example.mentesana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Intro extends AppCompatActivity {

    private String nombre;
    private TextView tvIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        nombre = getIntent().getStringExtra("persona");
        tvIntro = (TextView)findViewById(R.id.txtIntro);

        String textoIntro = "Por medio de la terapia de aceptación y compromiso se logra aceptar y tomar de consciencia del propio comportamiento y entrar en contacto con el presente de una forma más completa como ser humano consciente para cambiar el comportamiento que genera incomodidad  o persistir en el comportamiento necesario para alcanzar las metas.\n\nEl dolor es inevitable y evitarlo no es la mejor solución, es por esto que la aceptación es una alternativa adecuada ya que convierte los eventos problemáticos en oportunidades para el crecimiento, interés, o comprensión.\n\nHas sentido que estás en un callejón sin salida, que intentas eliminar o reducir el malestar y terminas actuando de tal forma que  se hace cada vez más difícil la situación y no sales del constante sufrimiento? Es hora de iniciar un cambio!\n\nTe invito a que sigas tus propios valores y así logres vivir de forma más plena tu vida";
        tvIntro.setText(textoIntro);
    }

    public void salir(View view){
        Intent ingreso = new Intent(this, MainActivity.class);
        startActivity(ingreso);
    }

    public void irMenu(View view){
        Intent menu = new Intent(this, Menu.class);
        menu.putExtra("persona", nombre);
        startActivity(menu);
    }

}