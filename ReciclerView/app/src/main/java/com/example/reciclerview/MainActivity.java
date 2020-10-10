package com.example.reciclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    public static List<Persona> personas = new ArrayList<>();

    PersonaAdapter personaAdapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        personas.add(new Persona("Alejandro0","Laborde"));
        personas.add(new Persona("daniel","Laborde1"));
        personas.add(new Persona("pamela","Laborde2"));
        personas.add(new Persona("daniel alejandro","Laborde3"));
        personas.add(new Persona("pepe argento","Laborde4"));
        personas.add(new Persona("gustavo","Laborde"));
        personas.add(new Persona("Alejandro6","Laborde1"));
        personas.add(new Persona("Alejandro7","Laborde2"));
        personas.add(new Persona("Alejandro8","Laborde3"));
        personas.add(new Persona("Alejandro9","Laborde4"));
        personas.add(new Persona("Alejandro10","Laborde"));
        personas.add(new Persona("Alejandro11","Laborde1"));
        personas.add(new Persona("Alejandro12","Laborde2"));
        personas.add(new Persona("Alejandro13","Laborde3"));
        personas.add(new Persona("Alejandro14","Laborde4"));
        personas.add(new Persona("Alejandro15","Laborde"));
        personas.add(new Persona("Alejandro16","Laborde1"));
        personas.add(new Persona("Alejandro17","Laborde2"));
        personas.add(new Persona("Alejandro18","Laborde3"));
        personas.add(new Persona("Alejandro19","Laborde4"));

        this.personaAdapter= new PersonaAdapter(personas,this);
        RecyclerView rb = findViewById(R.id.recicler);
        rb.setAdapter(personaAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rb.setLayoutManager(linearLayoutManager);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Nombre Pagina");
        ab.setDisplayHomeAsUpEnabled(true);


        /*Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);*/
    }

    public void llamarPersona( int position ){
        Log.d("entro","entro");
        Persona p = this.personas.get(position);
        Log.d("persona",p.getApellido() + " " + p.getNombre());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.opcionBuscar);
        SearchView sv =(SearchView) menuItem.getActionView();
        sv.setOnQueryTextListener(this);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.d("asd","se clickeo");
        Log.d("asd",item.toString());

        //Para agarrar el id del backandroid

        if( item.getItemId()== R.id.opcion3 ){
           DialogGenerico dialog = new DialogGenerico();
           dialog.show(getSupportFragmentManager(),"alert");
        }
        if( item.getItemId()== android.R.id.home ){
            super.finish();
        }
        if( item.getItemId()== R.id.add){
            Intent i = new Intent(this,AltaPersonaActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {

        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        List<Persona> personasFilter = new ArrayList<>();
        Log.d("dato",newText);

        for (Persona person : this.personas) {
           /* if(person.getNombre().toLowerCase().contains(newText.toLowerCase())){
                personasFilter.add(person);
            }*/
            if(person.getNombre().toLowerCase().startsWith(newText.toLowerCase())){
                personasFilter.add(person);
            }
        }
        this.personaAdapter.setPersonas(personasFilter);
        this.personaAdapter.notifyDataSetChanged();

        return false;
    }
}