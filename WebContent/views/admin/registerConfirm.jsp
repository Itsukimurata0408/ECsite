<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品情報登録確認</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin/adminConfirm.css">
</head>
<body>
<header>
		<h4>商品情報登録確認</h4>
		<button type="button" onclick="history.back()">←</button>
	</header>

<main>
<form action="/ECsite/registerAdminServlet" method="post">
<c:forEach var="rp" items="${product}">
<table border="1">
<tr>
<th class="top" colspan="2">確認</th>
</tr>

<tr>
<td class="title" >品名</td>
<td ><input  type="hidden" name="name" value="${rp.name }" >${rp.name }</td>

</tr>
<tr>
<td class="title" >画像</td>
<td ><input type="hidden" name="image" value="${rp.image }" >${rp.image }</td>

</tr>
<tr>
<td class="title" >カテゴリ</td>
<td><input type="hidden" name="category" value="${rp.category }" >${rp.category }</td>

</tr>
<tr>
<td class="title">値段</td>
<td ><input type="hidden" name="price" value="${rp.price }" >${rp.price }</td>

</tr>
<tr>
<td class="title">詳細説明文</td>
<td><input type="hidden" name="detail" value="${rp.detail }">${rp.detail }</td>

</tr>
</table>
		<p>
		<input type="submit" value="登録">
		</p>
</c:forEach>
	</form>
</main>
</body>
</html>