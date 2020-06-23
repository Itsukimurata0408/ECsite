<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 商品一覧画面 -->
<!DOCTYPE html>
<html>
<head>
<title>商品一覧画面</title>
<link href="css/userShoppingCss.css" rel="stylesheet" type="text/css" />
</head>
<body>
<!-- jsp:includeでヘッダー画面を読み込む -->
<jsp:include page="userHeader.jsp"></jsp:include>

    <main>
        <h1>商品一覧</h1>
    <!-- リクエストからBeanの配列取得 -->
    <% ArrayList<ItemBean> itemList = (ArrayList<ItemBean>) request.getAttribute("itemList"); %>

    <form action="./UserShoppingServlet">
        <div class="shopping_table">

                <!-- Beanテーブル作成 -->
                <% for (ItemBean bean : itemList) {%>
                <tr>
                    <%-- 商品ID --%>
                    <td><%= bean.getItemId()%></td>
                    <%-- 商品名 --%>
                    <td><%= bean.getItemName()%></td>
                    <%-- 価格 --%>
                    <td class="int"><%= bean.getPrice()%></td>
                    <%-- 数量（在庫） --%>
                    <td class="int"><%= bean.getQuantity()%></td>

                    <!-- 在庫が0の場合購入ボタンを表示しない -->
                    <% if (bean.getCount() != 0) {%>
                    <td>
                        <select class="list" name="<%= bean.getId()%>list">
                            <% for (int i = 0; i <= bean.getCount(); i++) {%>
                            <option value="<%= i%>"><%= i%></option>
                            <% }%>
                        </select>
                    </td>
                    <td class="button">
                        <input class="common_button" type="submit" value="購入" name="<%= bean.getId()%>">
                    </td>
                    <% } else { %>
                    <td class="button">売り切れ</td>
                    <% } %>
                </tr>
                <% }%>
            </tbody>
            </div>
        <a class="common_button" href="./">戻る</a>
    </form>
</main>
</body>
</html>