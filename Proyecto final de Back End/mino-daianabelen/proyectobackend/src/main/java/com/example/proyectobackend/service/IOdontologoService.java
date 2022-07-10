package com.example.proyectobackend.service;

import com.example.proyectobackend.exceptions.BadRequestException;
import com.example.proyectobackend.exceptions.ResourceNotFoundException;
import com.example.proyectobackend.model.Odontologo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOdontologoService extends CRUDService<Odontologo>{
    Odontologo buscar(Integer matricula) throws ResourceNotFoundException, BadRequestException;

    List<Odontologo> buscar(String nombre);

    List<Odontologo> buscar(String nombre, String apellido);
}
