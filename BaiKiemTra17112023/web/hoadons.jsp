<%-- 
    Document   : display
    Created on : Nov 17, 2023, 10:01:29 AM
    Author     : Nga
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@page import="model.HoaDon" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Products</title>
        <style>
            /* Basic styling for the table */
            table {
                width: 100%;
                border-collapse: collapse;
                margin-bottom: 20px;
            }

            /* Style for table header cells */
            th {
                background-color: #f2f2f2;
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            /* Style for table data cells */
            td {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            /* Alternate row background color for better readability */
            tr:nth-child(even) {
                background-color: #f9f9f9;
            }

        </style>
    </head>
    <body>
        <h1>Danh sách hoá đơn</h1>
        <%
            List<HoaDon> hoadons = (List<HoaDon>) request.getAttribute("hoadons");
            if (hoadons != null && !hoadons.isEmpty()) {
        %>
        <table>
            <thead>
                <tr>
                    <th>Mã hoá đơn</th>
                    <th>Ngày lập</th>
                    <th>Số kw</th>
                    <th>Đơn giá</th>
                    <th>Thành tiền</th>
                </tr>
            </thead>
            <tbody>
                <% for (HoaDon hoaDon : hoadons) {%>
                <tr>
                    <td><%= hoaDon.getMahdon()%></td>
                    <td><%= hoaDon.getNgaylap()%></td>
                    <td><%= hoaDon.getSokw()%></td>
                    <td><%= hoaDon.getDongia()%></td>
                    <td><%= hoaDon.getSokw() * hoaDon.getDongia()%></td>
                </tr>
                <% } %>
            </tbody>
        </table>
        <%
        } else {
        %>
        <p>Không có hoá đơn nào</p>
        <%
            }
        %>
    </body>
</html>
