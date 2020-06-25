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

public class RegisterConfilmServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{

		//		GETリクエストはありえないので、無条件でログイン画面に飛ばす
		RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/admin/adminRegister.jsp");
		rDispatcher.forward(request, response);

	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setCharacterEncoding("UTF-8");

		//		入力した内容を配列に格納
		String[] parameter = {request.getParameter("name"),request.getParameter("image"),request.getParameter("category"),request.getParameter("price"),request.getParameter("detail")};
		int status = 0;
		boolean enter = true;


		//		for(int j = 0;j<parameter.length;j++) {
		//			System.out.println(parameter[j]);
		//		}

		String name = null;
		String image = null;
		String category = null;
		String price = null;
		String detail = null;

		;

		for(int i = 0;i<parameter.length;i++) {
			System.out.println(parameter[i]);
		}

		String forword_jsp = "/views/admin/adminRegister.jsp";

		//		それぞれの項目が入力されているか調べる
		for (int i=0;i<parameter.length;i++) {
			System.out.println(parameter[i]);
			//			値が入力されていないとき
			try {
				if(parameter[i].equals("")) {

					//				エラーメッセージを設定
					request.setAttribute("Emsg", "入力されていない項目があります。");

					enter = false;
					break;


					//			入力されているときの処理
				}else {

					switch(i) {
					case 0:
						name=parameter[i];
						break;
					case 1:
						image=parameter[i];

						break;
					case 2:
						category=parameter[i];

						break;
					case 3:
						price=parameter[i];
						break;
					case 4:
						detail=parameter[i];

					}


				}
			}catch (Exception e){

				System.out.println("error");
				status++;
			}

		}



		//		全ての項目が入力されていた時の処理
		if(enter == true) {
			if(status==0) {
				List<SelectProductBean> list = new ArrayList<SelectProductBean>();
				SelectProductBean spBean = new SelectProductBean();


				spBean.setName(name);
				spBean.setImage(image);
				spBean.setCategory(category);
				spBean.setPrice(price);
				spBean.setDetail(detail);
				list.add(spBean);

				request.setAttribute("product", list );

				forword_jsp = "/views/admin/registerConfilm.jsp";

			}
		}






		//		forward_jspに設定されているJSPへディスパッチ
		RequestDispatcher rDispatcher = request.getRequestDispatcher(forword_jsp);
		//		System.out.println(request.getAttribute("Emsg"));

		rDispatcher.forward(request,  response);
	}

}
