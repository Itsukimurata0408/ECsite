<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="item_bean" scope="session"
	class="jp.co.aforce.beans.ItemBean" />
<jsp:useBean id="product_bean" scope="session"
	class="jp.co.aforce.beans.ProductBean" />

<!-- 購入確認画面 -->
<!DOCTYPE html>
<html>
<head>
<title>購入確認画面</title>
<link href="${pageContext.request.contextPath}/css/user/userShoppingCss.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<h3>次の商品を購入しますか？</h3>
	<main>
	<div class=main>
	<form action="/ECsite/UserShopping" method="get">

		<!-- リクエストから表示する値を取得 -->
				<p><jsp:getProperty name="item_bean" property="product"></jsp:getProperty></p>
				<p><jsp:getProperty name="item_bean" property="count"></jsp:getProperty></p>
				<P><jsp:getProperty name="product_bean" property="price"></jsp:getProperty></P>
				<p><%=request.getAttribute("count")%></p>

				<div class="button">
					<input class="back_button" type="button"
						onclick="location.href='userMain.jsp'" value="買い物を続ける">
						<input class="result_button" type="submit" value="購入を確定する">
				</div>
			</form>
		</div>
	</main>
</body>
</html>