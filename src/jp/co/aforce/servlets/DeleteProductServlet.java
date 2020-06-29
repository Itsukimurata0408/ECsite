package jp.co.aforce.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.DeleteProductBean;
import jp.co.aforce.models.DeleteProductModel;

public class DeleteProductServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String[] parameter = request.getParameterValues("delete");

		for (int i = 0; i < parameter.length; i++) {
			System.out.println(parameter[i]);
		}

		String product_id = null;

		String forward_jsp = null;

		boolean status = true;

		for (int i = 0; i < parameter.length; i++) {
			if (!parameter[i].equals("")) {

				product_id = parameter[i];

			} else {
				status = false;
				request.setAttribute("Emsg", "選択されていません");
				forward_jsp = "/views/admin/deleteProduct.jsp";

			}

			if (status == true) {

				List<DeleteProductBean> list = DeleteProductModel.deleteCheck(product_id);

				request.setAttribute("Smsg", "削除されました");
				forward_jsp = "/views/admin/deleteProduct.jsp";

			} else {
				status = false;
				request.setAttribute("Emsg", "選択されていません");
				forward_jsp = "/views/admin/deleteProduct.jsp";

			}

			RequestDispatcher rDispatcher = request.getRequestDispatcher(forward_jsp);
			rDispatcher.forward(request, response);

		}
	}
}
