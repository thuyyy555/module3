<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form method="post" action="/customer?action=update">
    <div class="mb-3">
        <label for="maKH" class="form-label">Mã Khách Hàng</label>
        <input type="text" class="form-control" id="maKH" name="maKH" aria-describedby="maKH_txt" value="${customer.maKhachHang}" readonly>
        <div id="maKH_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="maLK" class="form-label">Mã Loại Khách</label>
        <input type="text" class="form-control" id="maLK" name="maLK" aria-describedby="maLK_txt" value="${customer.maLoaiKhach}">
        <div id="maLK_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="hoTen" class="form-label">Họ Tên</label>
        <input type="text" class="form-control" id="hoTen" name="hoTen" aria-describedby="hoTen_txt" value="${customer.hoTenKhachHang}">
        <div id="hoTen_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="ngaySinh" class="form-label">Ngày Sinh</label>
        <input type="date" class="form-control" id="ngaySinh" name="ngaySinh" aria-describedby="ngaySinh_txt" value="${customer.ngaySinhKH}">
        <div id="ngaySinh_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <div class="form-check">
            <input class="form-check-input" type="radio" value="male" name="gioiTinh" id="flexRadioDefault1" ${customer.gioiTinh == male ? "checked" : ""}>
            <label class="form-check-label" for="flexRadioDefault1">
                Nam
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" value="female" name="gioiTinh" id="flexRadioDefault2" ${customer.gioiTinh == female ? "checked" : ""}>
            <label class="form-check-label" for="flexRadioDefault2">
                Nữ
            </label>
        </div>
    </div>
    <div class="mb-3">
        <label for="cmnd" class="form-label">CMND</label>
        <input type="text" class="form-control" id="cmnd" name="cmnd" aria-describedby="cmnd_txt" value="${customer.chungMinh}">
        <div id="cmnd_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="sdt" class="form-label">Số Điện Thoại</label>
        <input type="text" class="form-control" id="sdt" name="sdt" aria-describedby="sdt_txt" value="${customer.soDienThoai}">
        <div id="sdt_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="email" class="form-label">Email</label>
        <input type="email" class="form-control" id="email" name="email" aria-describedby="email_txt" value="${customer.email}">
        <div id="email_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="diaChi" class="form-label">Địa Chỉ</label>
        <input type="text" class="form-control" id="diaChi" name="diaChi" aria-describedby="diaChi_txt" value="${customer.diaChi}">
        <div id="diaChi_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>

