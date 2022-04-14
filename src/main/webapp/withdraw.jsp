<%-- 
    Document   : withdraw
    Created on : Mar 17, 2022, 7:13:53 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action = "withdraw-money" method = "post"> 
           <h3>Enter amount of usdt that you want to withdraw</h3><input type = "number" name="usdt">
            <input type = "submit" value ="withdraw">
        </form> 
    </body>
</html>
