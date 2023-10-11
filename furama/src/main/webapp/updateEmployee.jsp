<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form method="post" action="/employee?action=update">
  <div class="mb-3">
    <label for="maNhanVien" class="form-label">Mã Nhân Viên</label>
    <input type="text" class="form-control" id="maNhanVien" name="maNhanVien" aria-describedby="maNhanVien_txt" value="${employee.maNhanVien}" readonly>
    <div id="maNhanVien_txt" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="hoTen" class="form-label">Họ Tên Nhân Viên</label>
    <input type="text" class="form-control" id="hoTen" name="hoTen" aria-describedby="maLK_txt" value="${employee.hoTen}">
    <div id="hoTen_txt" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="ngaySinh" class="form-label">Ngày Sinh</label>
    <input type="date" class="form-control" id="ngaySinh" name="ngaySinh" aria-describedby="ngaySinh_txt" value="${employee.ngaySinh}">
    <div id="ngaySinh_txt" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="cmnd" class="form-label">CMND</label>
    <input type="text" class="form-control" id="cmnd" name="cmnd" aria-describedby="cmnd_txt" value="${employee.cmnd}">
    <div id="cmnd_txt" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="luong" class="form-label">Lương</label>
    <input type="text" class="form-control" id="luong" name="luong" aria-describedby="luong_txt" value="${employee.luong}">
    <div id="luong_txt" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="sdt" class="form-label">Số Điện Thoại</label>
    <input type="text" class="form-control" id="sdt" name="sdt" aria-describedby="sdt_txt" value="${employee.sdt}">
    <div id="sdt_txt" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="email" class="form-label">Email</label>
    <input type="text" class="form-control" id="email" name="email" aria-describedby="email_txt" value="${employee.email}">
    <div id="email_txt" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="diaChi" class="form-label">Địa Chỉ</label>
    <input type="text" class="form-control" id="diaChi" name="diaChi" aria-describedby="diaChi_txt" value="${employee.diaChi}">
    <div id="diaChi_txt" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="maViTri" class="form-label">Mã Vị Trí</label>
    <input type="text" class="form-control" id="maViTri" name="maViTri" aria-describedby="maViTri_txt" value="${employee.maViTri}">
    <div id="maViTri_txt" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="maTrinhDo" class="form-label">Mã Trình Độ</label>
    <input type="text" class="form-control" id="maTrinhDo" name="maTrinhDo" aria-describedby="maTrinhDo_txt" value="${employee.maTrinhDo}">
    <div id="maTrinhDo_txt" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="maBoPhan" class="form-label">Mã Bộ Phận</label>
    <input type="text" class="form-control" id="maBoPhan" name="maBoPhan" aria-describedby="maBoPhan_txt" value="${employee.maBoPhan}">
    <div id="maBoPhan_txt" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>

