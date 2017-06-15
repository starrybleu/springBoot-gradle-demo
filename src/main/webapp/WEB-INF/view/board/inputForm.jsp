<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="form" method="post" action="/springBoard/board/inputPro.sku">
		<table>
			<tr>
				<td>작성자</td>
				<td>
					<input type="text" id="writer" name="writer" />
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>
					<input type="text" id="title" name="title" />
				</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>
					<input type="text" id="body" name="body" />
				</td>
			</tr>
		
			<tr>
				<td colspan="2">
					<input type="submit" value="submit">
				</td>
			</tr>			
		</table>
	</form>
</body>
</html>