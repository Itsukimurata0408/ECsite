package jp.co.aforce.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.SelectProductBean;
import jp.co.aforce.models.SelectProductModel;



public class SelectProbuctServlet  extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{

		String[] parameter = {request.getParameter("name"),request.getParameter("category"),request.getParameter("price"),request.getParameter("detail")};
		String select = null;
		String type = null;


		for(int i = 0;i<parameter.length;i++) {
			if(parameter[i]!=null) {
				switch(i){
				case 0:
					select = parameter[i];
					type ="name";
					break;
				case 1:
					select = parameter[i];
					type ="category";
					break;
				case 2:
					select = parameter[i];
					type ="price";
					break;
				case 3:
					select = parameter[i];
					type ="detail";
				}
				break;
			}
		}

		System.out.println("type="+type+"//select="+select);

		List<SelectProductBean> list = SelectProductModel.selectCheck(type,select);
		request.setAttribute("select", list);


			RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/admin/changeProduct.jsp");
			rDispatcher.forward(request, response);

		}
}
