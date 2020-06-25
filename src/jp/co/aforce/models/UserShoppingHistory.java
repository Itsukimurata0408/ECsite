package jp.co.aforce.models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.ListResultBean;
import jp.co.aforce.util.DBUtil;

public class UserShoppingHistory {
	@SuppressWarnings("unused")
	public static List<ListResultBean> updateItem(String id, String name, String image, String category,
			int price, String detail) {
		//実行結果を格納する変数
		List<ListResultBean> sp = new ArrayList<ListResultBean>();
		ResultSet uprs = null;
		ResultSet sers = null;
		String SQL = null;
		try {
			//DB接続するための手続
			DBUtil.makeConnection();
			DBUtil.makeStatement();
			if (image == "") {
				System.out.println("if");
				//SQLを実行
				SQL = "UPDATE `product` " +
						"SET name = '" + name + "', category = '" + category + "', price = '" + price + "', detail = '"
						+ detail + "'"
						+ " WHERE product_id = '" + id + "'";
				DBUtil.execute(SQL);
			} else {
				System.out.println("else");
				//SQLを実行
				SQL = "UPDATE `product` " +
						"SET name = '" + name + "', image = '" + image + "', category = '" + category + "', price = '"
						+ price + "', detail = '" + detail + "'"
						+ " WHERE product_id = '" + id + "'";
				DBUtil.execute(SQL);
			}
			//SQLを実行
			SQL = "SELECT * FROM `product` WHERE product_id = '" + id + "'";
			sers = DBUtil.execute(SQL);
			sers.beforeFirst();
			while (sers.next()) {
				ListResultBean lrb = new ListResultBean();
				lrb.setId(sers.getString("product_id"));
				lrb.setName(sers.getString("name"));
				lrb.setImage(sers.getString("image"));
				lrb.setCategory(sers.getString("category"));
				lrb.setPrice(sers.getString("price"));
				lrb.setDetail(sers.getString("detail"));
				sp.add(lrb);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection();
		}
		return sp;
	}
}
