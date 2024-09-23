<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Sach"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kết quả tìm kiếm</title>
    </head>
    <body>
        <h1>Danh Sách Sách Đã Tìm Thấy</h1>
        <%
            List<Sach> list = new ArrayList<>();
            list = (List<Sach>) request.getAttribute("list");
            out.print("<table border = 1>");
            out.print("<tr>");
            out.print("<th>ID</th>");
            out.print("<th>Tên Sách</th>");
            out.print("<th>NXB</th>");
            out.print("<th>Năm XB</th>");
            out.print("</tr>");
            for (Sach sach : list) {
                out.print("<tr>");
                out.print("<td>" + sach.getId() + "</td>");
                out.print("<td>" + sach.getTenSach()+ "</td>");
                out.print("<td>" + sach.getNxb()+ "</td>");
                out.print("<td>" + sach.getNamXB()+ "</td>");
                out.print("</tr>");
            }
            out.print("</table>");
        %>
    </body>
</html>
