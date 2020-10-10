package com.example.reciclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class AltaPersonaActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alta_persona);
        Persona person = new Persona("Persona nueva", "Apellido Nuevo");
        MainActivity.personas.add(person);

        ActionBar ab = this.getSupportActionBar();
        ab.setTitle("Agregar Contacto");
        ab.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        //Para agarrar el id del backandroid
        if( item.getItemId()== android.R.id.home ){
            super.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}