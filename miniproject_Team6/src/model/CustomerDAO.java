

package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.CustomerDTO;
import model.util.DBUtil;

public class CustomerDAO {
	private static int cust_id = 1;
	
	// 회원가입
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

			if (result == 1) {
				return true;
			} else {
				return false;
			}

		} finally {
			DBUtil.close(con, pstmt);
		}

	}

	// 회원이 맞는지 확인하는 코드
	public static boolean checkCustomer(CustomerDTO si) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnection();

			pstmt = con
					.prepareStatement("select cust_name, cust_phone from customer where cust_name=? and cust_phone=?");
			pstmt.setString(1, si.getName());
			pstmt.setString(2, si.getPhone());

			rs = pstmt.executeQuery();

			if (rs.next()) {
				return true;
			}

		} finally {
			DBUtil.close(con, pstmt, rs);
		}
		return false;
	}

	//등급 가져오기
	public static String getGname(String gname) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String result = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select grade_name from grade where grade_id = (select grade_id from customer where cust_name = ?)");
			pstmt.setString(1, gname);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getString(1);
			}

		} finally {
			DBUtil.close(con, pstmt, rs);
		}
		return result;

	}

}
