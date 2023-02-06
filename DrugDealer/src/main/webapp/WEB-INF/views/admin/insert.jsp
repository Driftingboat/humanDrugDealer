<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
insert
<form action="/ex/admin/insert" method="post">
id<input type="text" name=id >
pw<input type="text" name=pw >
ad_num<input type="text" name=ad_num >
<input type="submit" value="제출">
</form>
</body>
</html>