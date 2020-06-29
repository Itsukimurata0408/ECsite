<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品詳細変更</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin/adminSelect.css">
</head>
<body>

<header>
		<h4>商品詳細変更</h4>
		<button type="button" onclick="history.back()">←</button>
	</header>

<main>
<p>${nf } </p>


<div>
<c:forEach var="sp" items="${select}">
	<form action="/ECsite/registerAdminServlet" method="get">
		<p>${sp.id }</p>
		<p>${sp.name }</p>
	</form>
</c:forEach>
</div>
</main>

</body>
</html>