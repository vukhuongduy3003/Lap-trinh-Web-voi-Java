<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <form action = "login" method = "POST">
            <div>
                <label>email</label> &nbsp; &nbsp; &nbsp;
                <input type = "email" name = "email" />
            </div>
            <div>
                <label>password</label>
                <input type = "text" name = "password" />
            </div>
            <div>
                <button type = "submit">Đăng nhập</button>
                <button type = "reset">Làm mới</button>
            </div>
        </form>
    </body>
</html>