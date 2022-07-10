package com.example.proyectobackend.service;

import com.example.proyectobackend.exceptions.BadRequestException;
import com.example.proyectobackend.exceptions.ResourceNotFoundException;
import com.example.proyectobackend.model.Odontologo;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
class OdontologoServiceTest {

    @Autowired
    private OdontologoService odontologoService;

    public void cargarDataSet() {
        this.odontologoService.registrarOdontologo(new Odontologo("Daiana", "Mino", 3455647));
    }

    @Test
    public void agregarOdontologo() {
        this.cargarDataSet();
        Odontologo odontologo = odontologoService.registrarOdontologo(new Odontologo("Roberto", "Ramirez", 3489960));
        Assert.assertTrue(odontologo.getId() != null);
    }

    @Test
    public void eliminar() throws BadRequestException, ResourceNotFoundException {
        odontologoService.eliminar(1);
        Assert.assertTrue(odontologoService.buscar(1).isEmpty());
    }

    @Test
    public void buscarTodos() {
        List<Odontologo> odontologos = odontologoService.buscarTodos();
        Assert.assertTrue(!odontologos.isEmpty());
        Assert.assertTrue(odontologos.size() == 2);
        System.out.println(odontologos);
    }
}