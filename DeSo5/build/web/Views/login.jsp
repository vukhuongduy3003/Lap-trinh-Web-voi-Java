<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="../dang-nhap" method="GET">
            <table align = "center" style="margin-top: 30px">
                <tr>
                    <td colspan="2"><h2>Đăng nhập</h2></td>    
                </tr>
                <tr>
                    <td> <strong>Email: </strong></td>
                    <td> <input type="text" name="email" value="" /></td>
                </tr>
                <tr>
                    <td> <strong>Password: </strong></td>
                    <td> <input type="password" name="pass" value="" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Đăng nhập" />
                        <input type="reset" value="Reset" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
