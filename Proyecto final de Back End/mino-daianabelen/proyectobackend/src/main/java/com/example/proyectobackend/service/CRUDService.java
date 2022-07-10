package com.example.proyectobackend.service;

import com.example.proyectobackend.exceptions.BadRequestException;
import com.example.proyectobackend.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CRUDService<T> {
    T buscarPorId(Integer id) throws BadRequestException, ResourceNotFoundException;

    T crear(T t) throws BadRequestException, ResourceNotFoundException;

    T actualizar(T t) throws BadRequestException, ResourceNotFoundException;

    void eliminar(Integer id) throws BadRequestException, ResourceNotFoundException;

    List<T> consultarTodos();
}
