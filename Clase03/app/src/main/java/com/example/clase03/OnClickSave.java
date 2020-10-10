package com.example.clase03;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.EventListener;

public class OnClickSave implements View.OnClickListener {

    EditText nombre;
    EditText apellido;
    EditText dni;
    RadioGroup sexo;

    public OnClickSave ( EditText nombre, EditText apellido, EditText dni, RadioGroup sexo ){

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sexo = sexo;
    }

    @Override
    public void onClick(View v) {

        Character sex = 'M';
        switch (this.sexo.getId()){
            case R.id.hombre:{
                sex = 'H';
                break;
            }
        }

        Persona persona = new Persona(nombre.getText().toString(),apellido.getText().toString(),dni.getText().toString(),sex);

        Log.e("asd",persona.toString());

    }
}
