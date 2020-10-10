package com.example.modeloparcial;

import java.util.List;

public class ProductoControler {

    public static void  sumarUno(List<Producto> p, Integer i){
        Producto prod = p.get(i);
        prod.setCount(prod.getCount()+1);
    }

    public static void  restarUno(List<Producto> p, Integer i){
        Producto prod = p.get(i);
        prod.setCount(prod.getCount()-1);
    }
}
