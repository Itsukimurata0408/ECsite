package jp.co.aforce.models;

import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jp.co.aforce.util.DBUtil;

public class RegisterModel {
	public boolean registerCheck(String name, String image,String category,int price,String detail ) {
		//実行結果を格納する変数
		ResultSet rs = null;

		try {
			LocalDateTime date = LocalDateTime.now();
			DateTimeFormatter dtformat =
					DateTimeFormatter.ofPattern("yyMMddHHmmss");
			String fdate = dtformat.format(date);
			String strdate = String.valueOf(fdate);
			System.out.println(strdate);
			//DB接続するための手続
			DBUtil.makeConnection();
			DBUtil.makeStatement();

			//SQLを実行
			String SQL = "INSERT INTO `product` (`product_id`, `name`, `image`, `category`, `price`,`detail`) " +
					"VALUES('A"+strdate+"','"+ name+"', '"+image+"', '"+category+"', '"+price+"','"+detail+"' );";
			rs = DBUtil.execute(SQL);
			DBUtil.closeConnection();

			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}

	}
}
