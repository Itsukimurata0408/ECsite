package jp.co.aforce.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.models.SelectProductModel;

public class UserShoppingServlet extends HttpServlet {

	@SuppressWarnings("unused")
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Enumeration<String> names = request.getParameterNames();

		String product = null; // 商品情報
		String id = null; //商品番号
		String count = null; // 購入数

		// 購入ボタン特定
		// クリックされた購入ボタンの値と、リストの値を取得
		while (names.hasMoreElements()) {
			product = names.nextElement();

			// 購入ボタンがクリックされている場合は「購入」のパラメータが取得できる
			if ("購入へ進む".equals(request.getParameter(product))) {
				// 購入ボタンに商品ID
				id = product;
			}
		}

		// ドロップダウンリストから購入数を取得
		count = request.getParameter(id + "list");

		// 商品一覧セット
		request.setAttribute("product_bean", product);
		request.setAttribute("count", count);

		// 商品情報を取得
		SelectProductModel spm = new SelectProductModel();

		String forward_jsp = null;

		if (spm.cartCheck(product, id, count)) {
			//購入成功した場合
			forward_jsp = "/views/user/userResult.jsp";

		} else {
			//購入失敗した場合
			forward_jsp = "/views/user/userResultErrer.jsp";
		}

		// 購入確認画面に移動
		RequestDispatcher rd = request.getRequestDispatcher("/views/user/userResultErrer.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}