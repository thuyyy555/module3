<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 8/23/2023
  Time: 7:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Xóa học viên</h1>
<button><a href="/">Quay lại</a></button>
<form method="post" action="?action=delete">
  Nhập id muốn xóa: <input type="text" name="id"><br>
  <input type="submit" value="Xóa">
</form>
</body>
</html>
