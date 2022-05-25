package com.company;

import java.util.Objects;

public abstract class Embarcacion {

    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioDeFabricacion;
    private Double eslora;

    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioDeFabricacion = anioDeFabricacion;
        this.eslora = eslora;
    }

    public Double calcularValorAlquiler(){

        if(anioDeFabricacion > 2020){
            return precioBase + valorAdicional;
        }
        return precioBase;
    }

    public Double getPrecioBase() {
        return precioBase;
    }


}
