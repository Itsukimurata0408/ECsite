/*
 *カート画面に表示されている商品を削除する
 *
 */

package jp.co.aforce.servlets;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.ItemBean;
import tool.Action;

public class UserCartRemoveServlet extends Action {

	@SuppressWarnings("unchecked")

	public String execute(
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();

		int product_id = Integer.parseInt(request.getParameter("product_id"));

		List<ItemBean> cart = (List<ItemBean>) session.getAttribute("cart");

		for (ItemBean i : cart) {
			if (i.getProduct().getId() == product_id) {
				cart.remove(i);
				break;
			}

		}
		//TODO カート画面のｊｓｐファイル名追加
		return "cart.jsp";
	}
}
