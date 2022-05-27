
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Test {

    private final static Logger logger = Logger.getLogger(Test.class);

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test");

    }

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS EMPLEADO; CREATE TABLE EMPLEADO"
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOMBRE varchar(100) NOT NULL,"
            + " APELLIDO varchar(100) NOT NULL,"
            + " DNI varchar(100) NOT NULL,"
            + " EDAD INT NOT NULL"
            + " )";

    private static final String SQL_INSERT =  "INSERT INTO EMPLEADO (ID, NOMBRE, APELLIDO, DNI, EDAD) VALUES (1,'Daiana', 'Mino', '123456', 56)";
    private static final String SQL_INSERT2 =  "INSERT INTO EMPLEADO (ID, NOMBRE, APELLIDO, DNI, EDAD) VALUES (2,'Roberta', 'Gonzalez', '456789', 59)";
    private static final String SQL_INSERT3 =  "INSERT INTO EMPLEADO (ID, NOMBRE, APELLIDO, DNI, EDAD) VALUES (3,'Marta', 'Piripi', '456123', 60)";
    private static final String SQL_INSERT4 = "UPDATE EMPLEADO\n" +
            "SET ID = 4\n" +
            "WHERE NOMBRE = 'Daiana';";


    public static void main(String[] args) throws Exception{
        File log4jfile = new File("./src/logging/log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
            statement.execute(SQL_INSERT);
            statement.execute(SQL_INSERT2);
            statement.execute(SQL_INSERT3);
            statement.execute(SQL_INSERT4);

            String sql = "SELECT * FROM EMPLEADO";
            Statement sqlSmt = connection.createStatement();
            ResultSet rs = sqlSmt.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getInt(5));
            }

        }catch (Exception e) {
            logger.error("Los datos no deben ser coincidentes", e);
        } finally {
            connection.close();
        }
    }
}
