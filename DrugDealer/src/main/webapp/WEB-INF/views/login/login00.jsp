%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="/login" action="/ex/login/login"" method="POST">
	<p>
		<label for="id">아이디</label>
		<input type="text" id="id" name="id">
	</p>
	<p>
		<label for="pw">비밀번호</label>
		<input type="text" id="pw" name="pw">
	</p>
	<button type="submit" class="btn">로그인</button> 
</form>

</body>
</html>