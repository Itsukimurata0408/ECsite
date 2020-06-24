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
import jp.co.aforce.models.ChangeProductModel;

public class ChangeProductServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{

		String[] parameter = {request.getParameter("id"),request.getParameter("name"),request.getParameter("category"),request.getParameter("price"),request.getParameter("detail")};

		String id = null;
		String name = null;
		String image = request.getParameter("image");
		String category = null;
		String price = null;
		String detail = null;

		boolean status  = true;

		for(int i = 0;i<parameter.length;i++) {
			if(!parameter[i].equals("")) {
				switch(i){
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
			}else {
				status = false;
				break;
			}
		}

		if(status == true) {
			List<SelectProductBean> list = ChangeProductModel.changeCheck(id,name,image,category,price,detail);

			request.setAttribute("update", list);


			RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/admin/changeSuccess.jsp");
			rDispatcher.forward(request, response);
		}else {
			List<SelectProductBean> list = new ArrayList<SelectProductBean>();
			SelectProductBean spBean = new SelectProductBean();

			spBean.setId(request.getParameter("id"));
			spBean.setName(request.getParameter("name"));
			spBean.setCategory(request.getParameter("category"));
			spBean.setPrice(request.getParameter("price"));
			spBean.setDetail(request.getParameter("detail"));
			list.add(spBean);

			request.setAttribute("product", list );
			request.setAttribute("Emsg", "入力されていない項目があります");


			RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/admin/productDetail.jsp");
			rDispatcher.forward(request, response);

		}


	}
}
