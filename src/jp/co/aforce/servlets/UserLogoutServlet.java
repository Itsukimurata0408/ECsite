package jp.co.aforce.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.tool.Action;

public class UserLogoutServlet extends Action {

	public String execute(
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();

		//ログインしているときにログアウトが押された場合
		if (session.getAttribute("loginBean") != null) {
			session.removeAttribute("loginBean");
			return "userMain.jsp";
		}
		//TODO ログインしていない場合にログアウトが押された場合
		return "userlogouterror.jsp";
	}

}
