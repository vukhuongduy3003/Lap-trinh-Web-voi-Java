<%-- 
    Document   : timkiem
    Created on : Nov 29, 2023, 7:45:09 PM
    Author     : VKDUY
--%>

<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <title>Tìm kiếm</title>
    </head>
    <body>
        <h1>Tìm kiếm Product</h1>
        <table class="table table-hover" border="1">
            <tr>
                <th>Mã sản phẩm</th>
                <th>Tên sản phẩm</th>
                <th>Số lượng</th>
                <th>Đơn giá</th>
            </tr>

            <%
                List<Product> products = (List<Product>) request.getAttribute("products");
                for (Product product : products) {
            %>
            <tr>
                <td><p><%= product.getId()%></p></td>
                <td><p><%= product.getName()%></p></td>
                <td><p><%= product.getQuantity()%></p></td>
                <td><p><%= product.getPrice()%></p></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
