<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--<c:choose>を使用するためにjstlを利用宣言--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="ItemBean" scope="session"
	class="jp.co.aforce.beans.ItemBean" />

<jsp:useBean id="ProductBean" scope="session"
	class="jp.co.aforce.beans.ProductBean" />

<%--ユーザがカートに商品を入れた際のページを表示--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カート内</title>
</head>
<body>

	<%--条件により多分岐するタグ--%>
	<c:choose>

		<%--カートに商品が入っているかの確認 --%>
		<c:when test="${cart.size()>0}">

			<%--カートに商品が入っている場合 --%>
			<%--EL方式でカートに何種類の商品が入っているかを表示 --%>
			<p>現在${cart.size()}種類の商品がカートに入っています</p>
		</c:when>

		<%--カートに商品が入っていない場合--%>
		<c:otherwise>
			<p>カートに商品が入っていません</p>

		</c:otherwise>
	</c:choose>

	<table>
		<c:forEach var="item" items="${cart}">

			<tr>
				<td><img src="img/${item.product.id}.jpg" width=110
					height=82></td>
				<td>商品番号${item.product.id}</td>
				<td>商品名${item.product.name}</td>
				<td>金額${item.product.price}円</td>
				<td>個数${item.count}</td>
				<td><a href="UserCartRemoveServret?id=${item.product.id}">カートから削除</a></td>


				<%
				//小計を入れる変数の宣言
				int sum;
				sum = ProductBean.getPrice()* ItemBean.getCount();
				//セッションスコープに小計金額を格納
				session.setAttribute("sum",sum);
				//送料を入れる変数宣言
				int postage = 400;
				//消費税をセッションスコープに格納
				session.setAttribute("postage",postage);
				//合計金額の表示
				int total ;
				total = sum + postage;
				%>

				<%-- 合計金額を表示--%>

				<td>小計${sum}</td>
				<td>送料${postage}</td>
				<td>合計${total}</td>


			</tr>
		</c:forEach>
	</table>
	<a href="UserShopping.action">購入確認へ進む</a>

</body>
</html>