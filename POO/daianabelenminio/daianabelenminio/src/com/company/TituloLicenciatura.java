package com.company;

public class TituloLicenciatura extends Titulo implements Comparable{
    private String temaTesis;
    private Boolean fechaEntregaDeTesis;
    private Integer cantidadDeTrabajosInvestigacion;

    public TituloLicenciatura(Persona persona, Integer cantidadDeMateriasDeCarrera, String fechaInicioDeEstudios, String fechaFinalizacionDeCarrera, Boolean selladoPorMinisterio, Boolean selladoPorInstituto, String temaTesis, Boolean fechaEntregaDeTesis, Integer cantidadDeTrabajosInvestigacion) {
        super(persona, cantidadDeMateriasDeCarrera, fechaInicioDeEstudios, fechaFinalizacionDeCarrera, selladoPorMinisterio, selladoPorInstituto);
        this.temaTesis = temaTesis;
        this.fechaEntregaDeTesis = fechaEntregaDeTesis;
        this.cantidadDeTrabajosInvestigacion = cantidadDeTrabajosInvestigacion;
    }

    @Override
    public int compareTo(Object object){
        TituloLicenciatura otroTituloLicenciatura = (TituloLicenciatura) object;
        if (this.cantidadDeTrabajosInvestigacion > otroTituloLicenciatura.cantidadDeTrabajosInvestigacion){
            return  1;
        }
        if (this.cantidadDeTrabajosInvestigacion < otroTituloLicenciatura.cantidadDeTrabajosInvestigacion){
            return -1;
        }
        return 0;
    }
}
