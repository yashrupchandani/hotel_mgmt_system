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
import java.sql.*;
import javax.swing.JOptionPane;
public class tables {
    public static void main(String[] args)
    {
        Connection con=null;
        Statement st=null;
        try
        {
              
            con=ConnectionProvider.getCon();
            if(con!=null)
            {
                System.out.println("con not null");
            }
            else
            {
                System.out.println("con null");
            }
            
            
            st=con.createStatement();
          st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(200),securityQuestion varchar(500),ans varchar(200),address varchar(300),status varchar(20))");
          st.executeUpdate("create table room(roomNo varchar(10),roomType varchar(200),bed varchar(200),price int,status varchar(20))");
          st.executeUpdate("create table customer(id int,name varchar(200),mobileNo varchar(12),nationality varchar(20),gender varchar(200),email varchar(200),idProof varchar(200),address varchar(500),checkIn varchar(50),roomNo varchar(10),bed varchar(10),roomType varchar(10),pricePerDay int(20),numberOfDaysStay int(10),totalAmount varchar(200),checkout varchar(50))");
          JOptionPane.showMessageDialog(null, "table created succesfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                   con.close();
                   st.close();
            }
            catch(Exception e)
            {

            }
        }
        
    }
    
}
