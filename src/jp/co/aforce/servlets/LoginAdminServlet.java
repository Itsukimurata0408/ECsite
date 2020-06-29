package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.models.LoginAdminModel;

public class LoginAdminServlet  extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{

//		GETリクエストはありえないので、無条件でログイン画面に飛ばす
		RequestDispatcher rDispatcher = request.getRequestDispatcher("/pages/loginAdmin.jsp");
		rDispatcher.forward(request, response);

	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {





//		文字のエンコードをUTF-8とする。これがないと文字化け。
		request.setCharacterEncoding("UTF-8");

//		ユーザによって入力された情報を取り出す
		String username = request.getParameter("username");
		String password = request.getParameter("password");

//		取り出した情報をLoginBeanに格納する
//		LoginBean loginBean = new LoginBean();
//		loginBean.setUsername(username);
//		loginBean.setPassword(password);

//		モデルををインスタンス化する
		LoginAdminModel loginModel = new LoginAdminModel();
		String forword_jsp = "/pages/loginAdmin.jsp";



//		入力された情報がDBに存在するか調べる
		if(loginModel.loginCheck(username, password)) {


			request.setAttribute("Username", username);

//			TODO ここはオリジナル処理を考える↑↑

//			リクエストオブジェクト設定
//			request.setAttribute("users",users);

//			ログインに成功した先の JSP を指定
			forword_jsp = "/views/admin/adminMenu.jsp";

//		ログインが失敗したときの処理
		}else {
//			エラーメッセージを設定

			request.setAttribute("Emsg", "ユーザー名またはパスワードが違います");


		}
//		forward_jspに設定されているJSPへディスパッチ
		RequestDispatcher rDispatcher = request.getRequestDispatcher(forword_jsp);


		rDispatcher.forward(request,  response);
	}
}
