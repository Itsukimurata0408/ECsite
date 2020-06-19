<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--<c:choose>を使用するためにjstlを利用宣言--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%--ユーザがカートに商品を入れた際のページを表示--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
				<td><img src="img/${itemBean.product.id}.jpg" width=110
					height=82></td>
				<td>商品番号${itemBean.product.id}</td>
				<td>商品名${itemBean.product.name}</td>
				<td>金額${itemBean.product.price}円</td>
				<td>個数${itemBean.count}</td>
				<td><a href="UserCartRemoveServret?id=${itemBean.product.id}">カートから削除</a></td>

			</tr>
			<%-- 合計金額を表示--%>
			<td>小計</td>
			<td>合計</td>
			<tr>
			</tr>
		</c:forEach>
	</table>

</body>
</html>