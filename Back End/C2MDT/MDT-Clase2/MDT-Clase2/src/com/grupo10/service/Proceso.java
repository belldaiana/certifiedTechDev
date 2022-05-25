package com.grupo10.service;

import com.grupo10.model.Menu;

public abstract class Proceso {
    public double solicitar(Menu menu) {
        System.out.println(armado());
        return calcularPrecio(menu);
    }
    public abstract String armado();
    public abstract double calcularPrecio(Menu menu);

}
