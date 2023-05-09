/*
 *create table menu(
	menu_id int,
	menu_name varchar(50),
	price int,
	categories int,
	calorie int
	);
 */
 

package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.MenuDTO;
import model.util.DBUtil;

public class MenuDAO {
	
	//메뉴판 가져오기
	public static ArrayList<MenuDTO> getAllMenu() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<MenuDTO> list = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from menu ");
			rset = pstmt.executeQuery();

			list = new ArrayList<MenuDTO>();
			while (rset.next()) {
				list.add(
						new MenuDTO(rset.getInt(1), 
									rset.getString(2), 
									rset.getInt(3), 
									rset.getInt(4), 
									rset.getInt(5)));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}

	//가격 정보 가져오기
	public static int getPrice(String menuName) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		int price = 0;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select price from menu where menu_name = ?");
			pstmt.setString(1, menuName);

			rset = pstmt.executeQuery();

			if (rset.next()) {
				price = rset.getInt(1);
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return price;
	}

}
