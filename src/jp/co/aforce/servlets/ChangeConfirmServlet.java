package jp.co.aforce.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.SelectProductBean;

public class ChangeConfirmServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String[] parameter = { request.getParameter("id"), request.getParameter("name"),
				request.getParameter("category"), request.getParameter("price"), request.getParameter("detail") };

		String id = null;
		String name = null;
		String image = request.getParameter("image");
		String category = null;
		String price = null;
		String detail = null;

		String forward_jsp = null;

		boolean status = true;

		for (int i = 0; i < parameter.length; i++) {
			if (!parameter[i].isEmpty()) {
				switch (i) {
				case 0:
					id = parameter[i];
					break;
				case 1:
					name = parameter[i];
					break;
				case 2:
					category = parameter[i];
					break;
				case 3:
					price = parameter[i];
					break;
				case 4:
					detail = parameter[i];
				}
			} else {
				status = false;
				break;
			}

		}

		List<SelectProductBean> list = new ArrayList<SelectProductBean>();
		SelectProductBean spBean = new SelectProductBean();

		if (status == true) {

			if (!image.isEmpty()) {
				spBean.setImage(image);
			} else {
				spBean.setImage("変更なし");
			}

			spBean.setId(id);
			spBean.setName(name);
			spBean.setCategory(category);
			spBean.setPrice(price);
			spBean.setDetail(detail);
			list.add(spBean);

			request.setAttribute("product", list);
			forward_jsp = "/views/admin/changeConfirm.jsp";
		} else {

			request.setAttribute("Emsg", "入力されていない項目があります");

			spBean.setId(id);
			spBean.setName(name);
			spBean.setCategory(category);
			spBean.setPrice(price);
			spBean.setDetail(detail);
			list.add(spBean);

			request.setAttribute("product", list);
			forward_jsp = "/views/admin/productDetail.jsp";
		}

		RequestDispatcher rDispatcher = request.getRequestDispatcher(forward_jsp);
		rDispatcher.forward(request, response);

	}

}