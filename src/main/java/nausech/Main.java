package nausech;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConnectionDB connection = new ConnectionDB();
        try(Connection connect  = connection.get_connection()){

        }catch (Exception error){
            System.out.println(error);
        }
    }
}