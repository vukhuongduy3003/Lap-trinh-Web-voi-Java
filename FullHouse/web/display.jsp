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
	<h1>Danh Sách Sinh Viên</h1>
	<form action="findsv" method="GET">
		<label>Nhập tên sinh viên: </label>
		<input type = "text" name="ten"/>
		<button type="submit"> Tìm kiếm</button>
	</form>
        
	<a href="addsv.jsp"> Thêm Sinh Viên </a>
	
	<%
		ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
		dssv = (ArrayList<SinhVien>) request.getAttribute("list");
		out.println("<table border = 1>");
		out.println("<tr>");
		out.println("<th>Mã</th>");
		out.println("<th>Tên</th>");
		out.println("<th>Lớp</th>");
		out.println("<th>Điểm TB</th>");
		out.println("<th>Chức năng</th>");
		out.println("</tr>");
		for(SinhVien sv : dssv){
			out.println("<tr>");
			out.println("<td>" + sv.getMa() + "</td>");
			out.println("<td>" + sv.getTen() + "</td>");
			out.println("<td>" + sv.getLop() + "</td>");
			out.println("<td>" + sv.getDiemtb() + "</td>");
			out.println("<td><a href = /FullHouse/update?ma=" + sv.getMa() + ">Sửa</a>");
			out.println("&nbsp;");
			out.println("<a href = /FullHouse/delete?ma=" + sv.getMa() + ">Xóa</a></td>");
			out.println("</tr>");
		}
		out.println("</table>");
	%>
	
	<%
	    String tl = (String) session.getAttribute("tl");
		if(tl != null){
			out.println(tl);
		}
	%>

	
</body>
</html>



