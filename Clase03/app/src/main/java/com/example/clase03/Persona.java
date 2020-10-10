package com.example.clase03;

import android.text.Editable;

import androidx.annotation.NonNull;

public class Persona {

    private String name;
    private String lastName;
    private String document;
    private Character sexo;

    public  Persona ( String name, String lastName , String document, Character sexo){
        super();
        this.document = document;
        this.name = name;
        this.lastName = lastName;
        this.sexo = sexo;
    }



    @Override
    public String toString() {
        return this.name + " " + this.lastName+ " - " + this.document+ " - "+ this.sexo;
    }
}
