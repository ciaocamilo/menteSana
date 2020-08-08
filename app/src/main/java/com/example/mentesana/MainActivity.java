package com.example.mentesana;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mentesana.model.Persona;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText)findViewById(R.id.txtNamePerson);

        FloatingActionButton fab = findViewById(R.id.floatingTerminos);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irTerminos(view);
            }
        });

    }

    public void ingresar(View view) {
        Intent intro = new Intent(this, Intro.class);
        String nombre = etNombre.getText().toString();
        final Persona persona = new Persona();
        persona.setName(nombre);
        Toast.makeText(this, "Bienvenido(a) " + persona.getName(), Toast.LENGTH_LONG).show();
        intro.putExtra("persona", nombre);
        startActivity(intro);
    }

    public void irTerminos(View view) {
        Intent terminos = new Intent(this, Terminos.class);
        startActivity(terminos);
    }

}