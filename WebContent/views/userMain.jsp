<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="../css/userMainCss.css" rel="stylesheet" type="text/css" />
<meta charset="UTF-8">
<title>宮城県特産品通販サイト</title>
</head>
<body>
	<header>

<div class="header">

		<a href=""><img src="../img/human_icon.png"></a>
		<a href="userCart.jsp"><img src="../img/cart_icon.png"></a>
		<form action="/ECsite/loginAdminServlet">
			<div class="sample3Area">
				<input type="text" class="sample3Text">
				<div class="sample3Button" onclick="goSearch()">
					<img src="../img/glass_icon.png" class="sample3Img">
				</div>
			</div>
		</form>
</div>

		<div class="top_photo">
			<img src="../img/sample_photo.jpg">
		</div>
		<!-- TODO: beanができ次第変更する点 -->
		<!--jsp:include page="userHeader.jsp"-->

		<!-- TODO カートの表示 -->

	</header>

	<main>
		<!-- 軽めな県紹介 -->
		<h2>ABOUT</h2>
		<p>笑顔咲くたび 伊達な旅</p>
		<p>海にも山にも囲まれている宮城県</p>
		<p>日本中 世界中の皆様へ自慢の特産品で笑顔をお届けします</p>


		<!-- おすすめ商品 -->

		<div class="recommend_container">
			<h2>RECOMMEND ITEM</h2>


			<ul class="recommenb_list">
				<li class="recommend_list_item"><a href="userItemChise"
					class="">
						<div class="recommend_item">
							<img src="../img/strawberry_juice.jpg" class="item_image">
						</div>
				</a> <a href="itemChoise.jsp" class=""> ストロベリーピュア100 苺しぼりたて300ml２本詰
						<div class="itemm_price">3,240円(税込)</div>
				</a></li>

				<li class="recommend_list_item"><a href="userItemChise"
					class="">
						<div class="recommend_item">
							<img src="../img/hum.jpg" class="item_image">
						</div>
				</a> <a href="itemChoise.jsp" class=""> マイスターチョイス
						<div class="item_price">5,184円(税込)</div>
				</a></li>

				<li class="recommend_list_item"><a href="userItemChise"
					class="">
						<div class="recommend_item">
							<img src="../img/walnut_yubeshi.jpg" class="item_image">
						</div>
				</a> <a href="itemChoise.jsp" class=""> 宮城県銘菓 ゆべし詰合せ15個入 栗、くるみ、ごま
						<div class="item_price">3,402円(税込)</div>
				</a></li>

				<li class="recommend_list_item"><a href="userItemChise"
					class="">
						<div class="recommend_item">
							<img src="../img/farm_set.jpg" class="item_image">
						</div>
				</a> <a href="itemChoise.jsp" class=""> 農園セレクトセット
						<div class="item_price">3,564円(税込)</div>
				</a></li>

				<li class="recommend_list_item"><a href="userItemChise"
					class="">
						<div class="recommend_item">
							<img src="../img/sendai_beef.jpg" class="item_image">
						</div>
				</a> <a href="itemChoise.jsp" class=""> 最高級A5 ランク仙台牛希少部位３種焼肉食べ比べセット
						<div class="item_price">10,800円(税込)</div>
				</a></li>

				<li class="recommend_list_item"><a href="userItemChise"
					class="">
						<div class="recommend_item">
							<img src="../img/grape_juice.jpg" class="item_image">
						</div>
				</a> <a href="" class=""> マルタのきぶどう白ぶどう600ml３本詰合
						<div class="item_price">4,752円(税込)</div>
				</a></li>


			</ul>
		</div>

		<!-- 新着情報 -->


		<div class="new_container">
			<h2>NEW ITEM</h2>
			<ul class="new_list">
				<li class="new_list_item"><a href="userItemChise" class="">
						<div class="new_item">
							<img src="../img/tomato_juice.jpg" class="item_image">
						</div>
				</a> <a href="itemChoise.jsp" class=""> 宮城県産
						無添加無塩100%紅白トマトジュース100ｇ８本セット
						<div class="item_price">4,320(税込)</div>
				</a></li>

				<li class="new_list_item"><a href="userItemChise" class="">
						<div class="new_item">
							<img src="../img/kamaboko.jpg" class="item_image">
						</div>
				</a> <a href="itemChoise.jsp" class=""> 贅沢ひとり焼き 笹かまぼこ 8枚箱入
						<div class="item_price">3,240円(税込)</div>
				</a></li>

				<li class="new_list_item"><a href="userItemChise" class="">
						<div class="new_item">
							<img src="../img/zunda.jpg" class="item_image">
						</div>
				</a> <a href="itemChoise.jsp" class=""> ずんだもちセット
						<div class="item_price">3,370円(税込)</div>
				</a></li>

				<li class="new_list_item"><a href="userItemChise" class="">
						<div class="new_item">
							<img src="../img/mitarashi_dumpling.jpg" class="item_image">
						</div>
				</a> <a href="itemChoise.jsp" class=""> ずんだ餅と栗だんご
						<div class="item_price">3,370円(税込)</div>
				</a></li>

				<li class="new_list_item"><a href="userItemChise" class="">
						<div class="new_item">
							<img src="../img/pepper_tongue.jpg" class="item_image">
						</div>
				</a> <a href="itemChoise.jsp" class="">やみつき!!おつまみペッパータン ～ブラックペッパー味～
						<div class="item_price">626円(税込)</div>
				</a></li>

				<li class="new_list_item"><a href="" class="">
						<div class="new_item">
							<img src="../img/shark_fin_steak.jpg" class="item_image">
						</div>
				</a> <a href="" class=""> フカヒレステーキ2枚セット
						<div class="item_price">10,800円(税込)</div>
				</a></li>


			</ul>
		</div>
	</main>

	<footer> </footer>
</body>
</html>