package views.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.ListProductsBean;
import jp.co.aforce.models.ListProductModel;
import tool.Action;

@SuppressWarnings("serial")
public class ListProductAction extends Action {

	public String execute(HttpServletRequest request,HttpServletResponse response)throws Exception {
		HttpSession session = request.getSession();
		List<ListProductsBean> productList = new ArrayList<ListProductsBean>();
		ListProductsBean listProductsBean = new ListProductsBean();
		ListProductModel listProductModel = new ListProductModel();
		productList = listProductModel.listProduct(listProductsBean); //model処理実行
		request.setAttribute("productList", productList);

		session.setAttribute("productList", productList);

		return "userMain.jsp";
	}
}

