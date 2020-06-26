package jp.co.aforce.models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.SelectProductBean;
import jp.co.aforce.util.DBUtil;

public class ChangeProductModel {
	public static List<SelectProductBean> changeCheck(String id, String name, String image,String category,String price,String detail ) {
		//実行結果を格納する変数
		List<SelectProductBean> sp = new ArrayList<SelectProductBean>();
		String SQL = null;
		ResultSet sers = null;



		try {
			//DB接続するための手続
			DBUtil.makeConnection();
			DBUtil.makeStatement();

			if("変更なし".equals(image)){


				System.out.println("if");

				//SQLを実行
				SQL = "UPDATE `product` " +
								"SET name = '"+name+"', category = '"+category+"', price = '"+price+"', detail = '"+detail+"'"
								+ " WHERE product_id = '"+id+"'";
				DBUtil.execute(SQL);


		}else {

				System.out.println("else");

				//SQLを実行
				SQL = "UPDATE `product` " +
						"SET name = '"+ name+"', image = '"+image+"', category = '"+category+"', price = '"+price+"', detail = '"+detail+"'"
								+ " WHERE product_id = '"+id+"'";
				DBUtil.execute(SQL);


		}


			//SQLを実行
			SQL = "SELECT * FROM `product` WHERE product_id = '"+id+"'";
			sers = DBUtil.execute(SQL);
			sers.beforeFirst();
			while (sers.next()) {
				SelectProductBean spBean = new SelectProductBean();

				spBean.setId(sers.getString("product_id"));
				spBean.setName(sers.getString("name"));
				spBean.setImage(sers.getString("image"));
				spBean.setCategory(sers.getString("category"));
				spBean.setPrice(sers.getString("price"));
				spBean.setDetail(sers.getString("detail"));
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
