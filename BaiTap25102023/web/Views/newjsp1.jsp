<%-- 
    Document   : newjsp1
    Created on : Oct 25, 2023, 2:39:32 PM
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
        <h1>Mời bạn chọn màu</h1>
        <form action="../ChooseColor" method="get">
                username: <input type="text" name="username" value="" />
                <br>password: <input type="text" name="password" value="" />
                <br>Chọn màu <input type="text" name="color" value="" />
               <br>
                <br>
                <br>submit<input type="submit" value="OK" />
    </body>
</html>
