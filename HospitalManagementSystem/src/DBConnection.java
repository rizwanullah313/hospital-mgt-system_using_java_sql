/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIZWAN ULLAH
 */
import java.sql.*;
public class DBConnection {
        public static void main(String [] args){
        String url1 = "jdbc:oracle:thin:@localhost:1521:orcl";        
        Connection con=null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded");
            con = DriverManager.getConnection(url1,"system","LabAdmin786");
            System.out.println("Connection established");
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Connection Not Established");
        }
    }
}
