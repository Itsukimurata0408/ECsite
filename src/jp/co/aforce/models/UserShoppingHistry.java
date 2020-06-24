package jp.co.aforce.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jp.co.aforce.util.DBUtil;

public class UserShoppingHistry {

	/**
	 * DBと購入履歴
	 */

	private Connection con_ = null;
	private PreparedStatement ps_ = null;

	public void Histry()
			throws SQLException {

		try {
			DBUtil.makeConnection();
			DBUtil.makeStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 商品IDを基にデータベースの在庫を更新
	 */
	public void updateItem(int id, int count)
			throws SQLException {
		/* 在庫から購入数を引く*/
		this.ps_ = this.con_.prepareStatement("update stock set count = count - ? where id = ?");

		// SQL文に数量を設定
		this.ps_.setInt(count, count);
		// SQL文に商品IDを設定
		this.ps_.setInt(id, id);
		// SQLを実行
		this.ps_.executeUpdate();
	}
}
