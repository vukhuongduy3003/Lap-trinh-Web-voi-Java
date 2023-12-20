<%-- 
    Document   : display
    Created on : Nov 22, 2023, 3:44:55 PM
    Author     : VKDUY
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                </tr>
            </thead>
            <tbody>
                <%
                    ResultSet kq = (ResultSet) request.getAttribute("list");
                    while (kq.next()) {                            
                %>
                <tr>
                    <td><% out.print(kq.getInt(1)); %></td>
                    <td><% out.print(kq.getString(2)); %></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>

    </body>
</html>
