package com.dh.odontologos.dao.imp;

import com.dh.odontologos.model.Odontologo;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class OdontologoDaoH2 implements IDao<Odontologo>{
    private final static Logger logger = Logger.getLogger(String.valueOf(OdontologoDaoH2.class));

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/test;INIT=RUNSCRIPT FROM 'create.sql'";
    private final static String DB_USER ="";
    private final static String DB_PASSWORD = "";


    @Override
    public Odontologo registrar(Odontologo odontologo) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("INSERT INTO odontologos(matricula, nombre, apellido) VALUES(?,?,?)",Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, odontologo.getMatricula());
            preparedStatement.setString(2, odontologo.getNombre());
            preparedStatement.setString(3, odontologo.getApellido());

            preparedStatement.executeUpdate();

            ResultSet keys = preparedStatement.getGeneratedKeys();
            if(keys.next())
                odontologo.setId(keys.getLong(1));

            preparedStatement.close();

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
            logger.error("error: ", throwables);
        }
        logger.debug("ODONTOLOGO GUARDADO: " + "ID: " + odontologo.getId() + " MATRICULA: " + odontologo.getMatricula() +
                " NOMBRE: " + odontologo.getNombre() + " APELLIDO: " + odontologo.getApellido());
        return odontologo;
    }

    @Override
    public Odontologo buscar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Odontologo odontologo = null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            preparedStatement = connection.prepareStatement("SELECT id,matricula,nombre,apellido FROM odontologos where id = ?");
            preparedStatement.setLong(1, id);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                Long idOdontologo = result.getLong("id");
                String matricula = result.getString("matricula");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");

                odontologo = new Odontologo(idOdontologo,matricula,nombre,apellido);
            }

            preparedStatement.close();
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
            logger.error("error: ", throwables);
        }
        logger.debug("ODONTOLOGO ENCONTRADO: "+"ID: " + odontologo.getId() + " MATRICULA: " + odontologo.getMatricula() +
                " NOMBRE: " + odontologo.getNombre() + " APELLIDO: " + odontologo.getApellido());
        return odontologo;
    }

    @Override
    public List<Odontologo> buscarTodos() {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Odontologo> odontologos = new ArrayList<>();

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            preparedStatement = connection.prepareStatement("SELECT * FROM odontologos");

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()){
                Long idOdontologo = result.getLong("id");
                String matricula = result.getString("matricula");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                Odontologo odontologo = new Odontologo(idOdontologo, matricula, nombre, apellido);
                logger.debug("ID: " + result.getLong(1) + " MATRICULA: " + result.getString(2) +
                        " NOMBRE: " + result.getString(3) + " APELLIDO: " + result.getString(4));

                odontologos.add(odontologo);
            }
            preparedStatement.close();
        }catch (SQLException | ClassNotFoundException throwables){
            throwables.printStackTrace();
            logger.error("error: ", throwables);
        }
        return odontologos;
    }
}
