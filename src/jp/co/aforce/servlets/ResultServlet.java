package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.models.UserShoppingHistory;

public class ResultServlet extends HttpServlet {


	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@SuppressWarnings({ "unused", "static-access" })
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// ログインid取得
		String username = ((HttpSession) request.getSession().getAttribute("login_bean")).getId();

		// 購入確認画面の値を取得
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String image = request.getParameter("image");
		String category = request.getParameter("category");
		int price =  Integer.parseInt(request.getParameter("price"));
		String detail = request.getParameter("detail");

		/*
		 * 商品IDと購入数をDB更新
		 * 商品在庫をマイナス
		 */

		UserShoppingHistory ush = new UserShoppingHistory();
		ush.updateItem(id,name,image,category,price,detail);

		// 商品結果画面に移動

		RequestDispatcher rd = request.getRequestDispatcher("/WebContent/views/ruserResult.jsp");
		rd.forward(request, response);


	}
}