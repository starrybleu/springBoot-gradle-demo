<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1>LIST</h1>
    LIST 테스트 중 <br/>
    ${list}
<table border="1">
    <thead>
    <tr>
        <th>userid</th>
        <th>password</th>
        <th>수정</th>
        <th>삭제</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="data" items="${list}">
        <tr>
            <td>${data.userid}</td>
            <td>${data.password}</td>
            <td><a href="./modify/${data.userid}">수정</a></td>
            <td><a href="./delete/${data.userid}">삭제</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="./add">추가</a>
</body>
</html>