/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbc.karate.club;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhirham
 */
public class sqlcon {
    static Connection conn=null;
    public static Connection connecrDB() throws SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String conurl = "jdbc:sqlserver://localhost:1433;databasename=project112;user=admin;password=password";
            conn = DriverManager.getConnection(conurl);
            System.out.println("youre connected");
            return conn;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
