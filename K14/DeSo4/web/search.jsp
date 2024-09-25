<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.GV"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kết quả tìm kiếm</title>
    </head>
    <body>
        <h1>Danh Sách Giáo Viên Đã Tìm Thấy</h1>
        <%
            List<GV> list = new ArrayList<>();
            list = (List<GV>) request.getAttribute("list");
            out.print("<table border = 1>");
            out.print("<tr>");
            out.print("<th>ID</th>");
            out.print("<th>Tên</th>");
            out.print("<th>Khoa</th>");
            out.print("<th>Lương</th>");
            out.print("</tr>");
            for (GV gv : list) {
                out.print("<tr>");
                out.print("<td>" + gv.getId() + "</td>");
                out.print("<td>" + gv.getTen()+ "</td>");
                out.print("<td>" + gv.getKhoa()+ "</td>");
                out.print("<td>" + gv.getLuong()+ "</td>");
                out.print("</tr>");
            }
            out.print("</table>");
        %>
    </body>
</html>
