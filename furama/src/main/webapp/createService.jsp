<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form method="post" action="/service?action=create">
    <div class="mb-3">
        <label for="maDV" class="form-label">Mã Dịch Vụ</label>
        <input type="text" class="form-control" id="maDV" name="maDV" aria-describedby="maDV_txt">
        <div id="maDV_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="tenDV" class="form-label">Tên Dịch Vụ</label>
        <input type="text" class="form-control" id="tenDV" name="tenDV" aria-describedby="tenDV_txt">
        <div id="tenDV_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="dienTich" class="form-label">Diện Tích</label>
        <input type="text" class="form-control" id="dienTich" name="dienTich" aria-describedby="dienTich_txt">
        <div id="dienTich_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="chiPhi" class="form-label">Chi Phí</label>
        <input type="text" class="form-control" id="chiPhi" name="chiPhi" aria-describedby="chiPhi_txt">
        <div id="chiPhi_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="soNguoiToiDa" class="form-label">Số Người Tối Đa</label>
        <input type="text" class="form-control" id="soNguoiToiDa" name="soNguoiToiDa" aria-describedby="soNguoiToiDa_txt">
        <div id="soNguoiToiDa_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="maKieuThue" class="form-label">Mã Kiểu Thuê</label>
        <input type="text" class="form-control" id="maKieuThue" name="maKieuThue" aria-describedby="maKieuThue_txt">
        <div id="maKieuThue_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="maLoaiDV" class="form-label">Mã Loại Dịch Vụ</label>
        <input type="maLoaiDV" class="form-control" id="maLoaiDV" name="maLoaiDV" aria-describedby="maLoaiDV_txt">
        <div id="maLoaiDV_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="tieuChuanPhong" class="form-label">Tiêu Chuẩn Phòng</label>
        <input type="text" class="form-control" id="tieuChuanPhong" name="tieuChuanPhong" aria-describedby="tieuChuanPhong_txt">
        <div id="tieuChuanPhong_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="moTa" class="form-label">Mô Tả</label>
        <input type="text" class="form-control" id="moTa" name="moTa" aria-describedby="moTa_txt">
        <div id="moTa_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="dienTichHoBoi" class="form-label">Diện Tích Hồ Bơi</label>
        <input type="text" class="form-control" id="dienTichHoBoi" name="dienTichHoBoi" aria-describedby="dienTichHoBoi_txt">
        <div id="dienTichHoBoi_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="soTang" class="form-label">Số Tầng</label>
        <input type="text" class="form-control" id="soTang" name="soTang" aria-describedby="soTang_txt">
        <div id="soTang_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
