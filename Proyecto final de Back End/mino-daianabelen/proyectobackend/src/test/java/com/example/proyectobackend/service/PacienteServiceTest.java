package com.example.proyectobackend.service;

import com.example.proyectobackend.model.Domicilio;
import com.example.proyectobackend.model.Paciente;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
class PacienteServiceTest {

    @Autowired
    private PacienteService pacienteService;

    public void cargarDataSet() {
        Domicilio domicilio = new Domicilio("Azcuenaga", "123", "Monte grande", "Buenos Aires");
        Paciente p = pacienteService.guardar(new Paciente("Agustin", "Padron", "88888888", new Date(), domicilio));
        Domicilio domicilio1 = new Domicilio("Calle Falsa", "123", "CABA", "Buenos Aires");
        Paciente p1 = pacienteService.guardar(new Paciente("Facundo", "Perez", "99999999", new Date(), domicilio1));
    }

    @Test
    public void agregarYBuscarPacienteTest() {
        this.cargarDataSet();
        Domicilio domicilio = new Domicilio("Rodriguez", "123", "Lanús", "Buenos Aires");
        Paciente p = pacienteService.guardar(new Paciente("Marta", "Robles", "44444444", new Date(), domicilio));

        Assert.assertNotNull(pacienteService.buscar(p.getId()));
    }

    @Test
    public void buscarTodos() {
        pacienteService.guardar(new Paciente("Roberta", "Martinez", "456789", new Date(), new Domicilio("Martinez","455", "Monte Grande", "Buenos Aires")));
        assertNotEquals(0, pacienteService.buscarTodos().size());
    }

    @Test
    public void eliminar() {
        pacienteService.eliminar(3);
        Assert.assertTrue(pacienteService.buscar(3).isEmpty());
    }
}