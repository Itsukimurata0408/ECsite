<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者TOPメニュー</title>
<link rel="stylesheet" type="text/css"
	href="../../css/admin/adminMenu.css">
</head>

<body>

	<header>
		<h4>管理者メニュー</h4>
		<div class="back">
			<button type="button" onclick="history.back()">←</button>
		</div>
	</header>

	<main>

		<h1>管理者メニュー画面</h1>

		<div class="menu">
			<p class="regist">
				<button type="button">商品情報登録</button>
			</p>

			<form action="/ECsite/ListProductServlet" method="post">
				<p class="delete">
					<button type="submit" name="List" value="delete">商品情報削除</button>
				</p>
			</form>

			<p class="update">
				<button type="button">商品情報変更</button>
			</p>
		</div>

	</main>

</body>

</html>