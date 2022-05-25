package com.company;

public class Persona {

    private String nombre;
    private Perro perro;

    public Persona(String nombre, Perro perro) {
        this.nombre = nombre;
        this.perro = perro;
    }

    public void saludarConMiPerro(){
        System.out.println(" hola mi nombre es " + nombre + " y el apodo de mi perro es " + perro.getApodo());
    }

}
