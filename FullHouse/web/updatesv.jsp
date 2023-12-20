<%@page import="model.SinhVien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "update" method = "POST">
		<% SinhVien sv = (SinhVien) request.getAttribute("sv"); %>
		<div>
			<label>Mã</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
			<input readonly type = "text" name = "ma" value = "<%= sv.getMa()%>" />
		</div>
		<div>
			<label>Tên</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
			<input type = "text" name = "ten" value="<%= sv.getTen() %>" />
		</div>
		<div>
			<label>Lớp</label> &nbsp; &nbsp; &nbsp; &nbsp;
			<input type = "text" name = "lop" value = "<%= sv.getLop() %>" />
		</div>
		<div>
			<label>Điểm TB</label> &nbsp; &nbsp; &nbsp;
			<input type = "text" name = "diemtb" value = "<%= sv.getDiemtb() %>" />
		</div>
		<div>
			<button type = "submit">Sửa</button>
		</div>
	</form>
</body>
</html>