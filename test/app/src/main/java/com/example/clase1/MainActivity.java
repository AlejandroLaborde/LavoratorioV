package com.example.clase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView palabra = super.findViewById(R.id.tv);
        palabra.setText("hola desde java");

        EditText txt1 = super.findViewById(R.id.txt1);

        Editable escrito = txt1.getText();
        Log.d("txt",escrito.toString());
        Button boton1 =  super.findViewById(R.id.botton1);


        MyListener saludo = new MyListener(txt1, palabra, this);

        boton1.setOnClickListener( saludo );
    }




}
