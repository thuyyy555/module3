<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 8/28/2023
  Time: 9:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <style>
        a{
            text-decoration: none;
            color: white;
        }
        #search-input{
            float: right;
            border-radius: 10px;
        }
    </style>
</head>
<body>
<h1>Product List</h1>
<button type="button" class="btn btn-danger"><a href="?action=showFormCreate">+ Add new product</a></button>
<input name="search" id="search-input">
<table class = "table">
    <tr>
        <th>#</th>
        <th>Product Name</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Color</th>
        <th>Category</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${list}" var="product" varStatus="loop">
        <tr>
            <td><c:out value="${product.id}"/></td>
            <td><c:out value="${product.tenSP}"/></td>
            <td><c:out value="${product.gia}"/></td>
            <td><c:out value="${product.soLuong}"/></td>
            <td><c:out value="${product.mauSac}"/></td>
            <td><c:out value="${product.danhMuc}"/></td>
            <td>
                <button type="button" class="btn btn-secondary"><a href="?action=showFormUpdate&id=${product.id}">Update</a></button>
            </td>
            <td>
                <button type="button" class="btn btn-secondary">
<%--                    <a href="?action=showFormDelete&id=${product.id}">--%>
                        <a href="#" onclick="showMess(${product.id})">
                        Delete</a></button>
<%--                href="#" onclick="showMess(${product.id})"--%>
            </td>
        </tr>
    </c:forEach>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
        crossorigin="anonymous">
    function showMess(id){
        var option = confirm('are you sure ?');
        if(option===true){
            window.location.href='/?action=showFormDelete&id='+id;
        }
    }
</script>
</body>
</html>
