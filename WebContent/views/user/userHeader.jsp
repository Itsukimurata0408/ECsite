<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- header --%>
<header>

	<%--EL方式でログインされた場合にusernameを表示--%>
	<p>ようこそ「${name}」さん</p>
	<p>
	<a href="ListProduct.action">商品</a>
		<a href="UserCartAdd.action">カート</a> <a
			href="/ECsite/UserLoginServlet?submit=login">ログイン</a> <a
			href="/ECsite/UserLogoutServlet?submit=logout">ログアウト</a>
	</p>
	<p>
		<select id="select" name="choice">
			<option value="choice">選択してください</option>
			<option value="name">商品名</option>
			<option value="category">カテゴリ</option>
		</select>
	</p>
	<section id="name" >
		<form action="/ECsite/UserProductSearchServlet" method="get">
			商品名:<input type="text" name="search"> <input type="submit"
				value="検索" class="button">
		</form>
	</section>

	<section id="category">
		<form action="/ECsite/UserProductSearchServlet" method="get">
			<%--categoryを押される以下のプルダウンメニューが表示される--%>
			<select name="category">
				<option value="">選択してください</option>
				<option value="肉・卵・乳製品">肉・卵・乳製品</option>
				<option value="水産加工物">水産加工物</option>
				<option value="麺類">麺類</option>
				<option value="スイーツ・パン・朝食">スイーツ・パン・朝食</option>
				<option value="惣菜食材">惣菜食材</option>
				<option value="漬物">漬物</option>
				<option value="農産物">農産物</option>
				<option value="調味料">調味料</option>
				<option value="飲料・ソフトドリンク">飲料・ソフトドリンク</option>
				<option value="お酒">お酒</option>
			</select> <input type="submit" value="検索" class="button">
		</form>
	</section>
</header>
