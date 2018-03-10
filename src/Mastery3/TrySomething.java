package Mastery3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TrySomething {

    public static void main(String[] args) throws ClassNotFoundException {

        // load the sqlite-JDBC driver using the current class loader
        Class.forName("org.sqlite.JDBC");
        Connection connection = null;
        try { // create a database//
            connection = DriverManager.getConnection("jdbc:sqlite:garage.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
            statement.executeUpdate("DROP TABLE IF EXISTS car");
            statement.executeUpdate("CREATE TABLE car (id INTEGER, maker STRING, model STRING, price INTEGER )");
            statement.executeUpdate("INSERT INTO car VALUES(1, 'Toyota', 'Camry', 1600000)");
            statement.executeUpdate("INSERT INTO car VALUES(2, 'Honda', 'Civic', 970000)");
            statement.executeUpdate("INSERT INTO car VALUES(3, 'Mazda', '3', 850000)");


            ResultSet rs = statement.executeQuery("SELECT * FROM car ORDER BY price ASC");

            while ( rs.next()){
                System.out.printf("ID = %d   Maker  =  %s   Model  =  %s, Price = %d \n" , rs.getInt("id"),
                rs.getString("maker"),
                rs.getString("model"),
                rs.getInt("price"))
                ;
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}


/**
 * statement.executeUpdate("INSERT INTO car VALUES(1, 'Toyota', 'Camry', 1600000)");
 * statement.executeUpdate("INSERT INTO car VALUES(2, 'Honda', 'Civic', 970000)");
 * statement.executeUpdate("INSERT INTO car VALUES(3, 'Mazda', '3', 850000)");
 */
