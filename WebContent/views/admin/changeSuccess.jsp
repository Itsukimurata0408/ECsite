
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品情報変更完了</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin/adminSelect.css">
</head>
<body>
<header>
		<h4>商品情報変更完了</h4>
		<button type="button" onclick="history.back()">←</button>
	</header>
<main>
<c:forEach var="cp" items="${update}">
<div>
		<p>${cp.id }</p>
		<p>${cp.name }</p>
		<p><img src="${cp.image }" height="100px" width="100px"></p>
		<p>${cp.category }</p>
		<p>${cp.price }</p>
		<p>${cp.detail }</p>
</div>
</c:forEach>
<input type="button" onclick="location.href='views/admin/adminMenu.jsp'" value="メニューへ">
</main>
</body>

</html>