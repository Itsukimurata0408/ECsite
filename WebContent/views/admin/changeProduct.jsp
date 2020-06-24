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

		<p><a href="/ECsite/productDetailServlet?id=${sp.id }">${sp.id }${sp.name }</a></p>

</c:forEach>


</body>
</html>