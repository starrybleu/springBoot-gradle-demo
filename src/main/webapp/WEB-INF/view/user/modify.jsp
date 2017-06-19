<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>MODIFY</title>
</head>
<body>
<h1>MODIFY</h1>
<form action="/user/modify" method="post">
    <label>userid</label> <input type="text" name="userid" value="${data.userid}"><br>
    <label>password</label> <input type="text" name="password" value="${data.password}"><br>
    <input type="submit" value="modify">
</form>
</body>
</html>