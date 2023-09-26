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
</head>
<body>
<h1>Danh sách sách</h1>
<%--<button><a href="?action=showFormCreate">Thêm mới</a></button>--%>
<%--<button><a href="?action=showFormDelete">Xóa</a></button>--%>
<%--<button><a href="?action=showFormUpdate">Cập nhật</a></button>--%>
<table border="1px">
    <tr>
        <th>Mã sách</th>
        <th>Tên sách</th>
        <th>Tác giả</th>
        <th>Số lượng</th>
        <th>Mô tả</th>
        <th>Chức năng</th>
    </tr>
    <c:forEach items="${listSach}" var="sach" varStatus="loop">
        <tr>
            <td><c:out value="${sach.maSach}"/></td>
            <td><c:out value="${sach.tenSach}"/></td>
            <td><c:out value="${sach.tacGia}"/></td>
            <td><c:out value="${sach.soLuong}"/></td>
            <td><c:out value="${sach.moTa}"/></td>
                <%--      <td><button><a href="?action=showFormBorrow">Mượn</a></button></td>--%>
            <td>
                <form action="muonsach.jsp" method="post">
                    <input type="hidden" name="tenSach" value="${sach.tenSach}">
                    <button type="submit">Mượn</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
