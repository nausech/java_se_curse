package nausech;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessagesDAO {

    public static  Connection getConnection() throws SQLException{
        Config dbConnection = Config.getInstance();
        return dbConnection.getConnection();
    }
    public static void createMessageDB(Messages message)  {
        try{
            Connection connection = getConnection();
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO messages (message, author_message) VALUES (?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.message);
                ps.setString(2, message.author_message);
                ps.executeUpdate();
                System.out.println("Message created!");
            }catch (Exception error){
                System.out.println("Error: "+error);
            }
        }catch (SQLException error){
            System.out.println("Error connection: "+error);
        }
    }

    public static void readMessageDB(){}

    public static void deleteMessageDB(int id_message){

    }
    public static void updateMessageDB(Messages message){}
}
