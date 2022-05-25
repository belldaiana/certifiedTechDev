package com.dh.grupo9;

public class Main {
    public static void main(String[] args) {

        CompruebaCalidad compruebaCalidad = new CompruebaCalidad();

        System.out.println("Comprobando articulo n1001");
        Articulo celular = new Articulo("Celular", 120, 1254, "Sano");
        compruebaCalidad.comprobar(celular);

        System.out.println("Comprobando articulo n90");
        Articulo cocina = new Articulo("Cocina", 1900, 1255, "Casi sano");
        compruebaCalidad.comprobar(cocina);

    }
}
