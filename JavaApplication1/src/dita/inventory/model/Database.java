package dita.inventory.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Database
{

    private static Connection conn;

    public static void startConnection()
    {
        String host = "jdbc:derby://localhost:1527/inventory";
        String username = "root";
        String password = "root";

        try
        {
            conn = DriverManager.getConnection(host, username, password);
            System.out.println("successfuly Connected to database");
        }
        catch(SQLException ex)
        {
            System.out.println("Unable to start connection to the database");
        }

    }

    public static void closeConnection()
    {
        try
        {
            conn.close();
            System.out.println("successfully closed");
        }
        catch(SQLException ex)
        {
            System.err.println("Unable to close connection");
        }

    }

    public static void createTables()
    {
        String query;
        try
        {
            Statement statement = conn.createStatement();
            query = "Create table Items(name varchar(255)," +
                    "quantity integer," +
                    "currentQuantity integer," +
                    "primary key(name))";
            
            statement.executeUpdate(query);
            
            System.out.println("Tables created successfully");
        }
        catch(SQLException ex)
        {
            // Ignore exception if its a duplicate table
            if(!ex.getSQLState().equals("X0Y32"))
                System.err.println("Unable to create tables: "+ex.getMessage());
        }
    }

}
