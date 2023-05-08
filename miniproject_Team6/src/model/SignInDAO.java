package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.dto.CustomerDTO;
import model.util.DBUtil;

public class SignInDAO {
	
	//회원가입
	public static boolean createCustomer(CustomerDTO si) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into Customer values(?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, si.getCust_id());
			pstmt.setString(2, si.getCust_name());
			pstmt.setString(3, si.getCust_phone());
			pstmt.setString(4, si.getCust_birth());
			pstmt.setString(5, si.getGender());
			pstmt.setInt(6, si.getAmount());
			pstmt.setInt(7, si.getGrade_id());

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
