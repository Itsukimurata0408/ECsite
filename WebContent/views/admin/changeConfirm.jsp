<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品詳細変更確認</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin/adminConfirm.css">
</head>
<body>
<header>
		<h4>商品詳細変更確認</h4>
		<button type="button" onclick="history.back()">←</button>
	</header>

<main>
<form action="/ECsite/changeProductServlet" method="get">
<c:forEach var="rp" items="${product}">
<table border="1">
<tr>
<th class="top" colspan="2">確認</th>
</tr>

<tr>
<td class="title">ID</td>
<td ><input type="hidden" name="id" value="${rp.id }" readonly>${rp.id }</td>

<tr>
<td class="title">品名</td>
<td><input type="hidden" name="name" value="${rp.name }" readonly>${rp.name }</td>

</tr>
<tr>
<td class="title" >画像</td>
<td ><input type="hidden" name="image" value="${rp.image }" readonly>${rp.image }</td>

</tr>
<tr>
<td class="title" >カテゴリ</td>
<td ><input type="hidden" name="category" value="${rp.category }" readonly>${rp.category }</td>

</tr>
<tr>
<td class="title" >値段</td>
<td ><input type="hidden" name="price" value="${rp.price }" readonly>${rp.price }</td>

</tr>
<tr>
<td class="title">詳細説明文</td>
<td ><input type="hidden" name="detail" value="${rp.detail }" readonly>${rp.detail }</td>

</tr>
</table>
		<p>
		<input type="submit" value="変更">
		</p>
</c:forEach>
	</form>
	</main>
</body>
</html>
