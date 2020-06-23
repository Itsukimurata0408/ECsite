package jp.co.aforce.models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.ProductDetailBean;
import jp.co.aforce.util.DBUtil;

public class ProductModel {
	public static List<ProductDetailBean> productCheck(String id) {
		//実行結果を格納する変数
		//		SelectProductBean spBean = new SelectProductBean();
		List<ProductDetailBean> sp = new ArrayList<ProductDetailBean>();
		ResultSet rs = null;



		try {
			//DB接続するための手続
			DBUtil.makeConnection();
			DBUtil.makeStatement();

			//SQLを実行
			String SQL = "SELECT * FROM `product` WHERE product_id = '"+id+"'";
			rs = DBUtil.execute(SQL);

			rs.beforeFirst();


			while (rs.next()) {
				ProductDetailBean spBean = new ProductDetailBean();

				spBean.setId(rs.getString("product_id"));
				spBean.setName(rs.getString("name"));
				spBean.setImage(rs.getString("image"));
				spBean.setCategory(rs.getString("category"));
				spBean.setPrice(rs.getString("price"));
				spBean.setDetail(rs.getString("detail"));

				sp.add(spBean);
			}



		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			DBUtil.closeConnection();
		}

		return sp;
	}
}