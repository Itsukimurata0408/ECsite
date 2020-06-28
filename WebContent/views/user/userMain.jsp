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


	<header> </header>
	<main>
		<!-- 軽めな県紹介 -->
		<h2>ABOUT</h2>
		<p>笑顔咲くたび 伊達な旅</p>
		<p>海にも山にも囲まれている宮城県</p>
		<p>日本中 世界中の皆様へ自慢の特産品で笑顔をお届けします</p>


		<h2>RECOMMEND ITEM</h2>


		<table>

			<div class="main">
				<c:forEach var="products" items="${productList}">
					<tr>

						<p>
							<img src="${pageContext.request.contextPath}/img/zunda.jpg">
						</p>
						<p>${products.name}</p>
						<p>${products.category}</p>
						<p>${products.price}</p>
						<p>${products.detail}</p>
						<form action="/ECsite/ListProductServlet" method="post">
							<p>
								<button type="submit" name="List" value="menu"
									id="${products.id}"></button>
							</p>
						</form>


					</tr>
				</c:forEach>
			</div>
		</table>

		<footer>
			<%@ include file="userFooter.jsp"%>
		</footer>
	</main>
</body>


</html>
