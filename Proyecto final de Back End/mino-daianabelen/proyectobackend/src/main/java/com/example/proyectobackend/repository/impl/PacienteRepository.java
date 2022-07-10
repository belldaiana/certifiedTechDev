package com.example.proyectobackend.repository.impl;

import com.example.proyectobackend.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}
