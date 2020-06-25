<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>ユーザログイン画面</title>
</head>
<body>

	<h1>ログイン</h1>
	<!--formタグの設定-->
	<!--buttonもformタグ内に入れないと反応しないので注意する-->
	<!-- autocomplete="off"で入力履歴を表示しないようにできる -->
	<!--actionの後はweb.xmlで指定したものを記載-->
	<!--action="/プロジェクト名/url-patten" を書く-->
	<form action="/ECsite/UserLoginServlet" method="post"
		autocomplete="off">

		<!--ログインできなかった際にloginBeanのEmsgを表示-->
		<p class="text">${loginBean.getEmsg()}</p>
		<div class="form">
			<p>ユーザ名</p>
			<input type="text" name="username">


			<p>パスワード</p>

			<input type="password" name="password">


			<p>
				<button class="loginbotton" type="submit" class="button">ログイン</button>
		</div>
	</form>
</body>
</html>