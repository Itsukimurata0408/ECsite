<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="${pageContext.request.contextPath}/css/user/navCss.css" rel="stylesheet" type="text/css" />
<body>
<footer>
<nav>
<div class=home>
<ul>
<li><a href="userMain.jsp">ホーム</a></li>
<li>支払方法について</li>
<li>お問い合わせ</li>
<li>返品について</li>
<li><a href="userDelivery.jsp">配送・送料について</a></li>
</ul>
</div>


<div class="user">
<ul>
<li><a href="userlogin.jsp">ユーザアカウント</a></li>
<li><a href="${pageContext.request.contextPath}/views/admin/loginAdmin.jsp">管理者アカウント</a></li>
</ul>
</div>


<div class="other">
<ul>
<li><a href="userPrivacy.jsp">プライバシーポリシー</a></li>
<li>特定商法取引法に基づく表記</li>
</ul>
</div>


</nav>
</footer>
</body>
</html>