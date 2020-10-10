package com.example.reciclerview;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaViewHolder> {

    private  List<Persona> personas;
    private  MainActivity mainActivity;

    public PersonaAdapter(List<Persona> personas, MainActivity activity){
        this.personas = personas;
        this.mainActivity = activity;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    @NonNull
    @Override
    public PersonaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        PersonaViewHolder personaViewHolder = new PersonaViewHolder(item, this.mainActivity);
        return personaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonaViewHolder holder, int position) {

        holder.posicion = position;
        holder.nombreView.setText(personas.get(position).getNombre());
        holder.apellidoView.setText(personas.get(position).getApellido());

    }

    @Override
    public int getItemCount() {
        return this.personas.size();
    }
}
