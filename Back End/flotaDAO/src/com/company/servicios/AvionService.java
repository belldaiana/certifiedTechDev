package com.company.servicios;

import com.company.dao.IDao;
import com.company.entidades.Avion;

import java.util.List;

public class AvionService {

    private IDao<Avion> avionIDao;

    public IDao<Avion> getAvionIDao() {
        return avionIDao;
    }

    public void setAvionIDao(IDao<Avion> avionIDao) {
        this.avionIDao = avionIDao;
    }

    public Avion registrarAvion(Avion a){
        return avionIDao.registrar(a);
    }

    public void eliminarAvion(Long id){
        avionIDao.eliminar(id);
    }

    public Avion buscarAvion(Long id){
        return avionIDao.buscar(id);
    }

    public List<Avion> buscarTodos(){
        return avionIDao.buscarTodos();
    }
}
