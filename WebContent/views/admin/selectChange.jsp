<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script	type="text/javascript">
$(function() {
	$('#select').change(function () {
		  var val = $('select option:selected').val();
		  if (val == 'select') return;
		  $('section').fadeOut();
		  $('section#' + val ).fadeIn();
		});
	});
</script>
</head>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin/adminSelect.css">

<body>

	<p>
			検索内容 <select id="select">
			<option value="select">選択してください</option>
			<option value="name">商品名</option>
			<option value="category">カテゴリ</option>
			<option value="price">値段</option>
			<option value="detail">詳細</option>
			</select>
	</p>

<section id="name">
<form action="/ECsite/selectProductServlet" method="get">
<p>商品名<input type="text" name="name" ></p>
<input type="submit" value="検索" class="button">
</form>
</section>

<section id="category">
<form action="/ECsite/selectProductServlet" method="get">
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
<input type="submit" value="検索" class="button">
</form>
</section>

<section id="price">
<form action="/ECsite/selectProductServlet" method="get">
<p>値段<input type="number" name="price" ></p>
<input type="submit" value="検索" class="button">
</form>
</section>

<section id="detail">
<form action="/ECsite/selectProductServlet" method="get">
<p>詳細<textarea name="detail" rows="10" cols="60"></textarea></p>
<input type="submit" value="検索" class="button">
</form>
</section>

</body>

</html>