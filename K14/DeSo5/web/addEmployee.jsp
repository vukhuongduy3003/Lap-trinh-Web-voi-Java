<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert</title>
    </head>
    <body>
        <form action="add" method="POST">
            <div>
                <label>ID</label>
                <input type="number" name="id"/>
            </div>
            <div>
                <label>Tên</label>
                <input type="text" name="ten"/>
            </div>
            <div>
                <label>Quê Quán</label>
                <input type="text" name="queQuan"/>
            </div>
            <div>
                <label>Tuổi</label>
                <input type="number" name="tuoi"/>
            </div>
            <div>
                <button type="submit">Thêm</button>
            </div>
        </form>
    </body>
</html>
