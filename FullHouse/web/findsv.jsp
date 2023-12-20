<%@page import="model.SinhVien"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Danh Sách Sinh Viên Tìm Kiếm Theo Tên</h1>
	<%
		ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
		dssv = (ArrayList<SinhVien>) request.getAttribute("dssv");
		out.println("<table border = 1>");
		out.println("<tr>");
		out.println("<th>Mã</th>");
		out.println("<th>Tên</th>");
		out.println("<th>Lớp</th>");
		out.println("<th>Điểm TB</th>");
		out.println("</tr>");
		for(SinhVien sv : dssv){
			out.println("<tr>");
			out.println("<td>" + sv.getMa() + "</td>");
			out.println("<td>" + sv.getTen() + "</td>");
			out.println("<td>" + sv.getLop() + "</td>");
			out.println("<td>" + sv.getDiemtb() + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	%>
</body>
</html>