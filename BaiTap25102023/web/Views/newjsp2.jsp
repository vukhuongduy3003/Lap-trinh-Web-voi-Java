<%-- 
    Document   : newjsp2
    Created on : Oct 25, 2023, 4:30:35 PM
    Author     : VKDUY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Màu Đã Chọn</h1>
         <p>Username <%= request.getAttribute("username") %> </p>
         <p>Password <%= request.getAttribute("password") %> </p>
         <p>Màu đã chọn <%= request.getAttribute("color") %> </p>
    </body>
</html>
