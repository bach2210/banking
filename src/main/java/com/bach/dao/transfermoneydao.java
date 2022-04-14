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
public class transfermoneydao {
     Connection con = null; 
    PreparedStatement ps = null; 
    PreparedStatement ps3 = null; 
     Connection con2 = null;
    PreparedStatement ps2 = null; 
    PreparedStatement ps4 = null; 
    ResultSet rs = null;
    ResultSet rs2 = null;
    int result = 0 ; 
    int result2 = 0 ;
    
       
            public double checkselect(String username)throws ClassNotFoundException
        {
        double money = 0 ;
         try {
              Class.forName("com.mysql.jdbc.Driver");
            String query = "select * from account where username =? ";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newservlet", "root", "221002");
            ps4 = con.prepareStatement(query);
            ps4.setString(1, username);
            rs2 = ps4.executeQuery();
            while(rs2.next())
            {
                 money = rs2.getDouble(2);    
            }
        } catch (Exception e) {
            
        }
        return money;
    }
        public boolean checktransferusername(String username)throws ClassNotFoundException
    {
         boolean a = true ;
         try {
              Class.forName("com.mysql.jdbc.Driver");
            String query = "select username from account where username =? ";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newservlet", "root", "221002");
            ps2 = con.prepareStatement(query);
            ps2.setString(1, username);
            rs = ps2.executeQuery();
            while(rs.next())
            {
                if(rs.getString(1).equalsIgnoreCase(username))
                {
                    a = true ;
                } else {a = false ;}
            } 
        } catch (Exception e) {
            
        }
         return a;
    } 
        
           public int transfer(String username  , double usdt)throws ClassNotFoundException
    {
         boolean a = checktransferusername(username);
         int b = 0 ;
         if(a == true && checkselect(username) > 0 )
         {
             try {
              Class.forName("com.mysql.jdbc.Driver");
            String query = "update account set USDT = ? where username = ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newservlet", "root", "221002");
            ps = con.prepareStatement(query);
            ps.setDouble(1, (checkselect(username) - usdt));
            ps.setString(2, username);
             result = ps.executeUpdate();
             b = 1 ; 
        } catch (Exception e) {
            
        }
        
    } 
         return b;
    }
               public int transfer2(String username , double usdt)throws ClassNotFoundException
    {
         boolean a = checktransferusername(username);
         if(a == true)
         {
             try {
              Class.forName("com.mysql.jdbc.Driver");
            String query = "update account set USDT = ? where username = ?";
           
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newservlet", "root", "221002");
            ps = con.prepareStatement(query);
            ps.setDouble(1, checkselect(username) + usdt);
            ps.setString(2, username);
             result = ps.executeUpdate();
             
        } catch (Exception e) {
            
        }
         
    } 
         return 0;
    }
}