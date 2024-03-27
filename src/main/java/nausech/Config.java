package nausech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    private static Config instance;

    public static Config getInstance(){
        if(instance == null) instance = new Config();
        return instance;
    }

    public Connection getConnection() throws SQLException {
        Connection connection = null;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/messages_app", "root", "");
        return connection;
    }
}
