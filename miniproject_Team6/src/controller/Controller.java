package controller;

import java.sql.SQLException;

import model.MenuDAO;
import view.OutputView;

public class Controller {

	public static void getAllMenu() {
		try {
			
			//OutputView.getMenuListView(MenuDAO.getAllMenu());
		
		}catch (SQLException s) {
			s.printStackTrace();
			OutputView.showError("메뉴판 생성에 실패하였습니다.");
		}
		
		
	}
}
