<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
register

<p>${Emsg}</p>
	<p>${Smsg}</p>
	<form action="/ECsite/registerServlet" method="post">
		<p>
			品名 <input type="text" name="name">
		</p>

		<p>
			画像 <input type="file" name="image">
		</p>

		<p>
			カテゴリ <select name="category">
			 	<option value=""></option>
				<option value="肉・卵・乳製品">肉・卵・乳製品</option>
				<option value="水産加工品">水産加工品</option>
				<option value="麺類">麺類</option>
				<option value="スイーツ・パン・朝食">スイーツ・パン・朝食</option>
				<option value="惣菜・食材">惣菜食材</option>
				<option value="漬物">漬物</option>
				<option value="農産物">農産物</option>
				<option value="調味料">調味料</option>
				<option value="飲料・ソフトドリンク">飲料・ソフトドリンク</option>
				<option value="お酒">お酒</option>
			</select>
		</p>

		<p>
			値段 <input type="text" name="price">
		</p>

		<p>
			詳細説明文 <textarea name="detail" rows="10" cols="60"></textarea>
		</p>





		<p>
		<input type="button" onclick="location.href='/MemberInformation/page/menu.html'" value="戻る" >
		<input type="submit" value="登録">
		</p>

	</form>
</body>
</html>