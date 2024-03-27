package nausech;

import java.sql.SQLException;
import java.util.Scanner;

public class MessageServices {
    public static void createMessage() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the message");
        String message = sc.nextLine();
        System.out.println("Your name:");
        String authorMessage = sc.nextLine();

        Messages record = new Messages();
        record.setMessage(message);
        record.setAuthor_message(authorMessage);
        MessagesDAO.createMessageDB(record);

    }
    public static void listMessages(){
        MessagesDAO.listMessagesDB();
    }
    public static void deleteMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write id message");
        int idMessage = sc.nextInt();
        MessagesDAO.deleteMessageDB(idMessage);
    }
    public static void updateMessage(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the id message");
        int idMessage = sc.nextInt();
        System.out.println("Write the new message:");
        String newMessage = sc.next();

        Messages record = new Messages();
        record.setMessage(newMessage);
        record.setId_message(idMessage);
        MessagesDAO.updateMessageDB(record);
    }
}
