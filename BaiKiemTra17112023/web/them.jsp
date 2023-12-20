<%-- 
    Document   : them
    Created on : Nov 17, 2023, 10:50:19 AM
    Author     : Nga
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm Hóa Đơn</title>
</head>
<body>
    <h2>Thêm Hóa Đơn</h2>
    <form action="/ThemServlet" method="post">
        <label for="mahdon">Mã Hóa Đơn:</label>
        <input type="text" id="mahdon" name="mahdon" required><br>

        <label for="ngaylap">Ngày Lập:</label>
        <input type="date" id="ngaylap" name="ngaylap" required><br>

        <label for="sokw">Số KW:</label>
        <input type="number" id="sokw" name="sokw" required><br>

        <label for="dongia">Đơn Giá:</label>
        <input type="number" id="dongia" name="dongia" required><br>

        <input type="submit" value="Thêm">
    </form>
</body>
</html>

