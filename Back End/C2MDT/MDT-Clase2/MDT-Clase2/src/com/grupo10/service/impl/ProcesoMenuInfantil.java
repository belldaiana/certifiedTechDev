package com.grupo10.service.impl;

import com.grupo10.model.Menu;
import com.grupo10.service.Proceso;

public class ProcesoMenuInfantil extends Proceso {
    private double recargoJuguete = 3;

    @Override
    public String armado(){
        return "Nuggets, papas fritas y juguete";
    }

    @Override
    public double calcularPrecio(Menu menu) {
        return menu.getPrecioBase() + recargoJuguete;
    }
}
