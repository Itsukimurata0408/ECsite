package jp.co.aforce.models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.ListProductBean;
import jp.co.aforce.util.DBUtil;

public class ListProductModel {
	@SuppressWarnings("unused")

  public List<ListProductBean> listProduct(ListProductBean bean) {
      // 実行結果を格納する変数
		ResultSet rs = null;

  	  //一覧処理
		List<ListProductBean> productList = new ArrayList<ListProductBean>();

		try {

			DBUtil.makeConnection();
			DBUtil.makeStatement();

			String sql = "SELECT * FROM `product`";
			rs = DBUtil.execute(sql);

			rs.beforeFirst();
			while (rs.next()) {
				ListProductBean listProductBean = new ListProductBean();

				listProductBean.setProduct_id(rs.getString("product_id"));
				listProductBean.setName(rs.getString("name"));
				listProductBean.setImage(rs.getString("image"));
				listProductBean.setCategory(rs.getString("category"));
				listProductBean.setPrice(rs.getInt("price"));
				listProductBean.setDetail(rs.getString("detail"));
				productList.add(listProductBean);
			}

			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection();
			}
		return productList;
		}
	}

