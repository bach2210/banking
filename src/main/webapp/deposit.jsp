<%-- 
    Document   : deposit
    Created on : Mar 17, 2022, 4:59:10 AM
    Author     : Admin
--%>

<%@page import="com.bach.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%String username = (String)session.getAttribute("username");%>
        <form action = "deposit-money" method = "post"> 
           <h3>Enter amount of usdt that you want to deposit</h3><input type = "number" name="usdt">
            <input type = "submit" value ="deposit">
        </form> 
    </body>
</html>
