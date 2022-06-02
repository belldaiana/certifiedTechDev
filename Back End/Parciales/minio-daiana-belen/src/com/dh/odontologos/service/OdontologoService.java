package com.dh.odontologos.service;

import com.dh.odontologos.dao.imp.IDao;
import com.dh.odontologos.model.Odontologo;

import java.util.List;

public class OdontologoService {

    private IDao<Odontologo> odontologoIdao;

    public OdontologoService(IDao<Odontologo> odontologoIdao) {
        this.odontologoIdao = odontologoIdao;
    }

    public Odontologo guardar(Odontologo odontologo){
        return this.odontologoIdao.registrar(odontologo);
    }

    public Odontologo buscar(Long id){
        return this.odontologoIdao.buscar(id);
    }

    public List<Odontologo> buscarTodos(){
        return this.odontologoIdao.buscarTodos();
    }


}
