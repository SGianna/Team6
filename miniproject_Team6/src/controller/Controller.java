package controller;

import java.sql.SQLException;

import model.SignInDAO;
import model.dto.CustomerDTO;
import view.EndView;
import model.MenuDAO;
import view.OutputView;

public class Controller {
	
	//회원가입시 회원 정보 저장하기
	public static boolean addCustomer(CustomerDTO signin) {
		boolean result = false;
		try {
			result = SignInDAO.createCustomer(signin);
			EndView.print("회원가입이 완료되었습니다.");
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("모든 프로젝트 저장시 에러 발생");
		}
		return result;
	}
	
	

public static void getAllMenu() {
		try {
			
			//OutputView.getMenuListView(MenuDAO.getAllMenu());
		
		}catch (SQLException s) {
			s.printStackTrace();
			OutputView.showError("메뉴판 생성에 실패하였습니다.");
		}
		
		
	}


}
