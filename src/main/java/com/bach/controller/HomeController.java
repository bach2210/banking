/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bach.controller;

import com.bach.dao.logindao;
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
 @WebServlet("/login")
public class HomeController extends HttpServlet {

    User user = new User();

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");     
            logindao login = new logindao();
            User a = login.checklogin(username, password);        
            if(a == null) 
            {             
                response.sendRedirect("login.jsp");
            }
            else{
                 request.setAttribute("username", username);
                 RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
                 dispatcher.forward(request, response);   
            }
        } catch (Exception e) {
            
        }

    }
}
