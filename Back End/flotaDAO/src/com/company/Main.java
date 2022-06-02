package com.company;

import com.company.dao.AvionDAOH2;
import com.company.entidades.Avion;
import com.company.servicios.AvionService;

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion();

        avion.setId(1L);
        avion.setMarca("Pepito");
        avion.setModelo("AC789456");
        avion.setMatricula("AA111");
        avion.setFechaEntrada("29/04/1996");

        AvionService avionService = new AvionService();
        avionService.setAvionIDao(new AvionDAOH2());
        avionService.registrarAvion(avion);

    }
}
