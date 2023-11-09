<%-- 
    Document   : TongSoLuong
    Created on : Nov 8, 2023, 9:04:20 PM
    Author     : VKDUY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <title>Số lượng mặt hàng</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div>
                    <%
                        Cookie[] cookies = request.getCookies();
                        int soluong = 0;
                        if (cookies != null) {
                            for (Cookie cookie : cookies) {
                                if (cookie.getName().equals("soluong")) {
                                    soluong = Integer.parseInt(cookie.getValue());
                                    break;
                                }
                            }
                        }
                    %>
                    <h2>Tổng số lượng mặt hàng: <%= soluong %></h2>
                </div>
            </div>
        </div>
    </body>
</html>
