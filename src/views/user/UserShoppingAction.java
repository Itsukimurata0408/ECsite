package views.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.ItemBean;
import tool.Action;

public class UserShoppingAction extends Action {

	@SuppressWarnings("unchecked")
	public String execute(HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session = request.getSession();

		List<ItemBean> cart = (List<ItemBean>)session.getAttribute("cart");
		if(cart == null) {
			cart = new ArrayList<ItemBean>();
			session.setAttribute("cart", cart);
		}

		session.setAttribute("cart", cart);
		return "userConfirm.jsp";
	}

//	@SuppressWarnings("unused")
//	@Override
//	public void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		Enumeration<String> names = request.getParameterNames();
//		String product = null; // 商品情報
//		String id = null; //商品番号
//		String count = null; // 購入数
//		// 購入ボタン特定
//		// クリックされた購入ボタンの値と、リストの値を取得
//		while (names.hasMoreElements()) {
//			product = names.nextElement();
//			// 購入ボタンがクリックされている場合は「購入」のパラメータが取得できる
//			if ("購入へ進む".equals(request.getParameter(product))) {
//				// 購入ボタンに商品ID
//				id = product;
//			}
//		}
//		// ドロップダウンリストから購入数を取得
//		count = request.getParameter(id + "list");
//		// 商品一覧セット
//		request.setAttribute("product_bean", product);
//		request.setAttribute("count", count);
//
//		// 商品情報を取得
//		SelectProductModel spm = new SelectProductModel();
//		String forward_jsp = null;
//
//		if (product != null && id != null && count != null && id != null) {
//
//			forward_jsp = "/views/user/userResult.jsp";
//
//		} else {
//
//			forward_jsp = "/views/user/userResultErrer.jsp";
//		}
//
//		// 購入確認画面に移動
//		RequestDispatcher rd = request.getRequestDispatcher(forward_jsp);
//		rd.forward(request, response);
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//	}
}
