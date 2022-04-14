<%-- 
    Document   : transfermoney
    Created on : Mar 23, 2022, 4:49:10 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
          
            
        </style>
    </head>
    <body>
        <form action = "transfer-money" method = "post">
        <h3> Enter Receiver's Username: </h3><input type ="text" name = "name">
        <h3> Enter Amount of Usdt that you want to transfer: </h3><input type ="number" name = "transfer-usdt">
        <br><br>
        <input type = "submit" value = "Transfer"> 
        </form>
    </body>
</html>
