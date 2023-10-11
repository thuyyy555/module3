<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form method="post" action="/contract?action=createContractDetail">
    <div class="mb-3">
        <label for="maHopDongChiTiet" class="form-label">Mã Hợp Đồng Chi Tiết</label>
        <input type="text" class="form-control" id="maHopDongChiTiet" name="maHopDongChiTiet" aria-describedby="maHopDongChiTiet_txt">
        <div id="maHopDongChiTiet_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="maHopDong" class="form-label">Mã Hợp Đồng</label>
        <input type="text" class="form-control" id="maHopDong" name="maHopDong" aria-describedby="maHopDong_txt">
        <div id="maHopDong_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="maDichVuDiKem" class="form-label">Mã Dịch Vụ Đi Kèm</label>
        <input type="text" class="form-control" id="maDichVuDiKem" name="maDichVuDiKem" aria-describedby="maDichVuDiKem_txt">
        <div id="maDichVuDiKem_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="soLuong" class="form-label">Số Lượng</label>
        <input type="text" class="form-control" id="soLuong" name="soLuong" aria-describedby="soLuong_txt">
        <div id="soLuong_txt" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>


