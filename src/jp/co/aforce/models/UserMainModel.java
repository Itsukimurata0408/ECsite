package jp.co.aforce.models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jp.co.aforce.beans.SelectProductBean;
import jp.co.aforce.util.DBUtil;

public class UserMainModel {




@SuppressWarnings({ "unused", "null" })
private void getDB(HttpServletRequest request) {
	try {



		DBUtil.makeConnection();
		DBUtil.makeStatement();


	        @SuppressWarnings("unused")
			String sql = "select * from product;";
	        ResultSet rs = null;

	        List<SelectProductBean> list = new ArrayList<SelectProductBean>();

	        while (rs.next()) {
	            list.add(new SelectProductBean());
	        }

	        request.setAttribute("product", list);

	        rs.close();

	}
	      catch (Exception e) {
	        e.printStackTrace();
	      } finally {

	      }
}
}