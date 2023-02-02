<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script>
	 var result = '${msg}';
		if (result == 'success') {
			alert("처리가 완료되었습니다.");
		}
	</script>
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
<h1>select All</h1>
  <table id='drug' width=100% border="1">
	<tr>
		<th style="width: 10px">pn</th>
		<th style="width: 10px">name</th>
		<th style="width: 10px">price</th>
		<th style="width: 10px">origin</th>
		<th style="width: 10px">category</th>
		<th style="width: 10px">content</th>
		<th style="width: 10px">inventory</th>
		<th style="width: 10px">sellable</th>
		<th style="width: 10px">regdate</th>
		<th style="width: 10px">ps</th>
		
	</tr>
	<c:forEach items="${list}" var="dto">	
		<tr>
			<td>${dto.pn }</td>
			<td><a href="/ex/selectName${pageMaker.makeSearch()}&name=${dto.name}">${dto.name }</a></td>
			<td>${dto.price }</td>
			<td>${dto.origin }</td>
			<td>${dto.category }</td>
			<td>${dto.content }</td>
			<td>${dto.inventory }</td>
			<td>${dto.sellable }</td>
			<td>${dto.regdate }</td>
			<td>${dto.ps }</td>
		</tr>
					
	</c:forEach>
    </table>
	<a href="/ex/insert">상품 등록</a>
	
	
	
	<div class="pagination">
    	<c:if test="${pageMaker.page !=1}">
    		<a href='selectAll${pageMaker.makeSearch(1)}'>&laquo;</a>
    	</c:if>
    	<!-- 앞전 page 모양을 클릭하면 pageMarker.startPage에 -1을 처리해준다.-->
    	<c:if test="${pageMaker.prev }">
    		<a href='selectAll${pageMaker.makeSearch(pageMaker.startPage-1)}'>&lt;</a>
    	</c:if>
    	
    	<c:forEach begin="${pageMaker.startPage }" end="${ pageMaker.endPage}" var="idx">
    		<a href='selectAll${pageMaker.makeSearch(idx)}' 
    		 <c:out value="${pageMaker.page==idx?' class=active ':'' }"/> >
    		 ${idx}</a>
    	</c:forEach>
    	
    	<%--<a href='#'>1</a>
    	 <a href='selectAll${pageMaker.makeSearch(2)}'>2</a>
    	<a href='#' class="active">3</a> --%>
    	
    	<c:if test="${pageMaker.next }">
    		<a href='selectAll${pageMaker.makeSearch(pageMaker.endPage+1)}'>&gt;</a>
    		
    	</c:if>
    	
    	
    	<c:if test="${pageMaker.page != pageMaker.totalEndPage}">
    		<a href='selectAll${pageMaker.makeSearch(pageMaker.totalEndPage)}'>&raquo;</a>
    	</c:if>
    	
    </div>
</body>
</html>