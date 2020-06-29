<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="item_bean" scope="session" class="jp.co.aforce.beans.ItemBean"/>
<jsp:useBean id="product_bean" scope="session" class="jp.co.aforce.beans.ProductBean"/>

<!-- 購入確認画面 -->
<!DOCTYPE html>
<html>
<head>
<title>購入確認画面</title>
<link href="../css/userShoppingCss.css" rel="stylesheet" type="text/css" />
</head>
<body>

<main>
    <h1>購入確認</h1>
    <p>次の商品を購入しますか？</p>

    <form action="/ECsite/UserShopping" method="get">
        <div class="shopping_table">

                    <!-- リクエストから表示する値を取得 -->
                    <jsp:getProperty name="item_bean" property="product"></jsp:getProperty>
                    <jsp:getProperty name="item_bean" property="count"></jsp:getProperty>
                    <jsp:getProperty name="product_bean" property="price"></jsp:getProperty>
                    <%=request.getAttribute("count")%>
                    <div class="button">
                        <input class="result_button" type="submit" value="購入する">

            </div>
            </div>

    </form>
		<input type="button" onclick="location.href='userMain.jsp'" value="買い物を続ける">

</main>
</body>
</html>
