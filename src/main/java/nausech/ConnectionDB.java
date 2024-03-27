package nausech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public Connection get_connection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");
            if(connection != null){
                System.out.println("Successful connection");
            }
        } catch (SQLException error) {
            System.out.println("Error connection "+error);
        }
        return connection;
    }
}
