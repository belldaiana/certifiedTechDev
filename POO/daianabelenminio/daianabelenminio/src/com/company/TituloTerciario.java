package com.company;

public class TituloTerciario extends Titulo{
    public static boolean validoNivelNacional;
    private Boolean validacionNacional;
    private Boolean validacionProvincial;

    public TituloTerciario(Persona persona, Integer cantidadDeMateriasDeCarrera, String fechaInicioDeEstudios, String fechaFinalizacionDeCarrera, Boolean selladoPorMinisterio, Boolean selladoPorInstituto, Boolean validacionNacional, Boolean validacionProvincial) {
        super(persona, cantidadDeMateriasDeCarrera, fechaInicioDeEstudios, fechaFinalizacionDeCarrera, selladoPorMinisterio, selladoPorInstituto);
        this.validacionNacional = validacionNacional;
        this.validacionProvincial = validacionProvincial;
    }
    public Boolean validoNivelNacional(){
        if (validacionNacional == true){
            System.out.println("Es un titulo válido a nivel Nacional");
            return true;
        }
        return false;
    }
}
