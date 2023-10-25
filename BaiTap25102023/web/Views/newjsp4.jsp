<%-- 
    Document   : newjsp4
    Created on : Oct 25, 2023, 5:00:27 PM
    Author     : VKDUY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Vũ Thuỳ Linh</h1>
        <h1>Danh sách môn học</h1>
        <ol>
            <%
                // Nhận danh sách môn học từ request
                List<String> selectedCourses = (List<String>) request.getAttribute("monhoces");

                if (selectedCourses != null && !selectedCourses.isEmpty()) {
                    for (String course : selectedCourses) {
            %>
            <li><%= course%></li>
                <%
                    }
                } else {
                    %>
                <li>Không có môn học nào được chọn.</li>
                    <%
                    }
                %>
        </ol>
    </body>
</html>
