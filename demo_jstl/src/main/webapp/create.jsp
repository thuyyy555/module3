<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 16/8/2023
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Thêm mới học viên</h1>
<button><a href="/">Quay lại</a></button>
<form method="post" action="?action=create">
    Tên: <input type="text" name="name"><br>
    Giới tính: <input type="radio" name="gender" value="male">Nam
                <input type="radio" name="gender" value="female">Nữ<br>
    Điểm: <input type="number" name="point"><br>
    <input type="submit" value="Thêm mới">
</form>
</body>
</html>
