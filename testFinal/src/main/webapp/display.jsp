<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
<table class="table">
    <tr>
        <th>Mã MB</th>
        <th>Diện tích</th>
        <th>Trạng thái</th>
        <th>Loại văn phòng</th>
        <th>Giá cho thuê</th>
        <th>Ngày bắt đầu</th>
        <th>Ngày kết thúc</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${list}" var="matBang" varStatus="loop">
        <tr>
            <td><c:out value="${matBang.id}"/></td>
            <td><c:out value="${matBang.dienTich}"/></td>
            <td><c:out value="${matBang.tang}"/></td>
            <td><c:out value="${matBang.loaiVp}"/></td>
            <td><c:out value="${matBang.gia}"/></td>
            <td><c:out value="${matBang.ngayBd}"/></td>
            <td><c:out value="${matBang.ngayKt}"/></td>
            <td>
                <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal"
                        onclick="passIdToModal(${matBang.id})">
                    Delete
                </button>
                </div>
                </div>
            </td>
                <%--      <td>--%>
                <%--        <button type="button" class="btn btn-secondary">--%>
                <%--                                <a href="?action=showFormDelete&id=${matBang.id}">--%>
                <%--            Delete</a></button>--%>
                <%--      </td>--%>
        </tr>
    </c:forEach>
</table>
<form method="post" action="?action=showFormDelete">
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Thông báo</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    Bạn có xác nhận muốn xóa ?
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Xác nhận</button>
                </div>
                <input type="hidden" id="modalIdInput" name="id">
            </div>
        </div>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
        crossorigin="anonymous"></script>
<script>
    function passIdToModal(id) {
        document.getElementById('modalIdInput').value = id;
    }
</script>
</body>
</html>
