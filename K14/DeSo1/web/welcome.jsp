<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Product"%>
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
        <h1>Danh Sách Sản Phẩm</h1>
        <%
            List<Product> list = new ArrayList<>();
            list = (List<Product>) request.getAttribute("list");
            out.print("<table border = 1>");
            out.print("<tr>");
            out.print("<th>ID</th>");
            out.print("<th>Tên</th>");
            out.print("<th>Số Lượng</th>");
            out.print("<th>Đơn Giá</th>");
            out.print("</tr>");
            for (Product product : list) {
                out.print("<tr>");
                out.print("<td>" + product.getId() + "</td>");
                out.print("<td>" + product.getTen()+ "</td>");
                out.print("<td>" + product.getSoLuong()+ "</td>");
                out.print("<td>" + product.getDonGia()+ "</td>");
                out.print("</tr>");
            }
            out.print("</table>");
        %>
        <form action="welcome" method="GET">
            <button type="submit" name="action" value="tong-tien">Tính tổng tiền</button>
        </form>
        <%
            Long sum = (Long) request.getAttribute("sum");
            if (sum != null) {
                out.print("<P>Tổng tiền của tất cả các sản phẩm là: " + sum + "</p>");
            }
        %>
    </body>
</html>
