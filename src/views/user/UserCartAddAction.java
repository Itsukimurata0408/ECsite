/*
 * カートに追加する処理
 */

package views.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.ItemBean;
import jp.co.aforce.beans.ListProductsBean;
import tool.Action;

public class UserCartAddAction extends Action {

	@SuppressWarnings("unchecked")
	public String execute(HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session = request.getSession();

		int id = Integer.parseInt(request.getParameter("id"));

		List<ItemBean> cart = (List<ItemBean>)session.getAttribute("cart");
		if(cart == null) {
			cart = new ArrayList<ItemBean>();
			session.setAttribute("cart", cart);
		}


		for(ItemBean item : cart) {
			if(item.getProduct().getId() == id) {
				item.setCount(item.getCount() + 1);
				return "userCart.jsp";
			}
		}

		List<ListProductsBean> list = (List<ListProductsBean>)session.getAttribute("productList");
		for(ListProductsBean product : list) {
			if(product.getId() == id) {
				ItemBean item = new ItemBean();
				item.setProduct(product);
				item.setCount(1);
				cart.add(item);
			}
		}
		session.setAttribute("cart", cart);
		return "userCart.jsp";
	}

}
