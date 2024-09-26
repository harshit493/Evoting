/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicclasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HARSHIT
 */
public class EvotingDB {
    public Connection con;
    public Statement stm;
    public ResultSet rs;
    public PreparedStatement pst;
    
    public EvotingDB(){
        try {   
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/evoting","root","");
            stm = con.createStatement();                         
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
