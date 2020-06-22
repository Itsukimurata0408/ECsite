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

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		//セッションの取得
		HttpSession session = request.getSession();
		if (session.getAttribute("loginBean") != null) {
			session.removeAttribute("loginBean");
		}

		RequestDispatcher rs = request.getRequestDispatcher("/views/user/userlogin.jsp");
		rs.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		doPost(request, response);
	}
}