package com.example.proyectobackend.service;

import com.example.proyectobackend.model.Turno;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface ITurnoService extends CRUDService<Turno>{
    List<Turno> buscar(String nombrePaciente, String apellidoPaciente, String nombreOdontologo, String apellidoOdontologo);

    List<Turno> buscar(String nombreOdontologo, String apellidoOdontologo);

    List<Turno> buscar(Integer matricula, Integer dni);

    List<Turno> consultarProximosTurnos(LocalDateTime desde, Integer cantidadDias);
}
