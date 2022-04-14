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
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class logindao {
    Connection con = null; 
    PreparedStatement ps = null; 
    ResultSet rs = null ; 
    public User checklogin(String username , String password)
    {
        try {
              Class.forName("com.mysql.jdbc.Driver");
            String query = "select * from khachhang1 where username =? and password = ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newservlet", "root", "221002");
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                User a = new User(rs.getString(1),rs.getString(2));
                return a ;    
            }
        } catch (Exception e) {
            
        }
        return null;
    }
}
