package com.dh.grupo9;

public abstract class AnalistaDeCalidad {
    private AnalistaDeCalidad siguienteControl;


    public AnalistaDeCalidad getSiguienteControl() {
        return siguienteControl;
    }

    public void setSiguienteControl(AnalistaDeCalidad siguienteControl) {
        this.siguienteControl = siguienteControl;
    }

    public abstract void validarCalidadDelProducto(Articulo articulo);
}
