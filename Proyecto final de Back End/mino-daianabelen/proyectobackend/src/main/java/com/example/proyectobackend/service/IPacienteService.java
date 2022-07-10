package com.example.proyectobackend.service;

import com.example.proyectobackend.exceptions.BadRequestException;
import com.example.proyectobackend.exceptions.ResourceNotFoundException;
import com.example.proyectobackend.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPacienteService extends CRUDService<Paciente>{
    Paciente buscar(Integer dni) throws ResourceNotFoundException, BadRequestException;

    List<Paciente> buscar(String nombre);

    List<Paciente> buscar(String nombre, String apellido);
}
