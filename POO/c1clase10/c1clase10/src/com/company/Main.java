package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Socio socio = new Socio("1","Tincho",2000.0,"Rugby");
        Socio socio2 = new Socio("1","Martin",2000.0,"Rugby");


        SocioHabilitado socioHabilitado = new SocioHabilitado("2","Escarlata",3000.0,"Remo",550.0);

//        System.out.println(socio.calcularCostoMensual());
//
//        socioHabilitado.setEstaHabilitado(true);
//
//        System.out.println(socioHabilitado.calcularCostoMensual());

        System.out.println(socio.equals(socio2));



    }
}
