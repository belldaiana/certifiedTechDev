package com.grupo10.service.impl;

import com.grupo10.model.Menu;
import com.grupo10.service.Proceso;

public class ProcesoMenuAdulto extends Proceso {

    @Override
    public String armado(){
        return "Hamburguesa, gaseosa y papas fritas";
    }

    @Override
    public double calcularPrecio(Menu menu) {
        return menu.getPrecioBase();
    }

}
