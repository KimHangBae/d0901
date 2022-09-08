package d0901;

import java.sql.*;

public class student {

	public static void main(String[] args) {
		String jdbcDriver="com.mysql.cj.jdbc.Driver";
		String jdbcUrl="jdbc:mysql://localhost/yangjung?serverTimezone=UTC";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from student";
		try {
			Class.forName(jdbcDriver);
			conn=DriverManager.getConnection(jdbcUrl,"rlagusvy5567","1234");
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(7)+" ");
				System.out.println(rs.getString("birthday")+" ");//필드 번호 or 이름으로출력가능
			}
			System.out.println("database 연결 성공");
		}catch(Exception e) {
			System.out.println("database 연결 실패");
			e.printStackTrace();
		}
	}

}
