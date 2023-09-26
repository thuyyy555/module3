<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Danh sách khách hàng</title>
  <style>
    table{
      border-collapse: collapse;
    }
  </style>
</head>
<body>
<h1>Danh sách khách hàng</h1>
<table border="1px">
  <tr>
    <th>Tên</th>
    <th>Ngày sinh</th>
    <th>Địa chỉ</th>
    <th>Ảnh</th>
  </tr>
  <c:forEach items="${list}" var="customer" varStatus="loop">
    <tr>
      <td><c:out value="${customer.name}"/></td>
      <td><c:out value="${customer.date}"/></td>
      <td><c:out value="${customer.address}"/></td>
      <td><img src="${customer.picture}"></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>