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
    public static void getMessages(){}
    public static void deleteMessage(){}
    public static void updateMessage(){}
}
