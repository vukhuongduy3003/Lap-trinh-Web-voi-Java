<%-- 
    Document   : tongtien
    Created on : Nov 29, 2023, 9:10:39 PM
    Author     : VKDUY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tổng tiền</title>
    </head>
    <body>
        <h1>Tổng tiền của tất cả các Product là: <%= request.getAttribute("tongtien") %>đ</h1>
    </body>
</html>
