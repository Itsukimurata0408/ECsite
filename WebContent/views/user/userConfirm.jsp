<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="item_bean" scope="session"
	class="jp.co.aforce.beans.ItemBean" />
<jsp:useBean id="product_bean" scope="session"
	class="jp.co.aforce.beans.ProductBean" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="ItemBean" scope="session"
	class="jp.co.aforce.beans.ItemBean" />
<jsp:useBean id="ProductBean" scope="session"
	class="jp.co.aforce.beans.ProductBean" />

<!-- 購入確認画面 -->
<!DOCTYPE html>
<html>
<head>
<title>購入確認画面</title>
<link
	href="${pageContext.request.contextPath}/css/user/userShoppingCss.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<h3>次の商品を購入しますか？</h3>
	<main>
		<div class=main>
			<form action="Result.action" method="get">

				<c:forEach var="item" items="${cart}">

					<tr>
						<td><img src="img/${item.product.id}.jpg" width=110 height=82></td>
						<td>商品番号${item.product.id}</td>
						<td>商品名${item.product.name}</td>
						<td>金額${item.product.price}円</td>
						<td>個数${item.count}</td>
						<td><a href="UserCartRemoveServret?id=${item.product.id}">カートから削除</a></td>


						<%
							//小計を入れる変数の宣言
						int sum;
						sum = ProductBean.getPrice() * ItemBean.getCount();
						//セッションスコープに小計金額を格納
						session.setAttribute("sum", sum);
						//送料を入れる変数宣言
						int postage = 400;
						//消費税をセッションスコープに格納
						session.setAttribute("postage", postage);
						//合計金額の表示
						int total;
						total = sum + postage;
						%>

						<%-- 合計金額を表示--%>

						<td>合計${total}</td>


					</tr>
				</c:forEach>
				<div class="button">
					<input class="back_button" type="button"
						onclick="location.href='userMain.jsp'" value="買い物を続ける"> <input
						class="result_button" type="submit" value="購入を確定する">
				</div>
			</form>
		</div>
	</main>
</body>
</html>
