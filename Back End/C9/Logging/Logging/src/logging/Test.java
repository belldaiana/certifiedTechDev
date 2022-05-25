package logging;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    private final static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {

        File log4jfile = new File("./src/logging/config/log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());
        ListaPromedio listaPromedio = null;
        Persona persona0 = new Persona("Agustín", "Ramos", 28);
        Persona persona1 = new Persona("Daiana", "Miño", 26);

        listaPromedio = new ListaPromedio(Arrays.asList(persona0, persona1));

        listaPromedio.promedioDeEdades();
        listaPromedio.personaConMasEdad();
        listaPromedio.personaConMenosEdad();

    }
}
