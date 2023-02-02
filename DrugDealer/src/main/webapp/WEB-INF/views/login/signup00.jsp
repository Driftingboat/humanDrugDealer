<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/ex/login/signup" method="POST">
	
	<label for="id">ID : </label>
	<input type="text" id="id" name="id"><br>
	
	<label for="pw">PW : </label>
	<input type="text" id="pw" name="pw"><br>
	
	<label for="name">NAME : </label>
	<input type="text" name="name"><br>
	
	<label for="email">email : </label>
	<input type="text" name="email"><br>
	
	<label for="address">Address : </label>
	<input type="text" name="address"><br>
	
	<label for="phone">PHONE : </label>
	<input type="text" name="phone"><br>
	
	<input type="hidden" name="useyn" value="1"><br>

	<button type ="submit">가입</button><br>
	</form>
</body>
</html>