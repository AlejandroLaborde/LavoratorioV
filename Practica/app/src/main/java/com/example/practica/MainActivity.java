package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List listaPersonas = new ArrayList<Persona>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.listaPersonas.add(new Persona("Alejandro","Laborde","25","Desarrollador Ssr","descarga.jpg"));
        this.listaPersonas.add(new Persona("Daniel","Laborde","29","Profe educacion Fisica","descarga.jpg"));
        this.listaPersonas.add(new Persona("Pamela","Laborde","37","Administradora","descarga2.png"));
        this.listaPersonas.add(new Persona("Jessica","Laborde","26","Maestra/directora","descarga2.png"));
        this.listaPersonas.add(new Persona("Gustavo","Laborde","21","Desempleado","descarga.jpg"));




    }
}