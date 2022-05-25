package com.dh.grupo9;

public class CompruebaCalidad {
    AnalistaDeCalidad analista;

    public CompruebaCalidad() {
        this.analista = new ControlLote();
        AnalistaDeCalidad peso = new ControlPeso();
        AnalistaDeCalidad envasado = new ControlEnvasado();

        analista.setSiguienteControl(peso);
        peso.setSiguienteControl(envasado);
    }

    public void comprobar(Articulo  articulo)
    {
        analista.validarCalidadDelProducto(articulo);
    }
}
