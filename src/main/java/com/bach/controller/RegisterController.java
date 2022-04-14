/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bach.controller;

import com.bach.dao.logindao;
import com.bach.dao.registerdao;
import com.bach.model.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet("/register")
public class RegisterController extends HttpServlet{


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String repassword = request.getParameter("re-password");
            
            if(password.equals(repassword))
            {
                User a = new User(username,password);
                registerdao rd = new registerdao();
                rd.checkregister(a);
                response.sendRedirect("success2.jsp");
            }else 
            {response.sendRedirect("register.jsp");}
        } catch (Exception e) {
        }

    }
}
