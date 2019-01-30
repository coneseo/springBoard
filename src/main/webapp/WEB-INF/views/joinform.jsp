<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>joinform</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" charset="utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../css/board.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="header.jsp"%>

<div class="container">
    <h2>joinform</h2>
    <form action="/join" method="post">
        <div class="form-group">
            <input type="comment" class="form-control" id="name" placeholder="Enter name" name="name">
        </div>
        <div class="form-group">
            <input type="comment" class="form-control" id="nickname" placeholder="Enter nickname" name="nickname">
        </div>
        <div class="form-group">
            <input type="comment" class="form-control" id="email" placeholder="Enter email" name="email">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" id="passwd" placeholder="Enter passwd" name="passwd">
        </div>
        <%--<div class="form-group">--%>
            <%--<input type="password" class="form-control" id="passwd2" placeholder="Enter passwd2" name="passwd2">--%>
        <%--</div>--%>
        <button type="submit">join</button>
    </form>
</div>



</body>
</html>
