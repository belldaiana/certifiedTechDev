package com.dh.grupo9;

public class ControlLote extends AnalistaDeCalidad {

    @Override
    public void validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getLote() >= 1000 && articulo.getLote() <= 2000){
            System.out.println("El lote está correcto, siguiente control");
            getSiguienteControl().validarCalidadDelProducto(articulo);

        } else if (getSiguienteControl() != null){
            System.out.println("El lote está mal, rechazado.");
        }
    }
}
