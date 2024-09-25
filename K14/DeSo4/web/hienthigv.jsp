<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.GV"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <form action="search" method="GET">
            <label>Nhập tên giáo viên: </label>
            <input type="text" name="ten"/>
            <button type="submit">Tìm kiếm</button>
        </form>
        <form action="welcome" method="GET">
            <button type="submit" name="action" value="min_Luong">Display Min</button>
        </form>
        <h1>Danh Sách Giáo Viên</h1>
        <%
            List<GV> list = new ArrayList<>();
            list = (List<GV>) request.getAttribute("list");
            Long minVal = (Long) request.getAttribute("minVal");
            out.print("<table border = 1>");
            out.print("<tr>");
            out.print("<th>ID</th>");
            out.print("<th>Tên</th>");
            out.print("<th>Khoa</th>");
            out.print("<th>Lương</th>");
            out.print("</tr>");
            if (minVal != null) {
                for (GV gv : list) {
                    if (gv.getLuong() == minVal) {
                        out.print("<tr>");
                        out.print("<td>" + gv.getId() + "</td>");
                        out.print("<td>" + gv.getTen() + "</td>");
                        out.print("<td>" + gv.getKhoa() + "</td>");
                        out.print("<td>" + gv.getLuong() + "</td>");
                        out.print("</tr>");
                    }
                }
            } else {
                for (GV gv : list) {
                    out.print("<tr>");
                    out.print("<td>" + gv.getId() + "</td>");
                    out.print("<td>" + gv.getTen() + "</td>");
                    out.print("<td>" + gv.getKhoa() + "</td>");
                    out.print("<td>" + gv.getLuong() + "</td>");
                    out.print("</tr>");
                }
            }
            out.print("</table>");
        %>
    </body>
</html>
