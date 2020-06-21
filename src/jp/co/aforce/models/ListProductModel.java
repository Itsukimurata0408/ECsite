package jp.co.aforce.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.ListProductsBean;
import jp.co.aforce.util.DBUtil;

public class ListProductModel {
	@SuppressWarnings("unused")

    public void ProductsDelete(ListProductsBean bean) {
        // 実行結果を格納する変数
		ResultSet rs = null;
		 //System.out.println(bean);

    	//一覧処理
		 //DBUtil.makeConnection();←エラー箇所
         //DBUtil.makeStatement();←エラー箇所
		 Connection con = null;

		try {

			List<ListProductsBean> list = new ArrayList<ListProductsBean>();


			String sql = "SELECT * from products";
			//rs = DBUtil.execute(sql);←エラー箇所
			while (rs.next()) {
				String name = rs.getString("name");
				String image = rs.getString("image");
				String category = rs.getString("category");
				int    price = rs.getInt("price");
				String detail = rs.getString("detail");
				list.add(new ListProductsBean(name,image,category,price,detail));
			}

			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection();
			}
		}
	}


//メモ↓
//        try {
//            // DBに接続するための手続
//            DBUtil.makeConnection();
//            DBUtil.makeStatement();
//
//            // SQLを実行
//            String SQL = "SELECT * FROM products;";
//            DBUtil.execute(SQL);
//            result = true;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        } finally {
//            DBUtil.closeConnection();
//        }
//       return result ;
//    }
//
//
//}
