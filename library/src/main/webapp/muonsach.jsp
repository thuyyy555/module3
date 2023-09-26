<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body onload="autoFill()">
<form>
    Mã mượn sách: <input type="text" name="ma_muon" id="dataInput" onkeyup="validateData()">
    <div id="z-dataInput"></div>
    <label for="tenSachInput">Tên sách:</label>
    <input type="text" id="tenSachInput" readonly><br>
    Tên học sinh:   <select><option value="tenHs">${hocsinh.hoTen}</option></select>
    Ngày mượn sách: <input type="date" value="2023-08-30"/><br>
    Ngày trả sách <input type="date" value="2023-08-30"/>
    <button>Mượn sách</button>
    <button>Hủy</button>
</form>
<script>
  function autoFill() {
    var tenSach = '<%= request.getParameter("tenSach") %>';
    document.getElementById("tenSachInput").value = tenSach;
  }

  function validateData() {
    var dataInput = document.getElementById('dataInput').value;

    if (dataInput === '') {
      document.getElementById('result').innerText = 'Vui lòng nhập dữ liệu.';
    } else {
      var pattern = /^MS-[0-9]{4}$/;
      if (pattern.test(dataInput)) {
        document.getElementById('z-dataInput').innerText = 'Dữ liệu hợp lệ.';
      } else {
        document.getElementById('z-dataInput').innerText = 'Dữ liệu không hợp lệ. Vui lòng nhập lại.';
      }
    }
  }
</script>
</body>
</html>

<%--public Map<String,String> update(HouseHould crHouse){--%>
<%--Map<String, String> map = new HashMap<String, String>();--%>

<%--if(crHouse.getName_p().isEmpty()){--%>
<%--map.put("name_p", "tên không được để trống!!!!!");--%>
<%--}--%>
<%--else if(crHouse.getName_p().length()<=3){--%>
<%--map.put("name_p", "Tên bé hơn 3 ký tự!!!");--%>
<%--}--%>
<%--else if(crHouse.getName_p().length()>50){--%>
<%--map.put("name_p", "tên ít hơn 50 ký tự!!!!!");--%>
<%--}--%>
<%--else if(crHouse.getName_p().matches("^[a-zA-Z]*")){--%>
<%--map.put("name_p","tên ko chứa ký tự số!!!!!");--%>
<%--}--%>
<%--if(map.isEmpty()){--%>
<%--houseHoldRepository.Update(crHouse);--%>
<%--}--%>
<%--return map;--%>
<%--}--%>