package jp.co.aforce.models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.SelectProductBean;
import jp.co.aforce.util.DBUtil;

public class SelectProductModel {
	public static List<SelectProductBean> selectCheck(String type,String select) {
		//実行結果を格納する変数

		List<SelectProductBean> sp = new ArrayList<SelectProductBean>();
		ResultSet rs = null;


		if(type.equals("price")) {
			try {
				//DB接続するための手続
				DBUtil.makeConnection();
				DBUtil.makeStatement();

				//SQLを実行
				String SQL = "SELECT * FROM `product` WHERE price <= "+select;
				rs = DBUtil.execute(SQL);
				rs.beforeFirst();
				while (rs.next()) {
					SelectProductBean spBean = new SelectProductBean();
					System.out.println("while");
					spBean.setId(rs.getString("product_id"));
					spBean.setName(rs.getString("name"));
					sp.add(spBean);
				}

				return sp;

			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}finally {
				DBUtil.closeConnection();
			}
		}else {





			try {
				//DB接続するための手続
				DBUtil.makeConnection();
				DBUtil.makeStatement();

				//SQLを実行
				String SQL = "SELECT * FROM `product` WHERE "+type+" LIKE '%"+select+"%'";
				rs = DBUtil.execute(SQL);
				rs.beforeFirst();
				while (rs.next()) {
					SelectProductBean spBean = new SelectProductBean();
					System.out.println("while");
					spBean.setId(rs.getString("product_id"));
					spBean.setName(rs.getString("name"));
					sp.add(spBean);
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
}
