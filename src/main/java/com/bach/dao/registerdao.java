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
public class registerdao {
    Connection con = null;  
    PreparedStatement ps = null; 
    int result = 0; 
       public int check(String username) {
        try {
              Class.forName("com.mysql.jdbc.Driver");
            String query = "insert into account values(? , ?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newservlet", "root", "221002");
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setDouble(2, 0);
            
            result = ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return result;
    }
    public int checkregister(User user) throws ClassNotFoundException
    {
        
        try {
              Class.forName("com.mysql.jdbc.Driver");
            String query = "insert into khachhang1 values(? , ?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newservlet", "root", "221002");
            ps = con.prepareStatement(query);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPass());
            
            result = ps.executeUpdate();
            check(user.getUsername());
        } catch (Exception e) {
            
        }
        return result;
    }
}
