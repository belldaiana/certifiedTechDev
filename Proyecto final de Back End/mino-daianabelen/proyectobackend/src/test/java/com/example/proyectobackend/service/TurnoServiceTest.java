package com.example.proyectobackend.service;

import com.example.proyectobackend.model.Domicilio;
import com.example.proyectobackend.model.Odontologo;
import com.example.proyectobackend.model.Paciente;
import com.example.proyectobackend.model.Turno;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
class TurnoServiceTest {

    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private OdontologoService odontologoService;
    @Autowired
    private TurnoService turnoService;

    public void cargarDataSet() {
        Domicilio domicilio = new Domicilio("Azcuenaga", "123", "Monte Grande", "Buenos Aires");
        Paciente p = pacienteService.guardar(new Paciente("Agustin", "Padron", "88888888", new Date(), domicilio));
        this.odontologoService.registrarOdontologo(new Odontologo("Daiana", "Mino", 3455647));
    }

    @Test
    void registrarTurno() {
        this.cargarDataSet();
        turnoService.registrarTurno(new Turno(pacienteService.buscar(1).get(),odontologoService.buscar(1).get(),new Date()));
        Assert.assertNotNull(turnoService.buscar(1));
    }

    @Test
    public void eliminar() {
        turnoService.eliminar(1);
        Assert.assertFalse(turnoService.buscar(1).isPresent());
    }

    @Test
    public void buscar() {
        Assert.assertNotNull(turnoService.buscar(1));
    }
}