package logging;

import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class ListaPromedio {

    private static final Logger logger = Logger.getLogger(ListaPromedio.class);

    private List<Persona> personas = new ArrayList<>();

    public ListaPromedio(List<Persona> personas){
        this.personas=personas;
    }

    public int promedioDeEdades (){
        int edad =0;
        for (Persona persona : personas) {
            edad = persona.getEdad()+edad;
        }
        int promedio = edad / personas.size();
        logger.info("El promedio de edad es: "+ promedio);
        return promedio;
    }

    public Persona personaConMasEdad(){
        Persona personaGrande= personas.get(0);
        for (Persona persona : personas){
            if (personaGrande.getEdad()>persona.getEdad()){
                personaGrande = persona;
            } else {
                personaGrande = personaGrande;
            }
        }
        logger.info("La persona mayor es: "+ personaGrande);
        return personaGrande;
    }

    public Persona personaConMenosEdad() {
        Persona personaMenor = personas.get(0);
        for (Persona persona : personas) {
            if (personaMenor.getEdad() < persona.getEdad()) {
                personaMenor = persona;
            } else {
                personaMenor = personaMenor;
            }
        }
        logger.info("La persona menor es: " + personaMenor);
        return personaMenor;
    }
}
