/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bach.dao;

import com.bach.model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class depositdao {
    Connection con = null; 
    PreparedStatement ps = null; 
     Connection con2 = null; 
    PreparedStatement ps2 = null; 
    ResultSet rs = null;
    int result = 0 ; 

    public int checkdeposit(String username , double usdt)throws ClassNotFoundException
    {   
        try {
              Class.forName("com.mysql.jdbc.Driver");
            String query = "update account set USDT = ? where username = ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newservlet", "root", "221002");
            ps = con.prepareStatement(query);
            ps.setDouble(1, usdt+checkselect(username));
            ps.setString(2, username);
            result = ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return result;
    }
    
       public double checkselect(String username)throws ClassNotFoundException
    {
        double money = 0 ;
         try {
              Class.forName("com.mysql.jdbc.Driver");
            String query = "select * from account where username =? ";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newservlet", "root", "221002");
            ps2 = con.prepareStatement(query);
            ps2.setString(1, username);
            rs = ps2.executeQuery();
            while(rs.next())
            {
                 money = rs.getDouble(2);
                return money ;    
            }
        } catch (Exception e) {
            
        }
        return money;
    }
}
