<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<%--検索結果を表示するためのjsp--%>
<html>
<head>
<meta charset="UTF-8">

<title>検索結果表示</title>
</head>
<body>

<p>${notfind}</p>
<c:forEach var="number" items="${select}">

<%--検索結果をEL方式で表示 --%>
<table>

<tr>
		<td>商品ID：${number.id}</td>
		<td>商品名：${number.name}</td>
		<td>値段：${number.price}</td>
		<td>商品詳細：${number.detail}</td>
		<td><img src="./img/${number.image}"></td>
</tr>
</table>
</c:forEach>


</body>
</html>