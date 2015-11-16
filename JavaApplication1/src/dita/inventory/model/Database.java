
package dita.inventory.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
