<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <style>
        #header{
            /*height: 46px;*/
            /*background-color: black;*/
        }
        .circle-image{
            margin-top: 10px;
            margin-left: 55px;
            display: inline-block;
            width: 40px;
            height: 40px;
        }
        .circle-image img{
            object-fit: cover;
            width: 100%;
            height: 100%;
            border-radius: 10%;
        }
        p{
            margin-top: 10px;
            margin-left: 1300px;
            display: inline-block;
        }
        .nav-item{
            margin-right: 20px;
        }
        #left-content{
            float: left;
            width: 30%;
        }
        #right-content{
            float: right;
            width: 70%;
        }

    </style>
</head>
<body>
<div id="header">
    <div class="circle-image">
        <img src="https://i.pinimg.com/564x/fb/d1/f0/fbd1f081e6253fdee9fcc28df4bceba3.jpg">
    </div>
    <p>Gojou Satoru</p>
</div>
<hr  width="100%" size="5px" align="center" />
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Employee</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Service</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Contract</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<hr  width="100%" size="5px" align="center" />
<div id="content">
    <div id="left-content">
        <ul>
            <li>Item 1</li>
            <li>Item 2</li>
            <li>Item 3</li>
        </ul>
    </div>
    <div id="right-content">

    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
        crossorigin="anonymous">
</script>
</body>
</html>