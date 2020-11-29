package chap09;

interface Database {
	public void getConnection();

	public String getDbInfo();
}

class OracleDatabase implements Database {
	boolean conn = false;

	@Override
	public void getConnection() {
		this.conn = true;
	}

	@Override
	public String getDbInfo() {
		String str = "";
		if (conn) {
			str = "오라클에 접속 되었습니다";
		} else {
			str = "오라클 접속에 실패하엿습니다.";
		}
		return str;
	}
}
	class MsDatabase implements Database {
		boolean conn = false;

		@Override
		public void getConnection() {
			this.conn = true;
		}

		@Override
		public String getDbInfo() {
			String str = "";
			if (conn) {
				str = "MS에 접속 되었습니다";
			} else {
				str = "MS 접속에 실패하엿습니다.";
			}
			return str;
		}

	}
public class Sample08 {

	public static void main(String[] args) {
		//Oracle에 접속합니다.
		Database db1 = new OracleDatabase();
		db1.getConnection();
		System.out.println(db1.getDbInfo());
		
		Database db2 = new MsDatabase();
		System.out.println(db2.getDbInfo());
		
		
	}

}
