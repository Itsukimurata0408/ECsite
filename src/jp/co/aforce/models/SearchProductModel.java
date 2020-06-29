


package jp.co.aforce.models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.SearchProductBean;
import jp.co.aforce.util.DBUtil;

public class SearchProductModel {
	public static List<SearchProductBean> check(String type,String select) {
		//実行結果を格納する変数

		List<SearchProductBean> sp = new ArrayList<SearchProductBean>();
		String SQL = null;
		ResultSet rs = null;

		 SQL = "SELECT * FROM `product` WHERE `" + type + "` = '" + select +"'";

		try {
			//DB接続するための手続
			DBUtil.makeConnection();
			DBUtil.makeStatement();

			rs = DBUtil.execute(SQL);
			rs.beforeFirst();
			while (rs.next()) {

				//searchBeanから値の取り出setしに格納
				SearchProductBean searchBean = new SearchProductBean();
				searchBean.setId(rs.getString("product_id"));
				searchBean.setName(rs.getString("name"));
				searchBean.setPrice(rs.getInt("price"));
				searchBean.setDetail(rs.getString("detail"));
				searchBean.setImage(rs.getString("image"));
				sp.add(searchBean);

			}
			return sp;

		}catch(Exception e) {
			e.printStackTrace();
			//				sp.add(null);
			return null;
		}finally {
			DBUtil.closeConnection();

		}
	}
}

