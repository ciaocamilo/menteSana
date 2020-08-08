package com.example.mentesana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Terminos extends AppCompatActivity {

    private TextView tvTerminos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminos);
        tvTerminos = (TextView)findViewById(R.id.txtTerminos);

        String textoTerminos = "MenteSANA es una aplicación gratuita desarrollada por la empresa Mente Sana de la ciudad de Ibagué, que facilita información y actividades enfocadas en la salud mental. Permite orientar a los usuarios para identificar aspectos que generan malestar psicológico, aspectos relevantes en su vida y establecer acciones que podrían reducir dicho malestar.\n\nEstá basada en algunos componentes de la terapia de aceptación y compromiso (ACT) como por ejemplo: Estar presente, aceptación, valores, el yo contextual y realización de acciones orientadas por los valores de la persona.\n\nÉsta herramienta no representa ni sustituye el acompañamiento de un profesional.\n\nMente sana facilita información y actividades  de apoyo a lo usuarios, más no reemplaza una intervención psicológica, ya que en caso de requerirse deben comunicarse con un centro especializado que pueda prestarles dicha atención.\n\nSi estás en Ibagué - Colombia puedes comunicarte al 123 'Yo te escucho', con la Cruz Roja al 3183730661 y Fundación Rescatando Vidas al 3187665226";
        tvTerminos.setText(textoTerminos);
    }

    public void salir(View view){
        Intent ingreso = new Intent(this, MainActivity.class);
        startActivity(ingreso);
    }

}