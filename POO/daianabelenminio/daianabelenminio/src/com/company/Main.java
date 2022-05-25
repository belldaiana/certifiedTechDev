package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona persona = new Persona("Daiana", "Miño", "42.459.048", 25);

        TituloTerciario tituloTerciario = new TituloTerciario(persona, 55, "25/05/1999", "25/05/2005", true, true, true, true);
        System.out.println(tituloTerciario.validoNivelNacional());
    }
}
