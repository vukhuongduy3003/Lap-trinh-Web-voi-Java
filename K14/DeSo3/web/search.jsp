<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.SinhVien"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kết quả tìm kiếm</title>
    </head>
    <body>
        <h1>Danh Sách Sinh Viên Đã Tìm Thấy</h1>
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
    </body>
</html>
