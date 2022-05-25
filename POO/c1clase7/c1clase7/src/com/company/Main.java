package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Perro perro = new Perro("Firulais");
        Perro perro1 = new Perro("Toto");

        Persona persona = new Persona("Angela",perro);

        Paseador paseador = new Paseador("Octavio",500.0);

        persona.saludarConMiPerro();

        paseador.pasearUnPerro(perro);
        paseador.pasearUnPerro(perro1);


    }
}
