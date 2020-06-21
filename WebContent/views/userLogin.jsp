<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="login_user_bean" scope="session" class="login.LoginUserBean" />

<!DOCTYPE html>
<html>
    <head>
        <title>ログイン画面</title>
        <link href="css/userShoppingCss.css" rel="stylesheet" type="text/css" />
    </head>

    <body>
        <main class="login">
            <p>ログインIDとパスワードを入力して下さい</p>

            <form action="ECsite/loginAdminServlet" method="post">
                <table class="login_form">
                    <tbody>
                        <tr>

                            <th>ログインID</th>
                            <td><input type="text" name="id"></td>
                        </tr>
                        <tr>
                            <th>パスワード</th>
                            <td><input type="password" name="pass"/></td>
                        </tr>

                    </tbody>
                </table>

                <div class="buttons">
                    <input class="login_btn" type="submit" name="submit"  value="ログイン"/>

                </div>
            </form>
        </main>
    </body>
</html>