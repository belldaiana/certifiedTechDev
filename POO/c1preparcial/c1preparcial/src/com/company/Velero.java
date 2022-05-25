package com.company;

public class Velero extends Embarcacion {

    private Integer cantidadMastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora, Integer cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public Boolean evaluarSiEsGrande(){
        return cantidadMastiles > 4;
    }
}
