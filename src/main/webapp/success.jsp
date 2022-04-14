<%-- 
    Document   : success
    Created on : Mar 15, 2022, 9:20:38 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <style>
            form {display: inline-block;}         
        </style>
    </head>
    <body>
        <%String name = (String)request.getAttribute("username"); %>
        <h1>Welcome <%=name%> to Bach's Exchange</h1>
        <%session.setAttribute("username", name);   %>
        <form action = "deposit.jsp">
            <input type="submit" value="Deposit"/>
        </form>
        
        <form action = "withdraw.jsp">
            <input type="submit" value="Withdraw" />
        </form>
        
        <form action = "balance" method = "post">
            <input type="submit" value="Check Account Balance" />
        </form>
        
        <form action = "transfermoney.jsp">
            <input type="submit" value="Transfer money" />
        </form>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
