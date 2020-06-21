<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>




<c:forEach var="sp" items="${select}">
	<form action="/ECsite/registerAdminServlet" method="get">
		<p>${sp.id }</p>
		<p>${sp.name }</p>
	</form>
</c:forEach>


</body>
</html>