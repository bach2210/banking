/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bach.model;

/**
 *
 * @author Admin
 */
public class User {
    private String pass ; 
    private String username ; 
    private double usdt;

    public double getUsdt() {
        return usdt;
    }

    public void setUsdt(double usdt) {
        this.usdt = usdt;
    }
    
    
    public User() 
    {
        
    }

    public User(String username, String pass) {
        this.pass = pass;
        this.username = username;
    }


    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
