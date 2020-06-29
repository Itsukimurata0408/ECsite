




/*
 *ユーザ側のメインページの検索エンジンサーブレット
 */
package jp.co.aforce.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.SearchProductBean;
import jp.co.aforce.models.SearchProductModel;

public class UserProductSearchServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		//検索画面で入力されたchoice,categoryの情報を取得して文字列型valueに格納しリストを作成
		String[] value = {request.getParameter("name"),request.getParameter("category")};
		//selectにはnull格納
		//selectにはカテゴリで選択されたものが入る（肉・卵・乳製品）
		String select= null;
		//typeにはカテゴリが入る
		String type=null;

		//valueに値が入っているかの確認
		for(int i=0;i<value.length;i++) {
			if(value[i]!=null) {
				switch(i) {
				case 0:
					select = value[i];
					type="name";
				break;
				case 1:
					select = value[i];
					type="category";
			}
				break;
			}
		}
			System.out.println("type="+type+"//select="+select);
			List<SearchProductBean> list = SearchProductModel.check(type,select);

			if(list == null) {
				request.setAttribute("notfind","ご希望の商品は見つかりませんでした。");
			}else {
				request.setAttribute("select",list );
			}
			//検索結果のページにディスパッチ
			RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/user/userSearch.jsp");
			rDispatcher.forward(request, response);
	}
}