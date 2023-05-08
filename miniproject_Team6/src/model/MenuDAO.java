package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.MenuDTO;
import model.util.DBUtil;

public class MenuDAO {

	public static ArrayList<MenuDTO> getAllMenu() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<MenuDTO> list = null;		
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from menu");
			rset = pstmt.executeQuery();
			
			list = new ArrayList<MenuDTO>();
			while (rset.next()) {
				list.add(new MenuDTO(rset.getInt(1),
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
	
	//public static int getPrice() throws SQLException{
		
	//}
	
}
