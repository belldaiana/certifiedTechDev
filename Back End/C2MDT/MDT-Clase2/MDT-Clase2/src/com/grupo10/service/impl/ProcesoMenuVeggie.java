package com.grupo10.service.impl;

import com.grupo10.model.Menu;
import com.grupo10.service.Proceso;

public class ProcesoMenuVeggie extends Proceso {
    private double salsas = 2;
    private double recargoEspecia = 0.01;

    @Override
    public String armado() {
        return "Hamburguesa NotBurger, pan de acelga, agregar especias y agregar salsas";
    }

    @Override
    public double calcularPrecio(Menu menu){
        double recargos = (menu.getPrecioBase() * 0.01) + salsas;
        return menu.getPrecioBase() + recargos;
    }
}
