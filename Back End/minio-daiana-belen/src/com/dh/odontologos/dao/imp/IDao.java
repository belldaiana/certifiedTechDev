package com.dh.odontologos.dao.imp;

import java.util.List;
import java.util.logging.Logger;

public interface IDao <T> {

    public T registrar(T t);
    public T buscar(Long id);
    public List<T> buscarTodos();
}
