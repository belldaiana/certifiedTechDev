package com.example.proyectobackend.service;

import com.example.proyectobackend.model.Domicilio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDomicilioService extends CRUDService<Domicilio>{
    List<Domicilio> buscar(String calle);

    List<Domicilio> buscar(String calle, Integer numero);

    Domicilio buscar(String calle, Integer numero, String localidad, String provincia) throws Exception;
}
