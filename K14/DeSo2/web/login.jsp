<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng nhập</title>
    </head>
    <body>
        <form action="dang-nhap" method="POST">
            <div>
                <label>Email</label>
                <input type="email" name="email"/>
            </div>
            <div>
                <label>Password</label>
                <input type="password" name="password"/>
            </div>
            <div>
                <button type="submit">Đăng nhập</button>
                <button type="reset">Làm mới</button>
            </div>
        </form>
    </body>
</html>
