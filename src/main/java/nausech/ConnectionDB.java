package nausech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/messages_app", "root", "");
        } catch (SQLException error) {
            System.out.println("Error connection "+error);
        }
        return connection;
    }
}
