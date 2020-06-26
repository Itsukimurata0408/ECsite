<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者TOPメニュー</title>
<link rel="stylesheet" type="text/css" href="../../css/admin/adminMenu.css">
</head>

<body>

	<header>
		<h4>管理者メニュー</h4>
		<button type="button" onclick="history.back()">←</button>
	</header>

	<main>

		<h1>管理者メニュー画面</h1>


		<p class="regist">
			<input type="button" value="商品情報登録" onclick="location.href=''">
		</p>

		<p class="delete">
		<form action="/ECsite/ListProductServlet" method="post">
			<button type="submit" name="List" value="delete">商品情報削除</button>
		</form>

		<p class="update">
			<input type="button" value="商品情報変更" onclick="location.href=''">
		</p>


	</main>

</body>

</html>