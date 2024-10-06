<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <form action="search" method="GET">
            <label>Nhập tên sản phẩm: </label>
            <input type="text" name="ten"/>
            <button type="submit">Tìm kiếm</button>
        </form>
        <form action="welcome" method="GET">
            <button type="submit" name="action" value="sum">SUM</button>
        </form>
        <h1>Danh Sách Sản Phẩm</h1>
        <%
            List<Product> list = (List<Product>) request.getAttribute("list");
            out.print("<table border = 1>");
            out.print("<tr>");
            out.print("<th>ID</th>");
            out.print("<th>Tên</th>");
            out.print("<th>Hãng sản xuất</th>");
            out.print("<th>Số lượng</th>");
            out.print("<th>Tình trạng</th>");
            out.print("</tr>");
            for (Product gv : list) {
                out.print("<tr>");
                out.print("<td>" + gv.getId() + "</td>");
                out.print("<td>" + gv.getTen() + "</td>");
                out.print("<td>" + gv.getHangsx() + "</td>");
                out.print("<td>" + gv.getSoLuong() + "</td>");
                out.print("<td>" + gv.getTinhTrang() + "</td>");
                out.print("</tr>");
            }
            out.print("</table>");
            Integer sum = (Integer) request.getAttribute("sum");
            if (sum != null) {
                out.print("<p>Tổng số lượng sản phẩm là: " + sum + "</p>");
            }
        %>
    </body>
</html>
