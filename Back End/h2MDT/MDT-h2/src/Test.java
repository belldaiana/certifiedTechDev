import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test");

    }

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS FIGURA; CREATE TABLE FIGURA"
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOMBRE varchar(100) NOT NULL,"
            + " COLOR varchar(100) NOT NULL"
            + " )";

    private static final String SQL_INSERT =  "INSERT INTO FIGURA (ID, NOMBRE, COLOR) VALUES (1,'Circulo','Rojo')";
    private static final String SQL_INSERT2 =  "INSERT INTO FIGURA (ID, NOMBRE, COLOR) VALUES (2,'Circulo','Verde')";
    private static final String SQL_INSERT3 =  "INSERT INTO FIGURA (ID, NOMBRE, COLOR) VALUES (3,'Cuadrado','Azul')";
    private static final String SQL_INSERT4 =  "INSERT INTO FIGURA (ID, NOMBRE, COLOR) VALUES (4,'Cuadrado','Rosa')";
    private static final String SQL_INSERT5 =  "INSERT INTO FIGURA (ID, NOMBRE, COLOR) VALUES (5,'Cuadrado','Rojo')";

    public static void main(String[] args) throws Exception {

        Connection connection = null;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            Statement statement1 = connection.createStatement();
            statement1.execute(SQL_INSERT);

            Statement statement2 = connection.createStatement();
            statement2.execute(SQL_INSERT2);

            Statement statement3 = connection.createStatement();
            statement3.execute(SQL_INSERT3);

            Statement statement4 = connection.createStatement();
            statement4.execute(SQL_INSERT4);

            Statement statement5 = connection.createStatement();
            statement5.execute(SQL_INSERT5);

            String sql = "SELECT * FROM FIGURA WHERE COLOR LIKE 'Rojo'";
            Statement sqlSmt = connection.createStatement();
            ResultSet rs = sqlSmt.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

    }
}
