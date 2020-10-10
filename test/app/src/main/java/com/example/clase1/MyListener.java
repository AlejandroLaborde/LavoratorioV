package com.example.clase1;

import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyListener implements View.OnClickListener {

    EditText ref;
    TextView palabra;
    Activity home;
    public MyListener(EditText ref , TextView palabra , Activity home){
        this.ref = ref;
        this.palabra = palabra;
        this.home = home;
    }

    @Override
    public void onClick(View v) {
        Log.d("saludo","hola "+ this.ref.getText());

        if( this.ref.getText().length() == 0 ){
            AlertDialog.Builder builder = new AlertDialog.Builder(this.home);
            builder.setTitle("Vacio");
            builder.setMessage("Debe ingresar un texto");
            builder.setPositiveButton("Aceptar", null);

            AlertDialog dialog = builder.create();
            dialog.show();
        }else{
            this.palabra.setText(this.ref.getText());
            this.ref.setText("");
        }


    }
}
