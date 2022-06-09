package com.example.springBoot.service;

import com.example.springBoot.model.Paciente;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {

    private OdontologoService odontologoService = new OdontologoService();

    private List<Paciente> pacientes = new ArrayList<>();

    public PacienteService(){
        pacientes.add(new Paciente(1L, "Rodriguez","Mariano",
                "mail@mail.com", "38545656", LocalDate.of(2021,8,20), odontologoService.getOdontologoById(1L)));
        pacientes.add(new Paciente(2L, "Miño","Daiana",
                "daiana@mail.com", "123456", LocalDate.of(2021,6,21), odontologoService.getOdontologoById(2L)));
    }

    public List<Paciente> getAll(){
        return pacientes;
    }

    public Paciente getPacientByEmail(String email){
        for(int i = 0; i<pacientes.size();i++){
            if(pacientes.get(i).getMail().equals(email)){
                return pacientes.get(i);
            }
        }
        return null;
    }

    public void savePaciente(Paciente paciente){
        pacientes.add(paciente);
    }


}
