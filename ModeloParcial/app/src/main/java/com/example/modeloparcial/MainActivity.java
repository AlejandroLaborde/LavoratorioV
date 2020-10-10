package com.example.modeloparcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<Producto> products = new ArrayList<>();
    private ProductoAdapter productoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        products.add(new Producto("Producto 1", 10 , 12.50));
        products.add(new Producto("Producto 2", 20 , 15.0));
        products.add(new Producto("Producto 3", 30 , 16.50));

        this.productoAdapter= new ProductoAdapter(products,this);
        RecyclerView rb = findViewById(R.id.reciclerView);
        rb.setAdapter(this.productoAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rb.setLayoutManager(linearLayoutManager);
    }


    public void controlStock(String boton, Integer id){

        switch (boton){
            case "+":
                ProductoControler.sumarUno(products , id);
                this.actualizaAdapter(id);
                break;
            case "-":
                ProductoControler.restarUno(products,id);
                this.actualizaAdapter(id);
                break;
            case "E":
                DialogGeneric dg = new DialogGeneric(products,id,this);
                dg.show(getSupportFragmentManager(),"asd");
                this.actualizaAdapter(id);
                break;
        }
        Log.d("asd","Llega Primero");

        //this.productoAdapter.notifyDataSetChanged();
    }


    public void actualizaAdapter( Integer id){
        this.productoAdapter.notifyItemChanged(id);
    }
}