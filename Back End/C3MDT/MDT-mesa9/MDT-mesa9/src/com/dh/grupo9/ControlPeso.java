package com.dh.grupo9;

public class ControlPeso extends AnalistaDeCalidad {

    @Override
    public void validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300){
            System.out.println("El peso está bien, siguiente control.");
            getSiguienteControl().validarCalidadDelProducto(articulo);

        } else if (getSiguienteControl() != null) {
            System.out.println("El peso está mal, rechazado.");
        }
    }
}
