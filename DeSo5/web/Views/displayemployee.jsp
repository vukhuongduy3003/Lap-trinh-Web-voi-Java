<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./Insert" method="POST">
            <table border="1" align="center" style="margin-top: 30px">
                <tr>
                    <td colspan="2" align="center"><h2> Them Nhan Vien </h2></td>
                </tr>
                <tr>
                    <td><strong>ID: </strong></td>
                    <td><input type="text" name="ID" value="" /> </td>
                </tr>
                <tr>
                    <td><strong>Ten nhan vien: </strong></td>
                    <td><input type="text" name="tenNV" value="" /> </td>
                </tr>
                <tr>
                    <td><strong>Que Quan: </strong></td>
                    <td><input type="text" name="quequan" value="" /> </td>
                </tr>
                <tr>
                    <td><strong>Tuoi: </strong></td>
                    <td><input type="text" name="tuoi" value="" /> </td>
                </tr>
                <tr>
                    <td colspan="2" align="center"> <input type="submit" value="Them" /></td>
                </tr>
            </table>
        </form>
        <form action="./welcome" method="POST">
            <table align="center" style="margin-top: 10px">
                <tr>
                    <td> Tim kiem theo ten: </td>
                    <td><input type="text" name="ten" value="" /> </td>
                    <td> <input type="submit" value="Tim kiem" name="Tim" /></td>
                </tr>
            </table>
        </form>
        <form action="./employeeMax" method="POST">
            <table align="center" style="margin-top: 30px">
                <tr>
                    <td> <input type="submit" value="Hien Thi Max" name="Max" /></td>
                </tr>
            </table>
        </form>
        <table border="1" align="center" style="margin-top: 30px">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Ten Cong Nhan</th>
                    <th>Que Quan</th>
                    <th>Tuoi</th>
                    <th colspan="2">Thao Tac</th>
                </tr>
            </thead>
            <tbody>
                <% ResultSet rs = (ResultSet) request.getAttribute("list");
                    if (rs != null) {
                        while(rs.next()) {
                %>
                            <tr>
                                <td><%out.print(rs.getString(1));%></td>
                                <td><%out.print(rs.getString(2));%></td>
                                <td><%out.print(rs.getString(3));%></td>
                                <td><%out.print(rs.getString(4));%></td>
                                <td>
                                    <form action="./Delete" method="POST">
                                        <input type="hidden" name="MaNV" value="<%=rs.getString(1)%>" />
                                        <input type="submit" value="Delete" />
                                    </form>
                                </td>
                                <td>
                                    <form action="./Edit" method="GET">
                                        <input type="hidden" name="maNV_edit" value="<%=rs.getString(1)%>" />
                                        <input type="hidden" name="ten_edit" value="<%=rs.getString(2)%>" />
                                        <input type="hidden" name="quequan_edit" value="<%=rs.getString(3)%>" />
                                        <input type="hidden" name="tuoi_edit" value="<%=rs.getString(4)%>" />
                                        <input type="submit" value="Edit" />
                                    </form>
                                </td>
                            </tr>
                <% }
                } else { %>
                    <tr>
                        <td> Khong co du lieu</td>
                    </tr>
                <% }%>
                </tbody>
        </table>
    </body>
</html>
