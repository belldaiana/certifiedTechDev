package com.example.springBoot.service;

import com.example.springBoot.model.Odontologo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OdontologoService {

    private List<Odontologo> odontologoList = new ArrayList<>();

    public OdontologoService(){
        odontologoList.add(new Odontologo(1L, "Juan", "Perez", "PJ1"));
        odontologoList.add(new Odontologo(2L, "Roberto", "Martinez", "MR2"));
    }

    public List<Odontologo> getAll(){
        return odontologoList;
    }

    public Odontologo getOdontologoById(long id) {
        return odontologoList.stream().filter(x -> x.getId() == (id)).findFirst().orElse(null);
    }


}
