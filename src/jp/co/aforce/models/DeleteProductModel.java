package jp.co.aforce.models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.DeleteProductBean;
import jp.co.aforce.util.DBUtil;

public class DeleteProductModel {
	public static List<DeleteProductBean> deleteCheck(String product_id ) {
		//実行結果を格納する変数
		List<DeleteProductBean> dp = new ArrayList<DeleteProductBean>();
		String SQL = null;
		ResultSet rs = null;


		try {
			//DB接続するための手続
			DBUtil.makeConnection();
			DBUtil.makeStatement();

				//SQLを実行
				SQL = "DELETE FROM `product` WHERE product_id = '"+product_id+"'";
				DBUtil.execute(SQL);


		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			DBUtil.closeConnection();
		}

		return dp;

	}
}
