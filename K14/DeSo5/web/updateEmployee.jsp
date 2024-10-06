<%@page import="model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert</title>
    </head>
    <body>
        <form action="update" method="POST">
            <% Employee employee = (Employee) request.getAttribute("employee"); %>
            <div>
                <label>ID</label>
                <input readonly type="number" name="id" value="<%= employee.getId() %>"/>
            </div>
            <div>
                <label>Tên</label>
                <input type="text" name="ten" value="<%= employee.getTen() %>"/>
            </div>
            <div>
                <label>Quê Quán</label>
                <input type="text" name="queQuan" value="<%= employee.getQueQuan() %>"/>
            </div>
            <div>
                <label>Tuổi</label>
                <input type="number" name="tuoi" value="<%= employee.getTuoi() %>"/>
            </div>
            <div>
                <button type="submit">Sửa</button>
            </div>
        </form>
    </body>
</html>
