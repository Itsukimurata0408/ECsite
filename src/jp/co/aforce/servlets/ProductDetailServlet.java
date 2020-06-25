package jp.co.aforce.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.ProductDetailBean;
import jp.co.aforce.models.ProductModel;

public class ProductDetailServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{

		String parameter = request.getParameter("id");
		String forward_jsp = null;

		if(parameter.isEmpty()) {
			forward_jsp = "/views/admin/changeProduct.jsp";

		}else {
			List<ProductDetailBean> list = ProductModel.productCheck(parameter);
			request.setAttribute("product", list);
			forward_jsp = "/views/admin/productDetail.jsp";
		}


		RequestDispatcher rDispatcher = request.getRequestDispatcher(forward_jsp);

		rDispatcher.forward(request, response);

	}
}
