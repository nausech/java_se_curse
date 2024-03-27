package nausech;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public static void listMessagesDB(){
        try{
            Connection connection = getConnection();
            PreparedStatement ps = null;
            ResultSet responseDB = null;

            String query = "SELECT * FROM messages";
            ps = connection.prepareStatement(query);
            responseDB = ps.executeQuery();
            while (responseDB.next()){
                System.out.println("ID: "+responseDB.getInt("id_message"));
                System.out.println("MESSAGE: "+responseDB.getString("message"));
                System.out.println("AUTHOR: "+responseDB.getString("author_message"));
                System.out.println("DATE: "+responseDB.getString("date_message"));
                System.out.println("------------------------------");
            }

        }catch (SQLException error){
            System.out.println("Error connection: "+error);
        }
    }

    public static void deleteMessageDB(int id_message){
        try{
            Connection connection = getConnection();
            PreparedStatement ps = null;
            ResultSet responseDB = null;

            String query = "DELETE FROM messages WHERE id_message = ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, id_message);
            ps.executeUpdate();
            System.out.println("Message deleted successful!");

        }catch (SQLException error){
            System.out.println("Error connection: "+error);
        }

    }
    public static void updateMessageDB(Messages message){
        try{
            Connection connection = getConnection();
            PreparedStatement ps = null;

            String query = "UPDATE messages SET message = ? WHERE id_message = ?";
            ps = connection.prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setInt(2, message.getId_message());
            ps.executeUpdate();
            System.out.println("Message updated!");

        }catch (SQLException error){
            System.out.println("Error connection: "+error);
        }
    }
}
