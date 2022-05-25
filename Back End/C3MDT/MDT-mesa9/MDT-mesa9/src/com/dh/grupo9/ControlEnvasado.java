package com.dh.grupo9;

public class ControlEnvasado extends AnalistaDeCalidad {
    public void validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getEnvasado().equals("Sano") || articulo.getEnvasado().equals("Casi sano")){
            System.out.println("El envasado está bien, aceptado.");
        } else if (getSiguienteControl() == null){
            System.out.println("El envasado está mal, fue rechazado.");
        }
    }
}
