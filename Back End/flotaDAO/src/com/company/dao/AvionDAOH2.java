package com.company.dao;

import com.company.entidades.Avion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AvionDAOH2 implements IDao<Avion>{

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/db_aviones";
    private final static String DB_USER = "";
    private final static String DB_PASSWORD = "";

    @Override
    public Avion registrar(Avion avion) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            preparedStatement = connection.prepareStatement("INSERT INTO aviones VALUES (?,?,?,?,?)");
            preparedStatement.setLong(1, avion.getId());
            preparedStatement.setString(2, avion.getMarca());
            preparedStatement.setString(3, avion.getModelo());
            preparedStatement.setString(4, avion.getMatricula());
            preparedStatement.setString(5, avion.getFechaEntrada());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return avion;
    }

    @Override
    public Avion buscar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Avion avion = null;

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            preparedStatement = connection.prepareStatement("SELECT * FROM aviones where id=?");
            preparedStatement.setLong(1, id);

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()){
                Long idAvion = result.getLong("id");
                String marca = result.getString("marca");
                String modelo = result.getString("modelo");
                String matricula = result.getString("matricula");
                String fechaEntrada = result.getString("fechaEntrada");
                avion = new Avion();
                avion.setId(idAvion);
                avion.setMarca(marca);
                avion.setModelo(modelo);
                avion.setMatricula(matricula);
                avion.setFechaEntrada(fechaEntrada);
            }

            preparedStatement.close();

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return avion;
    }

    @Override
    public void eliminar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            preparedStatement = connection.prepareStatement("DELETE FROM aviones where id=?");
            preparedStatement.setLong(1, id);

            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List<Avion> buscarTodos() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Avion> aviones = new ArrayList();

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            preparedStatement = connection.prepareStatement("SELECT * FROM aviones");

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()){
                Long idAvion = result.getLong("id");
                String marca = result.getString("marca");
                String modelo = result.getString("modelo");
                String matricula = result.getString("matricula");
                String fechaEntrada = result.getString("fechaEntrada");
                Avion avion = new Avion();
                avion.setId(idAvion);
                avion.setMarca(marca);
                avion.setModelo(modelo);
                avion.setMatricula(matricula);
                avion.setFechaEntrada(fechaEntrada);

                aviones.add(avion);
            }

            preparedStatement.close();

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return aviones;
    }
}
