/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bach.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class balancecheckingdao {
    Connection con = null; 
    PreparedStatement ps = null;
    ResultSet rs = null;
        double money = 0 ;
         public double checkbalance(String username)throws ClassNotFoundException
        {
         try {
              Class.forName("com.mysql.jdbc.Driver");
            String query = "select * from account where username =? ";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newservlet", "root", "221002");
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while(rs.next())
            {
                 money = rs.getDouble(2);    
            }
        } catch (Exception e) {
            
        }
        return money;
    }
}
