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




		System.out.println(parameter);

		List<ProductDetailBean> list = ProductModel.productCheck(parameter);

		request.setAttribute("product", list);


			RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/admin/ProductDetail.jsp");
			rDispatcher.forward(request, response);

		}
}
