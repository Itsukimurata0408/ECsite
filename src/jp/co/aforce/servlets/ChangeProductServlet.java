package jp.co.aforce.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.SelectProductBean;
import jp.co.aforce.models.ChangeProductModel;

public class ChangeProductServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{


		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String image = request.getParameter("image");
		String category = request.getParameter("category");
		String price = request.getParameter("price");
		String detail = request.getParameter("detail");


		List<SelectProductBean> list = ChangeProductModel.changeCheck(id,name,image,category,price,detail);



		request.setAttribute("update", list);


			RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/admin/changeSuccess.jsp");
			rDispatcher.forward(request, response);

		}
}
