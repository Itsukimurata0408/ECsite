/*
 * ユーザがログアウトボタンが押された場合の処理
 */

package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLogoutServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// GETリクエストはあり得ないので、無条件でログイン画面に飛ばす
		RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/user/userMain.jsp");
		rDispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		//セッションの取得
		HttpSession session = request.getSession();

		String forward_jsp = "/views/user/userMain.jsp";
		//ログインしているときにログアウトが押された場合
		if (session.getAttribute("loginBean") != null) {
			//loginBeanのセッションを削除する
			session.removeAttribute("loginBean");
			forward_jsp = "userMain.jsp";
		}

		// forwaed_jsp に設定されているJSPへディスパッチ
				RequestDispatcher rDispatcher = request.getRequestDispatcher(forward_jsp);
				rDispatcher.forward(request, response);
	}
}