package com.example.reciclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView apellidoView;
    public TextView nombreView;
    public int posicion;
    public MainActivity main;


    public PersonaViewHolder(@NonNull View itemView, MainActivity mainActivity) {
         super(itemView);
         this.main = mainActivity;
         this.apellidoView = itemView.findViewById(R.id.apellido);
         this.nombreView = itemView.findViewById(R.id.nombre);
         itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        this.main.llamarPersona(this.posicion);
    }
}
