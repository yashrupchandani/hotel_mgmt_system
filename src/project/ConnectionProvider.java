/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Piyush
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","piyush@25");
             return con;
             
        }
        catch(Exception e)
        {
            System.out.println("In catch ");
            return null;
        }
        
            
        
    }
}
