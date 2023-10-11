<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form method="post" action="/contract?action=create">
    <div class="mb-3">
        <label for="maHopDong" class="form-label">Mã Hợp Đồng</label>
        <input type="text" class="form-control" id="maHopDong" name="maHopDong" aria-describedby="maHopDong_txt">
        <div id="maHopDong_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="ngayLamHopDong" class="form-label">Ngày Làm Hợp Đồng</label>
        <input type="date" class="form-control" id="ngayLamHopDong" name="ngayLamHopDong" aria-describedby="ngayLamHopDong_txt">
        <div id="ngayLamHopDong_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="ngayKetThuc" class="form-label">Ngày Kết Thúc</label>
        <input type="date" class="form-control" id="ngayKetThuc" name="ngayKetThuc" aria-describedby="ngayKetThuc_txt">
        <div id="ngayKetThuc_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="tienDatCoc" class="form-label">Tiền Đặt Cọc</label>
        <input type="text" class="form-control" id="tienDatCoc" name="tienDatCoc" aria-describedby="tienDatCoc_txt">
        <div id="tienDatCoc_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="maNhanVien" class="form-label">Mã Nhân Viên</label>
        <input type="text" class="form-control" id="maNhanVien" name="maNhanVien" aria-describedby="maNhanVien_txt">
        <div id="maNhanVien_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="maKhachHang" class="form-label">Mã Khách Hàng</label>
        <input type="text" class="form-control" id="maKhachHang" name="maKhachHang" aria-describedby="maKhachHang_txt">
        <div id="maKhachHang_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="maDichVu" class="form-label">Mã Dịch Vụ</label>
        <input type="text" class="form-control" id="maDichVu" name="maDichVu" aria-describedby="maDichVu_txt">
        <div id="maDichVu_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>

