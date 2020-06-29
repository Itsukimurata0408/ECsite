package views.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.ItemBean;
import tool.Action;

public class ResultAction extends Action {


	@SuppressWarnings("unchecked")
	public String execute(HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session = request.getSession();

		List<ItemBean> cart = (List<ItemBean>)session.getAttribute("cart");
		if(cart == null) {
			cart = new ArrayList<ItemBean>();
			session.setAttribute("cart", cart);
		}

		session.setAttribute("cart", cart);
		return "userResult.jsp";
	}

}