
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}
#customers tr:nth-child(even){background-color: #f2f2f2;}
#customers tr:hover {background-color: #ddd;}
#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>
  <h1>select name</h1>
  <table id='drug' width=100% border="1">
	<tr>
	   	<th style="width: 10px">pn</th>
		<th style="width: 10px">name</th>
		<th style="width: 100px">price</th>
		<th style="width: 200px">origin</th>
		<th style="width: 40px">category</th>
		<th style="width: 10px">inventory</th>
		<th style="width: 10px">sellable</th>
		<th style="width: 10px">regdate</th>
		<th style="width: 10px">ps</th>
	</tr>
		<tr>

			<td>${dto.pn }</td>
			<td>${dto.name }</td>
			<td>${dto.price }</td>
			<td>${dto.origin }</td>
			<td>${dto.category }</td>
			<td>${dto.inventory }</td>
			<td>${dto.sellable }</td>
			<td>${dto.regdate }</td>
			<td>${dto.ps }</td>
			
	</table>
	<a href='/ex/update?pn=${dto.pn}&name=${dto.name }&price=${dto.price }&origin=${dto.origin }&category=${dto.category }&inventory=${dto.inventory}&sellable=${dto.sellable}&ps=${dto.ps}' >수정</a>
	<a href="/ex/delete?pn=${dto.pn }">삭제</a>

</body>
</html>
