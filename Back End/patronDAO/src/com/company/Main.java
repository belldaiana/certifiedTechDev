package com.company;

import com.company.dao.EstudianteDAOH2;
import com.company.entidades.Estudiante;
import com.company.servicios.EstudianteService;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.setId(1L);
        estudiante.setNombre("Belen");
        estudiante.setApellido("Mino");

        EstudianteService estudianteService = new EstudianteService();
        estudianteService.setEstudianteIDao(new EstudianteDAOH2());
        estudianteService.guardarEstudiante(estudiante);





    }
}
