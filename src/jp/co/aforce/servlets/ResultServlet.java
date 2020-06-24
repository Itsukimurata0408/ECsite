package jp.co.aforce.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.models.UserShoppingHistry;

public class ResultServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@SuppressWarnings("unused")
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		// ログインid取得
		String username = ((HttpSession) request.getSession().getAttribute("login_bean")).getId();

		// 購入確認画面の値を取得
		int id = Integer.parseInt(request.getParameter("id"));
		int count = Integer.parseInt(request.getParameter("count"));

		UserShoppingHistry ush = null;

		/*
		 * 商品IDと購入数をDB更新
		 * 商品在庫をマイナス
		 */
		ush = new UserShoppingHistry();
		try {
			ush.updateItem(id, count);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 商品結果画面に移動
		RequestDispatcher rd = request.getRequestDispatcher("../../../WebContent/views/ruserResult.jsp");
		rd.forward(request, response);

	}
}