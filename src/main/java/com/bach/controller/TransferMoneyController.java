/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bach.controller;

import com.bach.dao.balancecheckingdao;
import com.bach.dao.transfermoneydao;
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
@WebServlet("/transfer-money")
public class TransferMoneyController extends HttpServlet{
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            HttpSession session = request.getSession();
            String username = request.getParameter("name");
            String username2 = (String)session.getAttribute("username");
            String usdt = request.getParameter("transfer-usdt");
            double money = Double.parseDouble(usdt);
            transfermoneydao transfermoneydao = new transfermoneydao();
            if(transfermoneydao.transfer(username2  , money ) == 1) 
            {
                 transfermoneydao.transfer2(username  , money );
                 response.sendRedirect("success5.jsp");
            } 
            else response.sendRedirect("fail1.jsp");
            }catch(Exception ex)
            {
                
            }
    }
}
