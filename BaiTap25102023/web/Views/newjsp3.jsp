<%-- 
    Document   : newjsp3
    Created on : Oct 25, 2023, 4:50:42 PM
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
        <h1>Bài 2: Chọn nhiều môn học</h1>
        <form action="../ChooseMonHoc" method="POST">
            <ol>
            <li>Toán<input type="checkbox" name="MonHoc" value="Toan" /></li>
            <li>Văn<input type="checkbox" name="MonHoc" value="Van" /></li>
            <li>Anh<input type="checkbox" name="MonHoc" value="Anh" /></li>
            <li>Tin<input type="checkbox" name="MonHoc" value="Tin" /></li>
        </ol>
        <br><input type="submit" value="Submit" />
        </form>
    </body>
</html>
