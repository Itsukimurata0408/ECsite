package jp.co.aforce.beans;

public class LoginBean {

	//文字列型のusername
		private String username;

	//文字列型のpassword
		private String password;

	//文字列型のpassword
		private String Emsg;




	//インスタンス化
		public LoginBean(){};

		//get
		public String  getUsername() {
			return username;
		}

		public String getPassword() {
			return password;
		}

		public String getEmsg() {
			return Emsg;
		}




		//set
		public void setUsername(String username) {
			this.username = username;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void setEmsg(String Emsg) {
			this.Emsg = Emsg;
		}






}
