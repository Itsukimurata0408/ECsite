package jp.co.aforce.models;

import java.sql.ResultSet;

import jp.co.aforce.util.DBUtil;

public class LoginModel {


	/**
     * 入力されたデータがDBに上に存在するかどうかを調べる。
     *
     * @param username ユーザ名
     * @param password パスワード
     * @return ログイン成功=true, 失敗=false
     */
	//loginCheck関数
	public boolean loginCheck(String username, String password) {
		// 実行結果を格納する変数
		ResultSet rs = null;

		try {
			 // DBに接続するための手続
			//コネクション
			//スタートメント
			DBUtil.makeConnection();
			DBUtil.makeStatement();

			// SQLを実行
			//usernameとpasswordをDBから探すSQL文
			//カラム名と文字列を比較する際には＋を使用して文字列とカラム名をくっつける
			//`username`='"+username+"'
			String SQL = "SELECT * FROM `member` WHERE `username`='"+username+"' AND  `password`='"+password+"'" ;
			rs = DBUtil.execute(SQL);
		}catch(Exception e) {
			//エラーが発生した個所と原因を確認することができる
			e.printStackTrace();
		}finally {
			//コネクションを閉じる
			DBUtil.closeConnection();
		}
		return rs != null;
	}
}
