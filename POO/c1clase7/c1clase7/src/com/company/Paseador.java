package com.company;

public class Paseador {

    private String nombre;
    private Double precioPorPaseo;

    public Paseador(String nombre, Double precioPorPaseo) {
        this.nombre = nombre;
        this.precioPorPaseo = precioPorPaseo;
    }

    public void pasearUnPerro(Perro perro){
        System.out.println("estoy paseando a " + perro.getApodo() + " te sale " + precioPorPaseo);
    }

}
