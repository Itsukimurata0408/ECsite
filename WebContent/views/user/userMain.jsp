<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<head>

<link href="${pageContext.request.contextPath}/css/user/userMainCss.css"
	rel="stylesheet" type="text/css" />
<meta charset="UTF-8">


<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>




<title>宮城県特産品通販サイト</title>
</head>


<body>


	<header>
		<!-- %@ include file="userHeader.jsp"%-->
	</header>

	<img src="${pageContext.request.contextPath}/img/table.jpeg"
		class="main_photo">
	<main>
		<!-- 軽めな県紹介 -->
		<h2>ABOUT</h2>
		<p>笑顔咲くたび 伊達な旅</p>
		<p>海にも山にも囲まれている宮城県</p>
		<p>日本中 世界中の皆様へ自慢の特産品で笑顔をお届けします</p>


		<h2>RECOMMEND ITEM</h2>


		<div class="main">
				<table>
					<c:forEach var="products" items="${productList}">
					<div class="product">
					<tr>

							<td class="img">
								<!-- img src="${products.image}"-->
								<img src="${pageContext.request.contextPath}/img/zunda.jpg">
							</td>
							<td class="name">${products.name}</td>
							<td class="category">${products.category}</td>
							<td class="price">${products.price}円</td>
							<td class="detail">${products.detail}</td>

							<td class="id">
								<button type="submit" name="List" value="menu"
									id="${products.id}">カートへ入れる</button>
							</td>


						</tr>

						</div>
					</c:forEach>

				</table>
			</div>

		<footer>
			<%@ include file="userFooter.jsp"%>
		</footer>
	</main>
</body>


</html>
