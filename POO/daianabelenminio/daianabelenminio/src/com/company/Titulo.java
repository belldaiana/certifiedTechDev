package com.company;

import java.sql.SQLOutput;

public abstract class Titulo {
    private Persona persona;
    private Integer cantidadDeMateriasDeCarrera;
    private String fechaInicioDeEstudios;
    private String fechaFinalizacionDeCarrera;
    private Boolean selladoPorMinisterio;
    private Boolean selladoPorInstituto;

    public Titulo(Persona persona, Integer cantidadDeMateriasDeCarrera, String fechaInicioDeEstudios, String fechaFinalizacionDeCarrera, Boolean selladoPorMinisterio, Boolean selladoPorInstituto) {
        this.persona = persona;
        this.cantidadDeMateriasDeCarrera = cantidadDeMateriasDeCarrera;
        this.fechaInicioDeEstudios = fechaInicioDeEstudios;
        this.fechaFinalizacionDeCarrera = fechaFinalizacionDeCarrera;
        this.selladoPorMinisterio = selladoPorMinisterio;
        this.selladoPorInstituto = selladoPorInstituto;
    }

    public Boolean ejercerConTitulo() {
        if(selladoPorMinisterio == true && selladoPorInstituto == true){
            System.out.println("Puede ejercer");
            return true;
        }
        System.out.println("No puede ejercer");
        return false;
    }
}
