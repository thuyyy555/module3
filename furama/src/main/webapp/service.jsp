<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <link rel="stylesheet" href="bootstrap520/css/bootstrap.min.css" />
  <link rel="stylesheet" href="datatables/css/dataTables.bootstrap5.min.css" />
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-lg-12">
      <table id="tableCustomer" class="table table-striped table-bordered" style="width:100%">
        <thead>
        <tr>
          <th>Mã Dịch Vụ</th>
          <th>Tên Dịch Vụ</th>
          <th>Diện Tích</th>
          <th>Chi Phí</th>
          <th>Số Người Tối Đa</th>
          <th>Mã Kiểu Thuê</th>
          <th>Mã Loại Dịch Vụ</th>
          <th>Tiêu Chuẩn Phòng</th>
          <th>Mô Tả</th>
          <th>Diện Tích Hồ Bơi</th>
          <th>Số Tầng</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="service" items="${list}">
          <tr>
            <td><c:out value="${service.maDV}"></c:out></td>
            <td><c:out value="${service.tenDV}"></c:out></td>
            <td><c:out value="${service.dienTich}"></c:out></td>
            <td><c:out value="${service.chiPhi}"></c:out></td>
            <td><c:out value="${service.soNguoiToiDa}"></c:out></td>
            <td><c:out value="${service.maKieuThue}"></c:out></td>
            <td><c:out value="${service.maLoaiDV}"></c:out></td>
            <td><c:out value="${service.tieuChuanPhong}"></c:out></td>
            <td><c:out value="${service.moTa}"></c:out></td>
            <td><c:out value="${service.dienTichHoBoi}"></c:out></td>
            <td><c:out value="${service.soTang}"></c:out></td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
    </div>
  </div>
</div>

<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap5.min.js"></script>
<script>
  $(document).ready(function() {
    $('#tableCustomer').dataTable( {
      "dom": 'lrtip',
      "lengthChange": false,
      "pageLength": 11
    } );
  } );
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
        crossorigin="anonymous"></script>
</body>
</html>


