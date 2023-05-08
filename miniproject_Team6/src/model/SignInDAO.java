package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.CustomerDTO;
import model.util.DBUtil;

public class SignInDAO {
	private static int cust_id = 1;
	//회원가입
	public static boolean createCustomer(ArrayList<String> info) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into Customer values(?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, String.format("%05d", cust_id++));
			pstmt.setString(2, info.get(0));
			pstmt.setString(3, info.get(1));
			pstmt.setString(4, info.get(2));
			pstmt.setString(5, info.get(3));
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 10);

			int result = pstmt.executeUpdate();

			if (result == 7) {
				return true;
			}

		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}
	
}
