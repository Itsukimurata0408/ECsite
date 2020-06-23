<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="pr" items="${product}">

<form action="/ECsite/changeProductServlet" method="get">
		<p>
			ID <input type="text" name="id" value="${pr.id }" readonly>
		</p>

		<p>
			品名 <input type="text" name="name" value="${pr.name }">
		</p>

		<p>
			画像 <input type="file" name="image" >
		</p>

		<p>
			カテゴリ <select name="category" >
			 	<option value="${pr.category }">${pr.category }</option>
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
			値段 <input type="text" name="price" value="${pr.price }">
		</p>

		<p>
			詳細説明文 <textarea name="detail" rows="10" cols="60">${pr.detail }</textarea>
		</p>


		<p>
		<input type="button" onclick="location.href='/MemberInformation/page/menu.html'" value="戻る" >
		<input type="submit" value="登録">
		</p>

	</form>

</c:forEach>

</body>
</html>