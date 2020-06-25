<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="jp.co.aforce.beans.ProductDetailBean"%>

<!DOCTYPE html>
<html>
<head>
<link href="../../css/user/userMainCss.css" rel="stylesheet"
	type="text/css" />
<meta charset="UTF-8">
<title>宮城県特産品通販サイト</title>
</head>
<body>
	<header>

		<!-- useHheader.jspに移動 -->
		<div class="header">
			<!-- ユーザーアイコン -->
			<a href=""><img src="../../img/human_icon.png"></a>

			<!-- カートアイコン -->
			<a href="userCart.jsp"><img src="../../img/cart_icon.png"></a>

			<!-- 検索欄 -->
			<form action="/ECsite/loginAdminServlet">
				<div class="sample3Area">
					<input type="text" class="sample3Text">
					<div class="sample3Button" onclick="goSearch()">
						<img src="../../img/glass_icon.png" class="sample3Img">
					</div>
				</div>
			</form>
		</div>

		<div class="top_photo">
			<img src="../img/sample_photo.jpg">
		</div>

		<!-- include file="userHeader.jsp"-->
		<!-- TODO カートの表示 -->

	</header>

	<main>
		<!-- 軽めな県紹介 -->
		<h2>ABOUT</h2>
		<p>笑顔咲くたび 伊達な旅</p>
		<p>海にも山にも囲まれている宮城県</p>
		<p>日本中 世界中の皆様へ自慢の特産品で笑顔をお届けします</p>


		<!-- おすすめ商品 -->


		<h2>RECOMMEND ITEM</h2>


		<c:forEach items="${product}" var="pd">
    <tr>
      <td>${pd.id}</td>
      <td>${pd.name}</td>
    </tr>
    </c:forEach>



		<table>
			<c:forEach var="pu" items="${select}">
				<p>${pu.id }</p>
				<p>${pu.name }</p>
				<p>${pu.image }</p>
				<p>${pu.category }</p>
				<p>${pu.price }</p>
				<p>${pu.detail }</p>
				<a href="UserCartAddServlet.action?id=${pu.id}">カートに追加</a>
			</c:forEach>

		</table>
		<footer>
			<%@ include file="userFooter.jsp"%>
		</footer>
	</main>
</body>
</html>
