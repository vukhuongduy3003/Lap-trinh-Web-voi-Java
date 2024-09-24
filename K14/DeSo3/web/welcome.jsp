<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.SinhVien"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <form action="search" method="GET">
            <label>Nhập tên sinh viên: </label>
            <input type="text" name="ten"/>
            <button type="submit">Tìm kiếm</button>
        </form>
        <h1>Danh Sách Sinh Viên</h1>
        <%
            List<SinhVien> list = new ArrayList<>();
            list = (List<SinhVien>) request.getAttribute("list");
            out.print("<table border = 1>");
            out.print("<tr>");
            out.print("<th>ID</th>");
            out.print("<th>Tên</th>");
            out.print("<th>Lớp</th>");
            out.print("<th>Điểm TB</th>");
            out.print("</tr>");
            for (SinhVien sinhVien : list) {
                out.print("<tr>");
                out.print("<td>" + sinhVien.getId() + "</td>");
                out.print("<td>" + sinhVien.getTen()+ "</td>");
                out.print("<td>" + sinhVien.getLop()+ "</td>");
                out.print("<td>" + sinhVien.getDiemTB()+ "</td>");
                out.print("</tr>");
            }
            out.print("</table>");
        %>
        <form action="welcome" method="GET">
            <button type="submit" name="action" value="max_DiemTB">Tìm điểm TB lớn nhất</button>
        </form>
        <%
            Float maxVal = (Float) request.getAttribute("maxVal");
            if (maxVal != null) {
                out.print("<P>Điểm trung bình lớn nhất là: " + maxVal + "</p>");
            }
        %>
    </body>
</html>
