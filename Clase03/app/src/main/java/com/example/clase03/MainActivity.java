package com.example.clase03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button guardar = findViewById(R.id.save);
        EditText nombre = findViewById(R.id.name);
        EditText last = findViewById(R.id.lastName);
        EditText document = findViewById(R.id.dni);
        RadioGroup sexo = findViewById(R.id.sexo);
       // RadioButton sexoSelected = findViewById(sexo.getCheckedRadioButtonId());


        //Persona persona = new Persona();
        OnClickSave clickSave = new OnClickSave( nombre, last,document,sexo);

        guardar.setOnClickListener(clickSave);

    }
}