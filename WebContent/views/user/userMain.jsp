<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html>
<head>

<link href="${pageContext.request.contextPath}/css/user/userMainCss.css"
	rel="stylesheet" type="text/css" />
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/user/userHeader.css">
<meta charset="UTF-8">


<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script type="text/javascript">
	$(function() {
		$('#select').change(function() {
			var val = $('select option:selected').val();
			if (val == 'select')
				return;
			$('section').fadeOut();
			$('section#' + val).fadeIn();
		});
	});
</script>
<%--cssの宣言--%>

<title>宮城県特産品通販サイト</title>
</head>


<body>


	<header>
		<jsp:include page="userHeader.jsp"/>
	</header>

	<img src="${pageContext.request.contextPath}/img/table.jpeg"
		class="main_photo">
	<main class="explanation">
		<!-- 軽めな県紹介 -->
		<h2>ABOUT</h2>

		<div class="ex">
			<p>笑顔咲くたび 伊達な旅</p>
			<p>海にも山にも囲まれている宮城県</p>
			<p>日本中 世界中の皆様へ自慢の特産品で笑顔をお届けします</p>
		</div>




		<hr width="800">

		<div class="main">
			<c:forEach var="product" items="${productList}">
				<table>
					<div class="product">
						<tr>
							<td><img src="${product.image}">
							<td class="name">${product.name}</td>
							<td class="category">${product.category}</td>
							<td class="price">${product.price}円</td>
							<td class="detail">${product.detail}</td>
							<td class="id">
								<a href="UserCartAdd.action?id=${product.id}">カートに追加</a>
							</td>


						</tr>

					</div>
				</table>
			</c:forEach>



		</div>

		<footer>
			<%@ include file="userFooter.jsp"%>
		</footer>
	</main>
</body>


</html>