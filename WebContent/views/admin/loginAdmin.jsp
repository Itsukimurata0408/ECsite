<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>管理者ログイン</title>
<link rel="stylesheet" type="text/css" href="../../css/admin/loginAdmin.css">
</head>

<body>

	<header>
		<h4>管理者ログイン</h4>
		<button type="button" onclick="history.back()">←</button>
	</header>

	<main>
		<h1>login</h1>

		<form action="/ECsite/loginAdminServlet" method="post">

		 <p>${Emsg}</p>

			<p>
			<a>name        </a><input type="text" name="username">
			</p>

			<p>
			<a>password    </a><input type="password" name="password">
			</p>

			<p>
			<input type="submit" value="ログイン" class="button">
			</p>

		</form>
	</main>
</body>

</html>