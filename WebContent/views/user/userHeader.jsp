<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="css/shopping.css" rel="stylesheet" type="text/css" />
<%-- header --%>
<header>

	<jsp:useBean id="loginBean" scope="session"
		class="jp.co.aforce.beans.LoginBean" />
	<!-- ログイン済みの場合は名前表示 ログインしていない段階では「ようこそゲストさん」
    	 beanの情報が必要
    	 TODO: 書き換え
    	  -->


	<p>ようこそ「${name}」さん</p>
	<p>
		<a href="usercart.jsp?submit=cart">カート</a> <a
			href="userlogin.jsp?submit=login">ログイン</a> <a
			href="UserLogoutServlet?submit=logout">ログアウト</a>
	</p>

</header>
