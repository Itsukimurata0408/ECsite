<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<link href="css/shopping.css" rel="stylesheet" type="text/css" />

<%-- header --%>
<header>
    <!-- ログイン済みの場合は名前表示 ログインしていない段階では「ようこそゲストさん」
    	 beanの情報が必要
    	 TODO: 書き換え
    	  -->


   <!-- サーブレットのここの部分で判断しできるかな
   			 if (insertModel.insertCheck(insertBean)) {

				request.setAttribute("Smsg","登録に成功しました");
				forward_jsp = "/views/menu.jsp";

			}else {
				request.setAttribute("Gestmsg", "ゲスト");
				forward_jsp = "/views/regist.jsp";
			} -->


    <p>ようこそ「<jsp:getProperty name="login_user_bean" property="name" />」さん
     <p>ようこそ${Gestmsg}さん

        <%-- Getのクエリで購入履歴かログアウトか判断させる --%>
        <a href="ゲスト側のカートサーブレット名?submit=cart">カート</a>

        if(){
        <a href="ゲスト側のログインサーブレット名?submit=login">ログイン</a>

        }else{

        <a href="ゲスト側のログインサーブレット名?submit=logout">ログアウト</a>
    </p>
</header>
