<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="cp" items="${update}">
成功
		<p>${cp.id }</p>
		<p>${cp.name }</p>
		<p>${cp.image }</p>
		<p>${cp.category }</p>
		<p>${cp.price }</p>
		<p>${cp.detail }</p>
</c:forEach>
</body>
</html>