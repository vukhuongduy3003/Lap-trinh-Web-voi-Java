<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kết quả tìm kiếm</title>
    </head>
    <body>
        <h1>Danh Sách Nhân Viên Đã Tìm Thấy</h1>
        <%
            List<Employee> list = (List<Employee>) request.getAttribute("list");
            out.print("<table border = 1>");
            out.print("<tr>");
            out.print("<th>ID</th>");
            out.print("<th>Tên</th>");
            out.print("<th>Quê Quán</th>");
            out.print("<th>Tuổi</th>");
            out.print("</tr>");
            for (Employee gv : list) {
                out.print("<tr>");
                out.print("<td>" + gv.getId() + "</td>");
                out.print("<td>" + gv.getTen()+ "</td>");
                out.print("<td>" + gv.getQueQuan()+ "</td>");
                out.print("<td>" + gv.getTuoi()+ "</td>");
                out.print("</tr>");
            }
            out.print("</table>");
        %>
    </body>
</html>
