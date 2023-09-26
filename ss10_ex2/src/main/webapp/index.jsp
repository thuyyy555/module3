<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="${pageContext.request.contextPath}/display-calculator" method="post">
    <input type="text" name="firstOperand" placeholder="Enter first operand">
    <select id="operators" name="operators">
        <option value="addition">Addition</option>
        <option value="subtraction">Subtraction</option>
        <option value="multiplication">Multiplication</option>
        <option value="division">Division</option>
    </select>
    <input type="text" name="secondOperand" placeholder="Enter second operand">
    <input type="submit" id="calculator" value="Calculate">
</form>
</body>
</html>