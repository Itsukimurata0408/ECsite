/*
 * カートに追加する処理
 */

package jp.co.aforce.servlets;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.ItemBean;
import jp.co.aforce.beans.ProductBean;

public class UserCartAddServret {

	//未チェックまたは安全でない操作に対する警告uncheckedを指定
	@SuppressWarnings("unchecked")
	public String execute(
			HttpServletRequest request, HttpServletRequest response)
			throws Exception {

		HttpSession session = request.getSession();

		int product_id = Integer.parseInt(request.getParameter("product_id"));

		List<ItemBean> cart = (List<ItemBean>) session.getAttribute("cart");

		//カートに商品が入っていない場合
		if (cart == null) {

			//カートを生成してセッション属性に設定
			cart = new ArrayList<ItemBean>();
			session.setAttribute("cart", cart);
		}

		//product_idを使用してこれから追加する商品がカート内に存在するかを調べる
		for (ItemBean i : cart) {
			if (i.getProduct().getId() == product_id) {
				i.setCount(i.getCount() + 1);
				//TODO カートの中身が表示されているｊｓｐファイル名を記載
				return "";
			}
		}

		List<ProductBean> list = (List<ProductBean>) session.getAttribute("list");
		for (ProductBean p : list) {
			if (p.getId() == product_id) {
				ItemBean i = new ItemBean();
				i.setProduct(p);
				i.setCount(1);
				cart.add(i);
			}
		}
		//TODO カートの中身が表示されているｊｓｐファイル名を記載
		return "";
	}

}
