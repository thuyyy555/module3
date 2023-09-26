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
<form method="post" action="?action=create">
    <div class="form-group row">
        <label for="id" class="col-sm-2 col-form-label">Mã mặt bằng:</label>
        <div class="col-sm-10">
            <input type="text" name="id" id="id" required>
        </div>
    </div>
    <div class="form-group row">
        <label for="dien_tich" class="col-sm-2 col-form-label">Diện tích:</label>
        <div class="col-sm-10">
            <input type="text" name="dien_tich" id="dien_tich" required>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Trạng thái:</label>
        <div class="col-sm-10">
            <select name="trang_thai">
                <option>Trống</option>
                <option>Hạ tầng</option>
                <option>Đầy đủ</option>
            </select></div>
        <br>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Tầng:</label>
        <div class="col-sm-10">
            <select name="tang">
                <option>1</option>
                <option>2</option>
                <option>3</option>
            </select></div>
        <br>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Loại văn phòng:</label>
        <div class="col-sm-10">
            <select name="loai_vp">
                <option>Văn phòng chia sẻ</option>
                <option>Văn phòng trọn gói</option>
            </select></div>
        <br>
    </div>
    <div class="form-group row">
        <label for="mo_ta" class="col-sm-2 col-form-label">Mô tả chi tiết:</label>
        <div class="col-sm-10">
            <input type="text" name="mo_ta" id="mo_ta" required>
        </div>
    </div>
    <div class="form-group row">
        <label for="gia" class="col-sm-2 col-form-label">Giá cho thuê:</label>
        <div class="col-sm-10">
            <input type="text" name="gia" id="gia" required>
        </div>
    </div>
    <div class="form-group row">
        <label for="ngay_bd" class="col-sm-2 col-form-label">Ngày bắt đầu:</label>
        <div class="col-sm-10">
            <input type="date" name="ngay_bd" id="ngay_bd" required>
        </div>
    </div>
    <div class="form-group row">
        <label for="ngay_kt" class="col-sm-2 col-form-label">Ngày kết thúc:</label>
        <div class="col-sm-10">
            <input type="date" name="ngay_kt" id="ngay_kt" required>
        </div>
    </div>
    <input type="submit" value="Lưu">
<%--    <button><a href="?action=display">-></a></button>--%>
    <button><a href="/">Hủy</a></button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
        crossorigin="anonymous"></script>
</body>
</html>