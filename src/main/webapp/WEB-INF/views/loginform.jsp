<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>loginform</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" charset="utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../css/board.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="header.jsp"%>

<div class="container">
    <h2>loginform</h2>
    <form action="/login" method="post">
        <div class="form-group">
            <input type="comment" class="form-control" id="email" placeholder="Enter email" name="email">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" id="passwd1" placeholder="Enter passwd" name="passwd">
        </div>
        <button type="submit">login</button>
    </form>
</div>



</body>
</html>
