<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "addsv" method = "POST">
		<div>
			<label>Mã</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
			<input type = "text" name = "ma" />
		</div>
		<div>
			<label>Tên</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
			<input type = "text" name = "ten" />
		</div>
		<div>
			<label>Lớp</label> &nbsp; &nbsp; &nbsp; &nbsp;
			<input type = "text" name = "lop" />
		</div>
		<div>
			<label>Điểm TB</label> &nbsp; &nbsp; &nbsp;
			<input type = "text" name = "diemtb" />
		</div>
		<div>
			<button type = "submit">Thêm</button>
		</div>
	</form>
</body>
</html>