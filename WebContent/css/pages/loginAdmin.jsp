<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>login</h1>
<form action="/ECsite/loginAdminServlet" method="post">


		 <p>${Emsg}</p>


	<p>
	<a>username</a><input type="text" name="username">
	</p>

	<p>
	<a>password</a><input type="password" name="password">
	</p>

	<p>
	<input type="submit" value="ログイン" class="button">
	</p>

</form>

</body>
</html>