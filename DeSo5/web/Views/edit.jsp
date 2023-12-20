<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="./Edit" method="POST">
            <table border="1" align="center" style="margin-top: 30px">
                <tr>
                    <td colspan="2" align="center"><h2> Sua Nhan Vien </h2></td>
                </tr>
                <tr>
                    <td><strong>ID: </strong></td>
                    <td><input type="text" name="ID" value="<%=request.getAttribute("ID")%>" readonly="true" /> </td>
                </tr>
                <tr>
                    <td><strong>Ten nhan vien: </strong></td>
                    <td><input type="text" name="tenNV" value="<%=request.getAttribute("ten")%>" /> </td>
                </tr>
                <tr>
                    <td><strong>Que Quan: </strong></td>
                    <td><input type="text" name="quequan" value="<%=request.getAttribute("quequan")%>" /> </td>
                </tr>
                <tr>
                    <td><strong>Tuoi: </strong></td>
                    <td><input type="text" name="tuoi" value="<%=request.getAttribute("tuoi")%>" /> </td>
                </tr>
                <tr>
                    <td align="center"> <input type="submit" value="Sua" /></td>
                    <td><form action="./welcome">
                            <input type="submit" value="Thoat" />
                        </form> </td>
                </tr>
            </table>

        </form>
    </body>
</html>