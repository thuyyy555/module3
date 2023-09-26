<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 8/28/2023
  Time: 6:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Cập nhật thông tin học viên</h1>
<button><a href="/">Quay lại</a></button>
<form method="post" action="?action=update">
    Nhập id muốn chỉnh sửa: <input type="text" name="id_update"><br>
    Tên: <input type="text" name="name"><br>
    Giới tính: <input type="radio" name="gender" value="male">Nam
    <input type="radio" name="gender" value="female">Nữ<br>
    Điểm: <input type="number" name="point"><br>
    <input type="submit" value="Xác nhận">
</form>
</body>
</html>
