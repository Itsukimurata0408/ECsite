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
<form action="/ECsite/changeProductServlet" method="get">
<c:forEach var="rp" items="${product}">
<table border="1">
<tr>
<th align="center"colspan="2">確認</th>
</tr>

<tr>
<td bgcolor="#99CC00">ID</td>
<td bgcolor="#FFFFFF" ><input type="text" name="id" value="${rp.id }" readonly></td>

<tr>
<td bgcolor="#99CC00">品名</td>
<td bgcolor="#FFFFFF" ><input type="text" name="name" value="${rp.name }" readonly></td>

</tr>
<tr>
<td bgcolor="#99CC00" >画像</td>
<td bgcolor="#FFFFFF" ><input type="text" name="image" value="${rp.image }" readonly></td>

</tr>
<tr>
<td bgcolor="#99CC00" >カテゴリ</td>
<td bgcolor="#FFFFFF" ><input type="text" name="category" value="${rp.category }" readonly></td>

</tr>
<tr>
<td bgcolor="#99CC00" >値段</td>
<td bgcolor="#FFFFFF" ><input type="text" name="price" value="${rp.price }" readonly></td>

</tr>
<tr>
<td bgcolor="#99CC00" >詳細説明文</td>
<td bgcolor="#FFFFFF" ><input type="text" name="detail" value="${rp.detail }" readonly></td>

</tr>
</table>
		<p>
		<input type="submit" value="登録">
		</p>
</c:forEach>
	</form>
</body>
</html>