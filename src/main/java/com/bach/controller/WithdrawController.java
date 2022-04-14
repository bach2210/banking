/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bach.controller;

import com.bach.dao.depositdao;
import com.bach.dao.withdrawdao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet("/withdraw-money")
public class WithdrawController extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            HttpSession session = request.getSession();
            String a = request.getParameter("usdt");
            double money = Double.parseDouble(a);
            String username = (String)session.getAttribute("username");
            
            withdrawdao withdrawdao = new withdrawdao();
            withdrawdao.checkwithdraw(username, money);
            request.setAttribute("username", username);
            RequestDispatcher dispatcher = request.getRequestDispatcher("success3.jsp");
            dispatcher.forward(request, response);
            }catch(Exception ex)
            {
                
            }
    }
}
