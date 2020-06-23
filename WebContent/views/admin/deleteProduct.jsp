<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品削除画面</title>
</head>

<body>
<table>
  <tr>
    <th>商品名</th>
    <th>画像</th>
    <th>カテゴリー</th>
    <th>価格</th>
    <th>商品詳細</th>
  </tr>
<c:forEach var="products" items="${productList}">
  <tr>
    <td><c:out value="${products.name}"/></td>
    <td><c:out value="${products.image}"/></td>
    <td><c:out value="${products.category}"/></td>
    <td><c:out value="${products.price}"/></td>
    <td><c:out value="${products.detail}"/></td>
  </tr>
</c:forEach>

</table>
<br/>
</body>
</html>