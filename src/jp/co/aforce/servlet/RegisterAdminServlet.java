package jp.co.aforce.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.models.RegisterAdminModel;

public class RegisterAdminServlet extends HttpServlet{

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

		int price1 =0;

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
						price1 = Integer.parseInt(price);
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

				RegisterAdminModel registerAdminModel = new RegisterAdminModel();

				if(registerAdminModel.registerCheck(name,image,category,price1,detail) == true) {
					request.setAttribute("Smsg", "登録に成功しました。");
				}


			}else {
				request.setAttribute("Smsg", "登録に失敗しました。");
			}
		}






		//		forward_jspに設定されているJSPへディスパッチ
		RequestDispatcher rDispatcher = request.getRequestDispatcher(forword_jsp);
		//		System.out.println(request.getAttribute("Emsg"));

		rDispatcher.forward(request,  response);
	}
}