<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
<h1>Add new product</h1>
<form method="post" action="?action=update">
    <input type="hidden" name="id" value="${id}">
    <div class="form-group row">
        <label for="name" class="col-sm-2 col-form-label">Name:</label>
        <div class="col-sm-10">
            <input type="text" name="ten_sp" id="name" value="${product.tenSP}" required>
        </div>
    </div>
    <div class="form-group row">
        <label for="price" class="col-sm-2 col-form-label">Price:</label>
        <div class="col-sm-10">
            <input type="text" name="gia" id="price" value="${product.gia}" required>
        </div>
    </div>
    <div class="form-group row">
        <label for="quantity" class="col-sm-2 col-form-label">Quantity:</label>
        <div class="col-sm-10">
            <input type="text" name="so_luong" id="quantity" value="${product.soLuong}" required>
        </div>
    </div>
    <div class="form-group row">
        <label for="color" class="col-sm-2 col-form-label">Color:</label>
        <div class="col-sm-10">
            <input type="text" name="mau_sac" id="color" value="${product.mauSac}" required>
        </div>
    </div>
    <div class="form-group row">
        <label for="description" class="col-sm-2 col-form-label">Description:</label>
        <div class="col-sm-10">
            <input type="text" name="mo_ta" id="description" value="${product.moTa}" required>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Category:</label>
        <div class="col-sm-10">
            <select name="danh_muc">
                <%--                <c:forEach items="${listCategory}" var="category" varStatus="loop">--%>
                <%--                    <option>${product.danhMuc}</option>--%>
                <%--                </c:forEach>--%>
                <c:forEach items="${listCategory}" var="category" varStatus="loop">
                    <option>${category.name}</option>
                </c:forEach>
            </select></div>
        <br>
    </div>
    <input type="submit" value="Update">
    <button><a href="/">Back</a></button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
        crossorigin="anonymous"></script>
</body>
</html>

