package nausech;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("-------------------");
            System.out.println("Message Application");
            System.out.println("-------------------");
            System.out.println("1. Create message");
            System.out.println("2. List messages");
            System.out.println("3. Update message");
            System.out.println("4. Delete message");
            System.out.println("5. Exit");
            //read user option
            option=sc.nextInt();

            switch (option){
                case 1:
                    MessageServices.createMessage();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while(option != 5);

    }
}