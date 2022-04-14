<%-- 
    Document   : success4
    Created on : Mar 17, 2022, 7:38:40 PM
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
        <%double money = (double)request.getAttribute("money");%>
        <h1>Account 's Balance : <%=Math.round(money) %> USDT alt="alt"/></h1>
    </body>
</html>
