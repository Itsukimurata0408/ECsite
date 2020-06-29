package jp.co.aforce.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.ListProductsBean;
import jp.co.aforce.models.ListProductModel;

@SuppressWarnings("serial")
public class ListProductServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		List<ListProductsBean> productList = new ArrayList<ListProductsBean>();
		ListProductsBean listProductsBean = new ListProductsBean();
		ListProductModel listProductModel = new ListProductModel();
		productList = listProductModel.listProduct(listProductsBean); //model処理実行
		request.setAttribute("productList", productList);
		RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/user/userMain.jsp");
		rDispatcher.forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// 文字コードエンコーディング
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		//パラメタ取得
		String list = request.getParameter("List");

		List<ListProductsBean> productList = new ArrayList<ListProductsBean>();
		ListProductsBean listProductsBean = new ListProductsBean();
		ListProductModel listProductModel = new ListProductModel();

		String forward_jsp = null;

		//一覧表示先分岐

		switch (list) {
		case "delete": //指定jspに移動
			productList = listProductModel.listProduct(listProductsBean); //model処理実行
			request.setAttribute("productList", productList);
			forward_jsp = "/views/admin/deleteProduct.jsp";
			break;


		case "購入を確定": //指定jspに移動
			productList = listProductModel.listProduct(listProductsBean); //model処理実行
			request.setAttribute("productList", productList);
			forward_jsp = "/views/user/userMain.jsp";
			break;



		default:

			break;
		}

		RequestDispatcher rDispatcher = request.getRequestDispatcher(forward_jsp);
		rDispatcher.forward(request, response);

	}
}