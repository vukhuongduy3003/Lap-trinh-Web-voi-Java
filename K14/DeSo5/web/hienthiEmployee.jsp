<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <form action="search" method="GET">
            <label>Nhập tên nhân viên: </label>
            <input type="text" name="ten"/>
            <button type="submit">Tìm kiếm</button>
        </form>
        <form action="welcome" method="GET">
            <button type="submit" name="action" value="maxAge">maxAge</button>
        </form>
        <a href="addEmployee.jsp">Thêm Nhân Viên</a>
        <h1>Danh Sách Nhân Viên</h1>
        <%
            List<Employee> list = (List<Employee>) request.getAttribute("list");
            Integer maxAge = (Integer) request.getAttribute("maxAge");
            out.print("<table border = 1>");
            out.print("<tr>");
            out.print("<th>ID</th>");
            out.print("<th>Tên</th>");
            out.print("<th>Quê Quán</th>");
            out.print("<th>Tuổi</th>");
            out.print("<th>Chức năng</th>");
            out.print("</tr>");
            if (maxAge != null) {
                for (Employee employee : list) {
                    if (employee.getTuoi()== maxAge) {
                        out.print("<tr>");
                        out.print("<td>" + employee.getId() + "</td>");
                        out.print("<td>" + employee.getTen() + "</td>");
                        out.print("<td>" + employee.getQueQuan() + "</td>");
                        out.print("<td>" + employee.getTuoi() + "</td>");
                        out.print("<td><a href=/DeSo5/update?id=" + employee.getId() + ">Sửa</a>&nbsp;");
                        out.print("<a href=/DeSo5/delete?id=" + employee.getId() + ">Xoá</a>&nbsp;</td>");
                        out.print("</tr>");
                    }
                }
            } else {
                for (Employee employee : list) {
                    out.print("<tr>");
                    out.print("<td>" + employee.getId() + "</td>");
                    out.print("<td>" + employee.getTen() + "</td>");
                    out.print("<td>" + employee.getQueQuan()+ "</td>");
                    out.print("<td>" + employee.getTuoi()+ "</td>");
                    out.print("<td><a href=/DeSo5/update?id=" + employee.getId() + ">Sửa</a>&nbsp;");
                        out.print("<a href=/DeSo5/delete?id=" + employee.getId() + ">Xoá</a>&nbsp;</td>");
                    out.print("</tr>");
                }
            }
            out.print("</table>");
        %>
        <%
            String res = (String) session.getAttribute("res");
            if (res != null) out.print(res);
        %>
    </body>
</html>
