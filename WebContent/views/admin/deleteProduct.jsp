<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品削除画面</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/admin/deleteProduct.css">
</head>

<body>

	<header>
		<h4>商品削除画面</h4>
		<div class="back">
			<button type="button" onclick="history.back()">←</button>
		</div>
	</header>

	<main>

		<h1>商品削除画面</h1>

		<p>${Smsg}</p>
		<p>${Emsg}</p>
		<div class="menu">
			<form action="/ECsite/DeleteProductServlet" method="get">

				<table>
					<tr>
						<th>選択</th>
						<th>商品ID</th>
						<th>商品名</th>
						<th>画像</th>
						<th>カテゴリー</th>
						<th>価格</th>
						<th>商品詳細</th>
					</tr>
					<div class="list">
						<c:forEach var="product" items="${productList}">
							<tr>
								<td><input type="checkbox" name="delete"
									value=${product.product_id}></td>
								<td>${product.product_id}</td>
								<td>${product.name}</td>
								<td>${product.image}</td>
								<td>${product.category}</td>
								<td>${product.price}</td>
								<td>${product.detail}</td>


							</tr>
						</c:forEach>

					</div>
				</table>

				<div class="button">
					<button type="submit">削除</button>
				</div>
			</form>
		</div>

	</main>
</body>

</html>