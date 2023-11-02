<%-- 
    Document   : home
    Created on : Nov 1, 2023, 4:06:22 PM
    Author     : VKDUY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang Chủ</title>
    </head>
    <body>
        <%
            HttpSession sessionUser = request.getSession();
            String username = (String) sessionUser.getAttribute("username");
            String email = (String) sessionUser.getAttribute("email");
            String password = (String) sessionUser.getAttribute("password");
        %>
        <p>Username: <%= username %></p>
        <p>Password: <%= password %></p>
        <p>Email: <%= email %></p>
    </body>
</html>
